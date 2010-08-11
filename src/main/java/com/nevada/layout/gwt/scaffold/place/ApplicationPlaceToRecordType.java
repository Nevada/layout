package com.nevada.layout.gwt.scaffold.place;

import com.google.gwt.valuestore.shared.Record;
import com.nevada.layout.gwt.scaffold.place.ApplicationPlaceFilter;
import com.nevada.layout.gwt.scaffold.place.ApplicationListPlace;

/**
 * Filters an {@link ApplicationPlace} to the corresponding record type.
 */
public final class ApplicationPlaceToRecordType implements ApplicationPlaceFilter<Class<? extends Record>> {


	public Class<? extends Record> filter(ApplicationListPlace place) {
		return place.getType();
	}
}