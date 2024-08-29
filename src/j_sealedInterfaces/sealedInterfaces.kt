package j_sealedInterfaces

fun main(args: Array<String>) {
    val result = KotlinDownloader.download("test")
    val result2 = KotlinDownloader.download("secret")

    handleResult(result)
    handleResult(result2)
}

fun handleResult(result: DownloadResultKotlin) {
    when (result) {
        is DownloadResultKotlin.Success -> println(result.data)
        is DownloadResultKotlin.Error -> when (result.error) {
            is DownloadResultError.FileNotFound -> println(result.error)
            is DownloadResultError.DownloadInterrupted -> println(result.error.message)
            is DownloadResultError.UnknownError -> println(result.error.message)
        }
    }
}
