package j_sealedInterfaces;

public class sealedInterfaces {
    public static void main(String[] args) {
        var result = JavaDownloader.download("test");
        var result2 = JavaDownloader.download("secret");

        handleResult(result);
        handleResult(result2);
    }

    private static void handleResult(DownloadResultJava result) {
        switch (result) {
            case DownloadResultJava.Success successResult -> System.out.println(successResult.data());
            case DownloadResultJava.Error.FileNotFound fileNotFoundResult -> System.out.println(fileNotFoundResult);
            case DownloadResultJava.Error.DownloadInterrupted downloadInterruptedResult ->
                    System.out.println(downloadInterruptedResult.message());
            case DownloadResultJava.Error.UnknownError unknownErrorResult ->
                    System.out.println(unknownErrorResult.message());
        }
    }

    private static void handleResult2(DownloadResultJava result) {
        switch (result) {
            case DownloadResultJava.Success successResult -> System.out.println(successResult.data());
            case DownloadResultJava.Error errorResult -> {
                switch (errorResult) {
                    case DownloadResultJava.Error.FileNotFound fileNotFoundResult ->
                            System.out.println(fileNotFoundResult);
                    case DownloadResultJava.Error.DownloadInterrupted downloadInterruptedResult ->
                            System.out.println(downloadInterruptedResult.message());
                    case DownloadResultJava.Error.UnknownError unknownErrorResult ->
                            System.out.println(unknownErrorResult.message());
                }
            }
        }
    }
}
