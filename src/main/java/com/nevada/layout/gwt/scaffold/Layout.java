package com.nevada.layout.gwt.scaffold;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Layout extends Composite {

	private static LayoutUiBinder uiBinder = GWT.create(LayoutUiBinder.class);

	interface LayoutUiBinder extends UiBinder<Widget, Layout> {
	}

	public Layout() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
