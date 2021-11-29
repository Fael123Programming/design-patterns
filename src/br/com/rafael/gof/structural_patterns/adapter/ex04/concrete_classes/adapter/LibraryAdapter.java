package br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.adapter;

import br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.analytics_library.AnalyticsLibrary;
import br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.data_formats.*;
import br.com.rafael.gof.structural_patterns.adapter.ex04.interfaces.DataAnalyzer;

public class LibraryAdapter implements DataAnalyzer {
    private AnalyticsLibrary serviceObject; //Using object composition...

    public LibraryAdapter() {
        this.serviceObject = new AnalyticsLibrary();
    }

    public AnalyticsLibrary getServiceObject() {
        return serviceObject;
    }

    public void setServiceObject(AnalyticsLibrary serviceObject) {
        this.serviceObject = serviceObject;
    }

    private JSONObject parseToJSON(XMLObject xmlObject) {
//        It does the conversion process from XML to JSON.
        JSONObject json = new JSONObject();
        return json;
    }

    @Override
    public String process(XMLObject data) {
        this.serviceObject.setData(this.parseToJSON(data));
        this.serviceObject.prepare();
        this.serviceObject.analyze();
        return this.serviceObject.getResult();
    }
}
