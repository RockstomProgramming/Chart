package br.com.chart.component;

import java.io.IOException;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@ResourceDependencies({
	@ResourceDependency(library = "note", name = "js/Chart.js"),
	@ResourceDependency(library = "note", name = "js/chart-conf.js"),
	@ResourceDependency(library = "note", name = "css/chart.css")
})
public abstract class Chart extends UIComponentBase {

	private static final String FAMILY_NAME = "br.com.chart";
	protected static final String ATTRIBUTE_DATASET = "dataset";

	@Override
	public String getFamily() {
		return FAMILY_NAME;
	}

	public void encodeEnd(FacesContext context) throws IOException {

		String id = (String) getAttributes().get("id");
		String width = (String) getAttributes().get("width");
		String height = (String) getAttributes().get("height");

		String script = "$(document).ready(function() { var ctx = $(\"#" + id + "\").get(0).getContext(\"2d\"); var chart = " + getCreateChart() + ";});";
		StringBuilder serieSet = new StringBuilder();
		serieSet.append("var data = ");
		serieSet.append(getJsonDataSet());
		serieSet.append(";");

		writer(context, id, width, height, script, serieSet);
	}

	protected void writer(FacesContext context, String id, String width, String height, String script, StringBuilder serieSet) throws IOException {
		ResponseWriter writer = getResponseWriter(context);
		writer.startElement("div", this);
		writer.writeAttribute("class", "content-chart", null);
		writer.startElement("canvas", this);
		writer.writeAttribute("id", id, null);
		writer.writeAttribute("width", width, null);
		writer.writeAttribute("height", height, null);
		writer.endElement("canvas");
		writer.endElement("div");

		writer.startElement("script", this);
		writer.writeAttribute("type", "text/javascript", null);
		writer.write(serieSet.toString());
		writer.write(script);
		writer.endElement("script");
	}

	protected ResponseWriter getResponseWriter(FacesContext context) {
		return context.getResponseWriter();
	}

	protected abstract String getJsonDataSet();
	protected abstract String getCreateChart();
}
