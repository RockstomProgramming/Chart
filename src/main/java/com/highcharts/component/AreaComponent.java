package com.highcharts.component;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import com.highcharts.chart.area.AreaChart;

@FacesComponent("AreaComponent")
public class AreaComponent extends ChartComponent {

	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		AreaChart area = (AreaChart) getAttributes().get(ATTRIBUTE_VALUE);

		if (area != null) {
			area.setData(area.getSeries().toArray());
			gerarGrafico(context, area);
		}
	}
}
