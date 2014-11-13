package br.com.chart.component;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import br.com.chart.data.BarDataSet;
import br.com.chart.serie.BarSerie;
import com.google.gson.Gson;

/**
 * Classe responsável por gerar gráficos de barras.
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
@FacesComponent("BarChart")
public class BarChart extends Chart {

	@Override
	protected void writer(FacesContext context, String id, String width, String height, String script, StringBuilder serieSet) throws IOException {

		BarDataSet dataset = (BarDataSet) getAttributes().get(ATTRIBUTE_DATASET);

		if (dataset != null) {
			StringBuilder str = new StringBuilder();
			str.append("<div class=\"leg-content\"><table class=\"leg-table\">");

			for (BarSerie serie : dataset.getSeries()) {
				str.append("<tr>");
				str.append("<td>").append("<div class=\"leg-legenda\" style=\"background: " + serie.getFillColor() + "\"></div>").append("</td>");
				str.append("<td>").append("<td class=\"leg-desc\">" + serie.getLabel() + "</td>").append("</td>");
				str.append("</tr>");
			}

			str.append("</table></div>");

			super.writer(context, id, width, height, script, serieSet);
			getResponseWriter(context).write(str.toString());
		}
	}

	@Override
	protected String getJsonDataSet() {
		BarDataSet dataset = (BarDataSet) getAttributes().get(ATTRIBUTE_DATASET);
		String json = new Gson().toJson(dataset);
		return json.replaceAll("series", "datasets");
	}

	@Override
	protected String getCreateChart() {
		return "new Chart(ctx).Bar(data,barOptions);";
	}

}
