package org.example.sandbox.aggregation;

public class Widget {

    private String name;

    public Widget() {
        this.name = "";
    }

    public Widget(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Widget{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
