package br.com.chart.component;

import br.com.chart.data.PieDataSet;
import com.google.gson.Gson;

public class DoughnutChart extends Chart {

	@Override
	protected String getJsonDataSet() {
		PieDataSet dataset = (PieDataSet) getAttributes().get(ATTRIBUTE_DATASET);
		return new Gson().toJson(dataset);
	}

	@Override
	protected String getCreateChart() {
		return null;
	}

}
