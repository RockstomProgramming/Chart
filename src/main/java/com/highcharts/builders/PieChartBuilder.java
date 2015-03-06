package com.highcharts.builders;

import java.util.ArrayList;
import java.util.List;
import com.highcharts.chart.pie.PieChart;
import com.highcharts.serie.PieSerie;

/**
 * Arquivo: PieChartBuilder.java <br/>
 * @since 25/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
public final class PieChartBuilder {

	private PieChart pie;
	private List<Number> values;
	private List<String> labels;

	private PieChartBuilder() {
		pie = new PieChart();

		values = new ArrayList<Number>();
		labels = new ArrayList<String>();
	}

	public static PieChartBuilder create() {
		return new PieChartBuilder();
	}

	public PieChart build() {
		return build(null, null, false, null, null);
	}

	public PieChart build(String title, String nameSerie) {
		return build(title, null, false, nameSerie, null);
	}

	public PieChart build(String title, String subtitle, String nameSerie) {
		return build(title, subtitle, false, nameSerie, null);
	}

	public PieChart build(String title, String subtitle, boolean isGradient, String nameSerie) {
		return build(title, subtitle, isGradient, nameSerie, null);
	}

	public PieChart build(String title, String subtitle, boolean isGradient, String nameSerie, String valueSuffix) {
		PieSerie series = new PieSerie();
		series.setLabels(labels);
		series.setValues(values);
		series.setName(nameSerie);

		pie.setSeries(series);
		pie.addTitle(title);
		pie.addSubtitle(subtitle);
		pie.getPlotOptions().getPie().setCursor("pointer");
		pie.getPlotOptions().setGradient(isGradient);
		pie.getTooltip().setValueSuffix(valueSuffix);
		pie.getTooltip().setShared(true);

		return pie;
	}

	public PieChartBuilder add(String label, Number value) {
		labels.add(label);
		values.add(value);

		return this;
	}
}
