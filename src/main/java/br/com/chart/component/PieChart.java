package br.com.chart.component;

import java.io.IOException;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import br.com.chart.data.PieDataSet;
import br.com.chart.serie.PieSerie;

/**
 * Classe responsável por gerar gráficos de torta.
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
@ResourceDependencies({ 
	@ResourceDependency(library = "note", name = "js/highcharts.js"), 
})
@FacesComponent("PieChart")
public class PieChart extends UIComponentBase {
	
	private static final String FAMILY_NAME = "br.com.chart";
	protected static final String ATTRIBUTE_DATASET = "dataset";

	@Override
	public String getFamily() {
		return FAMILY_NAME;
	}

	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		
		String id = (String) getAttributes().get("id");
		String width = (String) getAttributes().get("width");
		String height = (String) getAttributes().get("height");
		PieDataSet dataset = (PieDataSet) getAttributes().get(ATTRIBUTE_DATASET);
		
		if (dataset.getSeries() != null && !dataset.getSeries().isEmpty()) {
		
			StringBuilder builder = new StringBuilder();
			
			for (PieSerie serie : dataset.getSeries()) {
				if (serie.getLabel().length() > 10) {
					serie.setLabel(serie.getLabel().substring(0, 9) + "...");
				}
				
				builder.append("[");
				builder.append("'").append(serie.getLabel()).append("',");
				builder.append(serie.getValue());
				builder.append("],");
			}
			
			String data = builder.toString();
			
			String script = "$(document).ready(function() { $('#" + id + "').highcharts({ " +
					"chart : { plotBackgroundColor : null, plotBorderWidth : 1, plotShadow : true }," +
					"title : { text : '" + dataset.getTitle() + "' }," +
					"tooltip : { pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>' }," +
					"series : [ { type : 'pie', name : 'Browser share', data : [" + data + "] } ]" +
					" }); });";
			
			ResponseWriter writer = context.getResponseWriter();
			writer.startElement("script", this);
			writer.writeAttribute("type", "text/javascript", null);
			writer.write(script);
			writer.endElement("script");
			
			writer.startElement("div", this);
			writer.writeAttribute("id", id, null);
			writer.writeAttribute("style", "min-width: 310px; height:" + height + "; width: " + width + "; margin: 0 auto", null);
			writer.endElement("div");
		}
	}
}
