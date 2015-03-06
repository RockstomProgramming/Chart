package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: Hover.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class Hover {

	@Expose private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
