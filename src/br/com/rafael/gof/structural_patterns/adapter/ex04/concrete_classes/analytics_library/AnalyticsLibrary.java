package br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.analytics_library;

import br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.data_formats.JSONObject;

public class AnalyticsLibrary {
    private JSONObject data;
    private String result;

    public AnalyticsLibrary(JSONObject data) {
        this.data = data;
    }

    public AnalyticsLibrary(){}

    public void prepare() {
        //Prepare it, analysing if there is something wrong with the data...
    }

    public void analyze() {
        //The analyzing process itself...
        result = "important results of the analyzing process";
    }

    public String getResult() {
        return result;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
