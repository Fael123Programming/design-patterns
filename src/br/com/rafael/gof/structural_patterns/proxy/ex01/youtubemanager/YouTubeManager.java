package br.com.rafael.gof.structural_patterns.proxy.ex01.youtubemanager;

import br.com.rafael.gof.structural_patterns.proxy.ex01.serviceinterface.YouTubeVideoDownloaderI;
import java.util.List;

public class YouTubeManager {
    private final YouTubeVideoDownloaderI serviceObject;
//  Actually, the object for this attribute will be a proxy instead of real resource object!

    public YouTubeManager(YouTubeVideoDownloaderI serviceObject) {
        this.serviceObject = serviceObject;
    }

    public void renderVideoPage(String videoURL) {
        String info = this.serviceObject.getVideoInfo(videoURL);
        //Render the video page.
    }

    public void renderListPanel(String channelId) {
        List<String> videoList = this.serviceObject.listVideos(channelId);
        //Render the list panel.
    }

    public void reactOnUserInput(String videoURL, String channelId) {
        this.renderVideoPage(videoURL);
        this.renderListPanel(channelId);
    }
}
