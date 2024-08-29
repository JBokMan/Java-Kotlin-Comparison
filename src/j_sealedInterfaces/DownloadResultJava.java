package j_sealedInterfaces;

import java.util.ArrayList;

public sealed interface DownloadResultJava permits DownloadResultJava.Error, DownloadResultJava.Success {

    sealed interface Error extends DownloadResultJava
            permits Error.FileNotFound, Error.DownloadInterrupted, Error.UnknownError {

        record FileNotFound() implements Error {
        }

        record DownloadInterrupted(String message) implements Error {
        }

        record UnknownError(String message) implements Error {
        }
    }

    record Success(ArrayList<Byte> data) implements DownloadResultJava {
    }
}
