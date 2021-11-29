package br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.data_formats;

public class JSONObject {
    private StringBuilder representation;

    public JSONObject() {
        representation = new StringBuilder();
    }

//    Here come similar methods as we made at XMLObject.
//    Of course, this is quite simple and only to demonstrate the pattern.
}
