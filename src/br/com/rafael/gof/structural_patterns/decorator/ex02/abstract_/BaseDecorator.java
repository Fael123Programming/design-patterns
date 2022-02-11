package br.com.rafael.gof.structural_patterns.decorator.ex02.abstract_;

public abstract class BaseDecorator implements Component {
//  The base decorator delegates all real work to the wrapped object!

    private Component component;

    public BaseDecorator(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return this.component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        this.component.execute();
    }
}
