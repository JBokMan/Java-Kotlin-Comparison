package j_sealedInterfaces;

public class JavaDownloader {
    static DownloadResultJava download(String url) {
        if (url.contains("secret")) {
            return new DownloadResultJava.Error.UnknownError("unknown error");
        } else {
            return new DownloadResultJava.Success(new java.util.ArrayList<>());
        }
    }
}
