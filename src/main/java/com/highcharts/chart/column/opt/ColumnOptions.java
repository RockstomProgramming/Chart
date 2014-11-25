package com.highcharts.chart.column.opt;

import com.google.gson.annotations.Expose;

public class ColumnOptions {

	@Expose private double pointPadding = 0.2;
	@Expose private int borderWidth;

	public double getPointPadding() {
		return pointPadding;
	}

	public void setPointPadding(double pointPadding) {
		this.pointPadding = pointPadding;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

}
