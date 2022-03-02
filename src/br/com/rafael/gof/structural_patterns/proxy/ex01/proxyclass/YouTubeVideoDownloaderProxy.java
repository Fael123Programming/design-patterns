package br.com.rafael.gof.structural_patterns.proxy.ex01.proxyclass;

import br.com.rafael.gof.structural_patterns.proxy.ex01.concreteserviceclass.YouTubeVideoDownloader;
import br.com.rafael.gof.structural_patterns.proxy.ex01.serviceinterface.YouTubeVideoDownloaderI;
import java.util.*;

public class YouTubeVideoDownloaderProxy implements YouTubeVideoDownloaderI {
    private List<String> listOfVideos; //URLs of all videos of lastChannelSearched.
    private String lastChannelSearched, lastDownloadedVideo; //Last channel searched.
    private final TreeMap<String, String> infoOfVideos; //A pair of values: video URL and its info.
    private final YouTubeVideoDownloader serviceObject; //Not accessible outside this class.

    {
        this.listOfVideos = new ArrayList<>();
        this.infoOfVideos = new TreeMap<>();
    }

    public YouTubeVideoDownloaderProxy(YouTubeVideoDownloader serviceObject) {
        this.serviceObject = serviceObject;
    }

    @Override
    public List<String> listVideos(String channelId) {
        if (channelId.equals(this.lastChannelSearched))
            return this.listOfVideos;
        //Do all the business logic to get this stuff from
        //YouTube API and return it.
        this.lastChannelSearched = channelId;
        this.listOfVideos = this.serviceObject.listVideos(channelId);
        return this.listOfVideos;
    }

    @Override
    public String getVideoInfo(String videoURL) {
        String videoInfo = this.infoOfVideos.get(videoURL);
        if (videoInfo == null) {
            //Query YouTube API and get the info.
            videoInfo = this.serviceObject.getVideoInfo(videoURL); //result of the query.
            if (this.infoOfVideos.size() == 10)
                this.infoOfVideos.remove(this.infoOfVideos.firstKey()); //Make one clean space to add a new cache.
            this.infoOfVideos.put(videoURL, videoInfo);
        }
        return videoInfo;
    }

    @Override
    public void downloadVideo(String videoURL) {
        if (videoURL.equals(this.lastDownloadedVideo))
            System.out.println("This video is already in your storage!");
        this.serviceObject.downloadVideo(videoURL);
        this.lastDownloadedVideo = videoURL;
    }
}
