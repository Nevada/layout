package com.nevada.layout.gwt.scaffold.place;

import com.google.gwt.valuestore.shared.Record;

/**
 * Place in an app that lists {@link com.google.gwt.valuestore.shared.ValueStore ValueStore} records of a particular type.
 */
public class ApplicationListPlace extends ApplicationPlace {
	private final Class<? extends Record> type;

	/**
	 * @param key the schema of the entities at this place
	 */
	public ApplicationListPlace(Class<? extends Record> type) {
		assert null != type;
		this.type = type;
	}

	@Override
	public void accept(ApplicationPlaceProcessor visitor) {
		visitor.process(this);
	}

	@Override
	public <T> T acceptFilter(ApplicationPlaceFilter<T> filter) {
		return filter.filter(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ApplicationListPlace other = (ApplicationListPlace) obj;
		if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}

	public Class<? extends Record> getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
}