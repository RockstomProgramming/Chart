package br.com.chart.component;

import javax.faces.component.FacesComponent;
import com.google.gson.Gson;
import br.com.chart.data.LineDataSet;

/**
 * Classe responsável por gerar gráficos de linha.
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
@FacesComponent("LineChart")
public class LineChart extends Chart {

	@Override
	protected String getJsonDataSet() {
		LineDataSet dataset = (LineDataSet) getAttributes().get(ATTRIBUTE_DATASET);
		return new Gson().toJson(dataset).replaceAll("series", "datasets");
	}

	@Override
	protected String getCreateChart() {
		return "new Chart(ctx).Line(data,lineOptions)";
	}

}
