package com.highcharts.opt;

import com.google.gson.annotations.Expose;

public class Credits {
	
	@Expose private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
