package com.highcharts.component;

import java.io.IOException;
import java.util.List;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import com.google.gson.GsonBuilder;
import com.highcharts.chart.AbstractChart;
import com.highcharts.chart.ComplexChart;
import com.highcharts.util.CorUtil;

/**
 * Arquivo: ChartComponent.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
@ResourceDependencies({ @ResourceDependency(library = "note", name = "js/highcharts.js") })
public abstract class ChartComponent extends UIComponentBase {

	protected static final String FAMILY_NAME = "br.com.chart";
	protected static final String ATTRIBUTE_VALUE = "value";

	public void gerarGrafico(FacesContext context, AbstractChart chart) throws IOException {

		String id = (String) getAttributes().get("id");
		String width = (String) getAttributes().get("width");
		String height = (String) getAttributes().get("height");
		String styleClass = chart.getStyleClass();

		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("script", this);
		writer.writeAttribute("type", "text/javascript", null);
		writer.write("$(document).ready(function() {");

		definirOpcoes(context, writer, chart);
		gerarCoresAleatorias(chart);

		writer.write("$('#" + id + "').highcharts(");
		String json = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(chart);
		writer.write(json);
		writer.write(");");
		writer.write("});");
		writer.endElement("script");

		writer.startElement("div", this);
		writer.writeAttribute("id", id, null);
		writer.writeAttribute("style", "min-width: 310px; height:" + height + "; width: " + width + "; margin: 0 auto", null);

		if (styleClass != null && !styleClass.isEmpty()) {
			writer.writeAttribute("class", styleClass, null);
		}

		writer.endElement("div");
	}

	private void gerarCoresAleatorias(AbstractChart chart) {
		if (chart instanceof ComplexChart) {
			ComplexChart c = (ComplexChart) chart;
			if (c.isGenerateColor()) {
				int qnt = c.getSeries().size();
				List<String> cores = CorUtil.obterCores(qnt);
				String[] a = new String[cores.size()];
				chart.setColors(cores.toArray(a));
			}
		}
	}

	public void definirOpcoes(FacesContext context, ResponseWriter writer, AbstractChart chart) throws IOException {
		if (chart.getPlotOptions().isGradient()) {
			writer.write("Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function (color) {");
			writer.write("return { radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 }, stops: [[0, color],[1, Highcharts.Color(color).brighten(-0.3).get('rgb')]] };");
			writer.write("});");
		}
	}

	@Override
	public String getFamily() {
		return FAMILY_NAME;
	}

}
