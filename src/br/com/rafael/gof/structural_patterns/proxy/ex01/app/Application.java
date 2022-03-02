package br.com.rafael.gof.structural_patterns.proxy.ex01.app;

import br.com.rafael.gof.structural_patterns.proxy.ex01.concreteserviceclass.YouTubeVideoDownloader;
import br.com.rafael.gof.structural_patterns.proxy.ex01.proxyclass.YouTubeVideoDownloaderProxy;
import br.com.rafael.gof.structural_patterns.proxy.ex01.youtubemanager.YouTubeManager;

public class Application {
    public void playVideo(String videoURL, String channelId) {
        YouTubeManager ytManager = new YouTubeManager(new YouTubeVideoDownloaderProxy(new YouTubeVideoDownloader()));
        ytManager.reactOnUserInput(videoURL, channelId);
    }
}
