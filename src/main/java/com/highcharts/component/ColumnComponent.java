package com.highcharts.component;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import com.highcharts.chart.column.ColumnChart;

/**
 * Arquivo: ColumnComponent.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
@FacesComponent("ColumnComponent")
public class ColumnComponent extends ChartComponent {

	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ColumnChart column = (ColumnChart) getAttributes().get(ATTRIBUTE_VALUE);

		if (column != null) {
			column.setData(column.getSeries().toArray());
			gerarGrafico(context, column);
		}
	}
}
