package com.highcharts.chart.pie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.highcharts.chart.AbstractChart;
import com.highcharts.chart.pie.opt.PieOptions;
import com.highcharts.opt.PlotOptions;
import com.highcharts.serie.PieSerie;

/**
 * Arquivo: PieChart.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class PieChart extends AbstractChart {

	@Expose @SerializedName("series") private Object[] arraySerie;
	private PieSerie series;
	private int sliceIndex;

	public PieChart() {
		super();
		getChart().setType(PIE);
		setPlotOptions(new PlotOptions());
		getPlotOptions().setPie(new PieOptions());
	}

	public PieSerie getSeries() {
		return series;
	}

	public void setSeries(PieSerie series) {
		this.series = series;
	}

	public Object[] getArraySerie() {
		return arraySerie;
	}

	public void setArraySerie(Object[] arraySerie) {
		this.arraySerie = arraySerie;
	}

	public int getSliceIndex() {
		return sliceIndex;
	}

	public void setSliceIndex(int sliceIndex) {
		this.sliceIndex = sliceIndex;
	}

}
