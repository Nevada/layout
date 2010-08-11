package com.nevada.layout.gwt.scaffold;

import com.google.gwt.app.place.Activity;
import com.google.gwt.app.place.ActivityMapper;
import com.google.gwt.app.place.PlaceController;
import com.nevada.layout.gwt.scaffold.place.ApplicationPlace;
import com.nevada.layout.gwt.scaffold.place.ApplicationListPlace;
import com.nevada.layout.gwt.scaffold.place.ApplicationRecordPlace;
import com.nevada.layout.gwt.request.ApplicationRequestFactory;
import com.nevada.layout.gwt.scaffold.place.ApplicationPlaceFilter;

/**
 * Finds the activity to run for a particular {@link ScaffoldPlace}.
 */
public final class ScaffoldMobileActivities implements ActivityMapper<ApplicationPlace> {
	private final ActivityMapper<ApplicationListPlace> listActivitiesBuilder;

	/**
	 * @param listActivitiesBuilder
	 * @param requestFactory
	 * @param placeController
	 */
	public ScaffoldMobileActivities(ActivityMapper<ApplicationListPlace> listActivitiesBuilder, ApplicationRequestFactory requestFactory, PlaceController<ApplicationPlace> placeController) {
    	this.listActivitiesBuilder = listActivitiesBuilder;
	}

	public Activity getActivity(ApplicationPlace place) {
		return place.acceptFilter(new ApplicationPlaceFilter<Activity>() {
			public Activity filter(ApplicationListPlace place) {
				return listActivitiesBuilder.getActivity(place);
			}
		});
	}
}
