package org.example.sandbox.aggregation;

public class Driver {

    public static void main(String[] args) {

        // Aggregation example
        WidgetProcessor example = new WidgetProcessor();
        for(int x = 1; x <= 10; x++) {
            example.addWidget(new Widget(Integer.valueOf(x).toString()));
        }
        example.processWidgets();
    }
}
