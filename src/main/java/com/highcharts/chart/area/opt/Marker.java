package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;

public class Marker {

	@Expose private boolean enabled;
	@Expose private String symbol = "circle";
	@Expose private int radius = 2;
	@Expose private States states;
	@Expose private Integer lineWidth;
	@Expose private String lineColor;
	
	public Marker() {
		setStates(new States());
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Integer getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Integer lineWidth) {
		this.lineWidth = lineWidth;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
