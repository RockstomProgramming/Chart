package br.com.chart.component;

import com.google.gson.Gson;
import br.com.chart.data.LineDataSet;

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
