package br.com.chart.component;

import javax.faces.component.FacesComponent;
import br.com.chart.data.PieDataSet;
import com.google.gson.Gson;

/**
 * Classe responsável por gerar gráficos de torta.
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
@FacesComponent("DoughnutChart")
public class DoughnutChart extends Chart {

	@Override
	protected String getJsonDataSet() {
		PieDataSet dataset = (PieDataSet) getAttributes().get(ATTRIBUTE_DATASET);
		return new Gson().toJson(dataset);
	}

	@Override
	protected String getCreateChart() {
		return "new Chart(ctx).Doughnut(data)";
	}

}
