package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: AreaOptions.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class AreaOptions {

	@Expose private Marker marker;
	@Expose private Number pointStart;
	@Expose private String stacking;
	@Expose private String lineColor;
	@Expose private Integer lineWidth;
	@Expose private Number fillOpacity;

	public AreaOptions() {
		setMarker(new Marker());
	}

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	public Number getPointStart() {
		return pointStart;
	}

	public void setPointStart(Number pointStart) {
		this.pointStart = pointStart;
	}

	public String getStacking() {
		return stacking;
	}

	public void setStacking(String stacking) {
		this.stacking = stacking;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public Integer getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Integer lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Number getFillOpacity() {
		return fillOpacity;
	}

	public void setFillOpacity(Number fillOpacity) {
		this.fillOpacity = fillOpacity;
	}
}
