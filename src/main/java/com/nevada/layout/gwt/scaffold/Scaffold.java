package com.nevada.layout.gwt.scaffold;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class Scaffold implements EntryPoint {

	public void onModuleLoad() {
		
		/* Hide the loading message */
		Element loading = Document.get().getElementById("loading");
		loading.getParentElement().removeChild(loading);
		
		/* Load Layout */
		Layout layout = new Layout();
		RootLayoutPanel.get().add(layout);
	}

}
