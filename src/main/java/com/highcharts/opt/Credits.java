package com.highcharts.opt;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: Credits.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class Credits {

	@Expose private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
