package com.highcharts.component;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import com.highcharts.chart.pie.Explode;
import com.highcharts.chart.pie.PieChart;

/**
 * Arquivo: PieComponent.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
@FacesComponent("PieComponent")
public class PieComponent extends ChartComponent {

	public void encodeEnd(FacesContext context) throws java.io.IOException {
		PieChart pie = (PieChart) getAttributes().get(ATTRIBUTE_VALUE);

		if (pie != null) {
			definirDados(pie);
			gerarGrafico(context, pie);
		}
	}

	private void definirDados(PieChart pie) {
		int length = pie.getSeries().getValues().size();
		Object[] data = new Object[length];

		Object[] labels = pie.getSeries().getLabels().toArray();
		Object[] values = pie.getSeries().getValues().toArray();

		for (int i = 0; i < length; i++) {
			if (i == pie.getSliceIndex() && length > 1) {
				data[i] = new Explode(labels[i], values[i]);
			} else {
				data[i] = new Object[] { labels[i], values[i] };
			}
		}

		pie.getSeries().setData(data);
		pie.setArraySerie(new Object[] { pie.getSeries() });
	}
}
