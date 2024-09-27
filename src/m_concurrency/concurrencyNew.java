import m_concurrency.WeatherData;
import java.util.ArrayList;
import java.util.List;
import static m_concurrency.ConcurrencyKt.parseWeatherData;

void main() {
    List<String> cities = List.of("New York", "London", "Paris", "Rome", "Madrid", "Vienna", "Moscow");

    // VirtualThread to print every second
    Thread timerThread = Thread.ofVirtual().start(() -> {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(i + " seconds passed");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    updateWeatherUI(cities);

    try {
        timerThread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

public static class WeatherFetcher implements Runnable {
    private final String location;
    private final WeatherDataListener listener;

    public WeatherFetcher(String location, WeatherDataListener listener) {
        this.location = location;
        this.listener = listener;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String data = "Weather data for " + location;
        WeatherData weatherData = parseWeatherData(data);
        listener.onDataFetched(weatherData);
    }
}

public interface WeatherDataListener {
    void onDataFetched(WeatherData data);
}

public void updateWeatherUI(List<String> locations) {
    List<Thread> threads = new ArrayList<>();
    List<WeatherData> weatherDataList = new ArrayList<>();

    for (String location : locations) {
        WeatherFetcher fetcher = new WeatherFetcher(location, data -> {
            synchronized (weatherDataList) {
                weatherDataList.add(data);
                if (weatherDataList.size() == locations.size()) {
                    System.out.println();
                    System.out.println("weatherDataList = " + weatherDataList);
                    System.out.println();
                }
            }
        });
        Thread thread = Thread.ofVirtual().start(fetcher);
        threads.add(thread);
    }

    for (Thread thread : threads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}