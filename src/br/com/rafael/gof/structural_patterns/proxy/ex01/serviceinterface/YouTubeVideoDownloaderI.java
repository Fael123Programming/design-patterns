package br.com.rafael.gof.structural_patterns.proxy.ex01.serviceinterface;

import java.util.*;

// The interface of a remote service.

public interface YouTubeVideoDownloaderI {
    /**
     * It returns a list with all URLs of all videos produced by a given YouTube channel.
     * @param channelId the id of the desired YouTube channel.
     * @return a list with all urls of all videos produced by this YouTube channel.
     */
    List<String> listVideos(String channelId);

    String getVideoInfo(String videoURL);

    void downloadVideo(String videoURL);
}
