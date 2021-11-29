package br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.data_formats;

//In our example, our application only works with XML files.
//The analytics library we are introducing only handles JSON files, so
//we need an adapter object to make the bridge between these two formats.

public class XMLObject {
    private final StringBuilder representation;

    public XMLObject(){
        representation = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
    }

    public String insertNewProperty(String property, String value) {
        StringBuilder local = new StringBuilder();
        local.append("<").append(property).append(">").append("\n");
        local.append("\t").append(value).append("\n");
        local.append("</").append(property).append(">").append("\n");
        representation.append(local);
        return local.toString();
    }

    public String getRepresentation(){
        return representation.toString();
    }

}
