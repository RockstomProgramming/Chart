package com.highcharts;

import com.google.gson.annotations.Expose;
import com.highcharts.opt.Options3d;

public class Chart {

	@Expose private String plotBackgroundColor;
	@Expose private int plotBorderWidth = 0;
	@Expose private boolean plotShadow = false;
	@Expose private Options3d options3d;
	@Expose private String type;
	@Expose private Integer spacingBottom;
	
	public Chart() {
		setOptions3d(new Options3d());
	}
	
	public String getPlotBackgroundColor() {
		return plotBackgroundColor;
	}

	public void setPlotBackgroundColor(String plotBackgroundColor) {
		this.plotBackgroundColor = plotBackgroundColor;
	}

	public int getPlotBorderWidth() {
		return plotBorderWidth;
	}

	public void setPlotBorderWidth(int plotBorderWidth) {
		this.plotBorderWidth = plotBorderWidth;
	}

	public boolean isPlotShadow() {
		return plotShadow;
	}

	public void setPlotShadow(boolean plotShadow) {
		this.plotShadow = plotShadow;
	}

	public Options3d getOptions3d() {
		return options3d;
	}

	public void setOptions3d(Options3d options3d) {
		this.options3d = options3d;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSpacingBottom() {
		return spacingBottom;
	}

	public void setSpacingBottom(Integer spacingBottom) {
		this.spacingBottom = spacingBottom;
	}
}
