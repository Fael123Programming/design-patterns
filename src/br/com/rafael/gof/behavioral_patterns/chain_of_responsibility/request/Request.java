package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.request;

public class Request {
    private char type;
    public static final char A = 'A', B = 'B', C = 'C';

    public Request(char type) {
        if (this.isInvalidType(type))
            throw new IllegalArgumentException("type " + type + " does not match any valid type");
        this.type = type;
    }

    public boolean isInvalidType(char type) {
        type = Character.toUpperCase(type);
        return type != 'A' && type != 'B' && type != 'C';
    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        if (this.isInvalidType(type))
            throw new IllegalArgumentException("type " + type + " does not match any valid type");
        this.type = type;
    }

    @Override
    public String toString() {
        return "a request of type " + this.getType();
    }
}
