package br.com.chart.component;

import javax.faces.component.FacesComponent;
import br.com.chart.data.PieDataSet;
import com.google.gson.Gson;

@FacesComponent("PieChart")
public class PieChart extends Chart {

	@Override
	protected String getCreateChart() {
		return "new Chart(ctx).Pie(data,pieOptions)";
	}
	
	@Override
	protected String getJsonDataSet() {
		PieDataSet dataSet = (PieDataSet) getAttributes().get(ATTRIBUTE_DATASET);
		return new Gson().toJson(dataSet.getSeries());
	}
}
