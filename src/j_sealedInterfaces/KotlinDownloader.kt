package j_sealedInterfaces

object KotlinDownloader {
    fun download(url: String): DownloadResultKotlin {
        return if (url.contains("secret")) {
            DownloadResultKotlin.Error(DownloadResultError.UnknownError("unknown error"))
        } else {
            DownloadResultKotlin.Success(byteArrayOf())
        }
    }
}
