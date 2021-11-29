package br.com.rafael.gof.structural_patterns.adapter.ex04.interfaces;

import br.com.rafael.gof.structural_patterns.adapter.ex04.concrete_classes.data_formats.XMLObject;

public interface DataAnalyzer {
    String process(XMLObject data);
}
