package com.highcharts.opt;

import com.google.gson.annotations.Expose;

public class LabelOptions {

	@Expose private static final String DEFAULT_FORMAT = "<b>{point.name}</b>: {point.percentage:.1f} %";
	@Expose private boolean enabled = true;
	@Expose private String format = DEFAULT_FORMAT;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}
