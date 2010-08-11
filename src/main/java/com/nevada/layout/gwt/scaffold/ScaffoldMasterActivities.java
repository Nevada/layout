package com.nevada.layout.gwt.scaffold;

import com.google.gwt.app.place.AbstractRecordListActivity;
import com.google.gwt.app.place.Activity;
import com.google.gwt.app.place.ActivityMapper;
import com.google.gwt.valuestore.shared.Record;
import com.nevada.layout.gwt.scaffold.place.ApplicationPlace;
import com.nevada.layout.gwt.scaffold.place.ApplicationListPlace;
import com.nevada.layout.gwt.scaffold.place.ApplicationPlaceToRecordType;
import com.nevada.layout.gwt.scaffold.place.ApplicationRecordPlace;
import com.nevada.layout.gwt.ui.ListActivitiesMapper;

/**
 * Finds the activity to run for a particular {@link ScaffoldPlace} in the top
 * half of the {@link ScaffoldShell}.
 */
public final class ScaffoldMasterActivities implements ActivityMapper<ApplicationPlace> {
	private final ListActivitiesMapper listActivities;

	private AbstractRecordListActivity<?> last = null;
	private Class<? extends Record> lastType = null;

	public ScaffoldMasterActivities(ListActivitiesMapper listActivities) {
		this.listActivities = listActivities;
	}

	public Activity getActivity(ApplicationPlace place) {
		if (place instanceof ApplicationListPlace) {
			ApplicationListPlace listPlace = (ApplicationListPlace) place;
			last = listActivities.getActivity(listPlace);
			lastType = listPlace.getType();
		}

		if (last != null && place instanceof ApplicationRecordPlace) {
			Class<? extends Record> thisType = place.acceptFilter(new ApplicationPlaceToRecordType());
			if (lastType.equals(thisType)) {
				last.select(((ApplicationRecordPlace) place).getId());
			}
		}
		return last;
	}
}
