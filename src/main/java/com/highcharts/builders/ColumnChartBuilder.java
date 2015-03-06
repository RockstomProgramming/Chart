package com.highcharts.builders;

import java.util.List;
import com.highcharts.chart.column.ColumnChart;
import com.highcharts.serie.Serie;

/**
 * Arquivo: ColumnChartBuilder.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public final class ColumnChartBuilder {

	private ColumnChart chart;

	private ColumnChartBuilder() {
		chart = new ColumnChart();
	}

	public static ColumnChartBuilder create() {
		return new ColumnChartBuilder();
	}

	public ColumnChartBuilder setStyleClass(String styleClass) {
		chart.setStyleClass(styleClass);

		return this;
	}

	public ColumnChartBuilder addSerie(String name, List<Number> values) {
		return addSerie(name, values.toArray());
	}

	public ColumnChartBuilder addSerie(String name, Object[] data) {
		Serie serie = new Serie();
		serie.setData(data);
		serie.setName(name);

		chart.getSeries().add(serie);

		return this;
	}

	public ColumnChartBuilder setCategories(String[] categories) {
		return setCategories(categories, null);
	}

	public ColumnChartBuilder setCategories(String[] categories, String xAxisTitle) {
		chart.getxAxis().setCategories(categories);
		chart.getxAxis().setTitle(xAxisTitle);

		return this;
	}

	public ColumnChartBuilder configYAxis(String title, int min) {
		chart.getyAxis().setMin(min);
		chart.getyAxis().setTitle(title);

		return this;
	}

	public ColumnChartBuilder isGenerateColor() {
		chart.setGenerateColor(true);
		return this;
	}

	public ColumnChart build() {
		return build(null, null);
	}

	public ColumnChart build(String title) {
		return build(title, null);
	}

	public ColumnChart build(String title, String subTitle) {
		chart.addTitle(title);
		chart.addSubtitle(subTitle);
		chart.getTooltip().setHeaderFormat("<span style=\"font-size:10px\">{point.key}</span><table>");
		chart.getTooltip().setPointFormat("<tr><td style=\"color:{series.color};padding:0\">{series.name}: </td><td style=\"padding:0\"><b>{point.y:.0f}</b></td></tr>");
		chart.getTooltip().setFooterFormat("</table>");
		chart.getTooltip().setShared(true);
		chart.getTooltip().setUseHTML(true);

		return chart;
	}
}
