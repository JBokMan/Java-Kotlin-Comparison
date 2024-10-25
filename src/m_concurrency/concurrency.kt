package m_concurrency
//"org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.9.0"

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext


suspend fun foo() {
    fetchWeatherData("Berlin")
}

fun main(args: Array<String>) = runBlocking {
    val cities =
        listOf("Berlin", "Tokyo", "New York", "London", "Paris", "Rome", "Madrid", "Vienna", "Moscow", "Beijing")


    fetchWeatherData("Berlin")

    val job = CoroutineScope(Dispatchers.Default).launch {

        //val deferredData1 = CoroutineScope(Dispatchers.Default).async { fetchWeatherData("Berlin") }
        //println(deferredData1.await())

        val deferredData = cities.map { async { fetchWeatherData(it) } }

        val weatherData = deferredData.awaitAll()
        println()
        println(weatherData)
        println()
    }

    for (i in 1..10) {
        delay(1000)
        println("$i seconds passed")
    }

    job.join()
}

suspend fun fetchWeatherData(location: String): WeatherData {
    val data = withContext(Dispatchers.IO) {
        // make a network request to fetch weather data for the given location
        delay(5000)
        "Weather data for $location"
    }
    return parseWeatherData(data)
}

fun parseWeatherData(data: String): WeatherData {
    return WeatherData(data)
}