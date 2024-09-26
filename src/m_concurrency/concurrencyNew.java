import m_concurrency.WeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import static m_concurrency.ConcurrencyKt.parseWeatherData;

void main() {
    List<String> cities = List.of("New York", "London", "Paris", "Rome", "Madrid", "Vienna", "Moscow");

    // CompletableFuture to print every second
    CompletableFuture<Void> timerFuture = CompletableFuture.runAsync(() -> {
        for (int i = 1; i <= 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(STR."\{i} seconds passed");
        }
    });

    updateWeatherUI(cities);

    try {
        timerFuture.get();
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    }
}

public static class WeatherFetcher {
    private final String location;
    private final WeatherDataListener listener;

    public WeatherFetcher(String location, WeatherDataListener listener) {
        this.location = location;
        this.listener = listener;
    }

    public CompletableFuture<Void> fetch() {
        return CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String data = STR."Weather data for \{location}";
            WeatherData weatherData = parseWeatherData(data);
            listener.onDataFetched(weatherData);
        });
    }
}

public interface WeatherDataListener {
    void onDataFetched(WeatherData data);
}

public void updateWeatherUI(List<String> locations) {
    List<CompletableFuture<Void>> futures = new ArrayList<>();
    List<WeatherData> weatherDataList = new ArrayList<>();

    for (String location : locations) {
        WeatherFetcher fetcher = new WeatherFetcher(location, data -> {
            synchronized (weatherDataList) {
                weatherDataList.add(data);
                if (weatherDataList.size() == locations.size()) {
                    System.out.println();
                    System.out.println(STR."weatherDataList = \{weatherDataList}");
                    System.out.println();
                }
            }
        });
        futures.add(fetcher.fetch());
    }

    CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    try {
        allOf.get();
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    }
}