package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;

public class Hover {

	@Expose private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
