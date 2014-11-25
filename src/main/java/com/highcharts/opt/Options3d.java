package com.highcharts.opt;

import com.google.gson.annotations.Expose;

public class Options3d {

	@Expose private boolean enabled;
	@Expose private int alpha = 45;
	@Expose private int beta = 0;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	public int getBeta() {
		return beta;
	}

	public void setBeta(int beta) {
		this.beta = beta;
	}
}
