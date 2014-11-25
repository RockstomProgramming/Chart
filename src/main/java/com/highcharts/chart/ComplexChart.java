package com.highcharts.chart;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.highcharts.serie.Serie;

public class ComplexChart extends AbstractChart {

	@Expose @SerializedName("series") private Object[] data;
	private List<Serie> series;

	public ComplexChart() {
		setSeries(new ArrayList<Serie>());
	}
	
	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}
}
