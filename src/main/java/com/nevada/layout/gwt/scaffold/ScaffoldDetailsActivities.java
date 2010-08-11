package com.nevada.layout.gwt.scaffold;

import com.google.gwt.app.place.Activity;
import com.google.gwt.app.place.ActivityMapper;
import com.google.gwt.app.place.PlaceController;
import com.nevada.layout.gwt.scaffold.place.ApplicationPlace;
import com.nevada.layout.gwt.scaffold.place.ApplicationRecordPlace;
import com.nevada.layout.gwt.request.ApplicationRequestFactory;
import com.nevada.layout.gwt.scaffold.place.BasePlaceFilter;

/**
 * Finds the activity to run for a particular {@link ScaffoldPlace} in the bottom
 * half of the {@link ScaffoldShell}.
 */
public final class ScaffoldDetailsActivities implements ActivityMapper<ApplicationPlace> {
	
	public ScaffoldDetailsActivities(ApplicationRequestFactory requestFactory, PlaceController<ApplicationPlace> placeController) {
	}

	public Activity getActivity(ApplicationPlace place) {
		return place.acceptFilter(new BasePlaceFilter<Activity>(null) {
		});
	}
}
