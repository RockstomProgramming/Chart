package com.highcharts.chart.column;

import com.google.gson.annotations.Expose;
import com.highcharts.chart.ComplexChart;
import com.highcharts.chart.column.opt.ColumnOptions;
import com.highcharts.chart.column.opt.XAxis;
import com.highcharts.chart.column.opt.YAxis;
import com.highcharts.opt.PlotOptions;

/**
 * Arquivo: ColumnChart.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class ColumnChart extends ComplexChart {

	@Expose private XAxis xAxis;
	@Expose private YAxis yAxis;

	public ColumnChart() {
		setxAxis(new XAxis());
		setyAxis(new YAxis());
		setPlotOptions(new PlotOptions());
		getChart().setType(COLUMN);
		getPlotOptions().setColumn(new ColumnOptions());
	}

	public XAxis getxAxis() {
		return xAxis;
	}

	public void setxAxis(XAxis xAxis) {
		this.xAxis = xAxis;
	}

	public YAxis getyAxis() {
		return yAxis;
	}

	public void setyAxis(YAxis yAxis) {
		this.yAxis = yAxis;
	}
}
