package com.highcharts;

import com.google.gson.annotations.Expose;

public class Title {
	
	@Expose private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
