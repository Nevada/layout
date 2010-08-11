package com.nevada.layout.gwt.ui;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.valuestore.shared.Record;
import com.nevada.layout.gwt.scaffold.place.ApplicationListPlace;
public class ListPlaceRenderer extends AbstractRenderer<ApplicationListPlace> {
    public String render(ApplicationListPlace object) {
        Class<? extends Record> type = object.getType();
        throw new IllegalArgumentException("Cannot render unknown type " + object);
    }
}
