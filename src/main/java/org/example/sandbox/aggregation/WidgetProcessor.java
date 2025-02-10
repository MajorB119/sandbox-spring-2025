package org.example.sandbox.aggregation;

import java.util.ArrayList;
import java.util.List;

public class WidgetProcessor {

    // These widgets are composed in a pure composition relationship
    Widget a;
    Widget b;
    Widget c;

    private List<Widget> widgets;

    public WidgetProcessor() {

        // pure composition
        a = new Widget();
        b = new Widget();
        c = new Widget();
        widgets = new ArrayList<>();
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
    }

    public void processWidgets() {
        for (Widget widget : widgets) {
            System.out.println("Processing widget: " + widget);
        }
    }
}
