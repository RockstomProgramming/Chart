package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;

public class States {
	
	@Expose private Hover hover;

	public States() {
		setHover(new Hover());
	}
	
	public Hover getHover() {
		return hover;
	}

	public void setHover(Hover hover) {
		this.hover = hover;
	}
}
