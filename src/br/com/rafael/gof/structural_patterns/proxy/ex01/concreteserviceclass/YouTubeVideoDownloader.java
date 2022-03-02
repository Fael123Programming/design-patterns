package br.com.rafael.gof.structural_patterns.proxy.ex01.concreteserviceclass;

import br.com.rafael.gof.structural_patterns.proxy.ex01.serviceinterface.YouTubeVideoDownloaderI;
import java.util.*;

// The concrete implementation of a service connector. Methods
// of this class can request information from YouTube. The speed
// of the request depends on a user's internet connection as
// well as YouTube's. The application will slow down if a lot of
// requests are fired at the same time, even if they all request
// the same information.

public class YouTubeVideoDownloader implements YouTubeVideoDownloaderI {
    @Override
    public List<String> listVideos(String channelId) {
        return new ArrayList<>();
    }

    @Override
    public String getVideoInfo(String videoURL) {
        return "";
    }

    @Override
    public void downloadVideo(String videoURL) {

    }
}
