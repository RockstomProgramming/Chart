package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: States.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
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
