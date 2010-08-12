package com.nevada.layout.gwt.scaffold;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Layout extends Composite {

	private static LayoutUiBinder uiBinder = GWT.create(LayoutUiBinder.class);
	
	@UiField DeckPanel main;
	@UiField Button om;
	@UiField Button hur;

	About about = new About();
	How how = new How();
	
	interface LayoutUiBinder extends UiBinder<Widget, Layout> {
	}

	public Layout() {
		initWidget(uiBinder.createAndBindUi(this));
		
		main.add(about);
		main.add(how);
		main.showWidget(0);
	}
	
	@UiHandler("om")
	void onOmClicked(ClickEvent event) {
		main.showWidget(0);
		//main.remove(how);
		//main.add(about);
		
	}
	
	@UiHandler("hur")
	void onHurClicked(ClickEvent event) {
		main.showWidget(1);
		//main.remove(about);
		//main.add(how);
	}

}
