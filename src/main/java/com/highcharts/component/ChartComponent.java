package com.highcharts.component;

import java.io.IOException;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import com.google.gson.GsonBuilder;
import com.highcharts.chart.AbstractChart;

@ResourceDependencies({ 
	@ResourceDependency(library = "note", name = "js/highcharts.js")
})
public abstract class ChartComponent extends UIComponentBase {
	
	protected static final String FAMILY_NAME = "br.com.chart";
	protected static final String ATTRIBUTE_VALUE = "value";
	
	public void gerarGrafico(FacesContext context, AbstractChart chart) throws IOException  {
		
		String id = (String) getAttributes().get("id");
		String width = (String) getAttributes().get("width");
		String height = (String) getAttributes().get("height");
		String styleClass = chart.getStyleClass();
		
		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("script", this);
		writer.writeAttribute("type", "text/javascript", null);
		writer.write("$(document).ready(function() {");
		
		definirOpcoes(context, writer, chart);
		
		writer.write("$('#" + id + "').highcharts(");
		writer.write(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(chart));
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
