package com.highcharts.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.chart.area.opt.AreaOptions;
import com.highcharts.chart.column.opt.ColumnOptions;
import com.highcharts.chart.pie.opt.PieOptions;

/**
 * Arquivo: PlotOptions.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class PlotOptions {

	@Expose private PieOptions pie;
	@Expose private AreaOptions area;
	@Expose private ColumnOptions column;
	private boolean isGradient;

	public PieOptions getPie() {
		return pie;
	}

	public void setPie(PieOptions pie) {
		this.pie = pie;
	}

	public boolean isGradient() {
		return isGradient;
	}

	public void setGradient(boolean isGradient) {
		this.isGradient = isGradient;
	}

	public AreaOptions getArea() {
		return area;
	}

	public void setArea(AreaOptions area) {
		this.area = area;
	}

	public ColumnOptions getColumn() {
		return column;
	}

	public void setColumn(ColumnOptions column) {
		this.column = column;
	}
}
