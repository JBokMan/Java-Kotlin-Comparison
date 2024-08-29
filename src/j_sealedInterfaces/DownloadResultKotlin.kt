package j_sealedInterfaces

sealed interface DownloadResultKotlin {
    data class Success(val data: ByteArray) : DownloadResultKotlin

    data class Error(val error: DownloadResultError) : DownloadResultKotlin
}

sealed interface DownloadResultError {
    data object FileNotFound : DownloadResultError

    data class DownloadInterrupted(val message: String) : DownloadResultError

    data class UnknownError(val message: String) : DownloadResultError
}
