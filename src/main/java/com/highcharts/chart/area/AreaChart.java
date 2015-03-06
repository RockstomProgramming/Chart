package com.highcharts.chart.area;

import com.google.gson.annotations.Expose;
import com.highcharts.chart.ComplexChart;
import com.highcharts.chart.area.opt.AreaOptions;
import com.highcharts.chart.area.opt.XAxis;
import com.highcharts.chart.area.opt.YAxis;
import com.highcharts.opt.PlotOptions;

/**
 * Arquivo: AreaChart.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class AreaChart extends ComplexChart {

	@Expose private XAxis xAxis;
	@Expose private YAxis yAxis;

	public AreaChart() {
		super();
		getChart().setType(AREA);
		setPlotOptions(new PlotOptions());
		getPlotOptions().setArea(new AreaOptions());
		setxAxis(new XAxis());
		setyAxis(new YAxis());
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
