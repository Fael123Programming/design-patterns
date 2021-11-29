package br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.client_code;

import br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.adapter.LibraryAdapter;
import br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.data_formats.XMLObject;
import br.com.rafael.gof.structural_patterns.adapter.ex04.interfaces.DataAnalyzer;

//Creating an adapter from XML data sets to JSON data sets.

public class ClientCode {
    public static void main(String[] args) {
        LibraryAdapter adapter = new LibraryAdapter();
        analyzeData(adapter);
    }

    private static void analyzeData(DataAnalyzer analyzer) {
        System.out.println(analyzer.process(loadData()));
    }

    private static XMLObject loadData(){
//        Load the data to be analyzed from somewhere...
        XMLObject data = new XMLObject();
        data.insertNewProperty("data", "All caught data");
        return data;
    }
}
