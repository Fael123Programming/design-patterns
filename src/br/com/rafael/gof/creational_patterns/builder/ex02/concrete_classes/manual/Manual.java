package br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.manual;

public class Manual {
    private String aboutSeats, aboutEngine, aboutGPS, aboutTripComp;

    public String getAboutSeats() {
        return aboutSeats;
    }

    public void setAboutSeats(String aboutSeats) {
        this.aboutSeats = aboutSeats;
    }

    public String getAboutEngine() {
        return aboutEngine;
    }

    public void setAboutEngine(String aboutEngine) {
        this.aboutEngine = aboutEngine;
    }

    public String getAboutGPS() {
        return aboutGPS;
    }

    public void setAboutGPS(String aboutGPS) {
        this.aboutGPS = aboutGPS;
    }

    public String getAboutTripComp() {
        return aboutTripComp;
    }

    public void setAboutTripComp(String aboutTripComp) {
        this.aboutTripComp = aboutTripComp;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "aboutSeats='" + aboutSeats + '\'' +
                ", aboutEngine='" + aboutEngine + '\'' +
                ", aboutGPS='" + aboutGPS + '\'' +
                ", aboutTripComp='" + aboutTripComp + '\'' +
                '}';
    }
}
