package br.com.chart.data;

import br.com.chart.serie.PieSerie;

public class PieDataSet extends DataSet<PieSerie> {
	
	private Integer baseColor = 0x6A97C7;
	
	public void addSerie(PieSerie serie) {
		if (serie.getColor() == null) {
			serie.setColor("#"+Integer.toHexString(baseColor));
			baseColor += 111111;
		}
		
		super.addSerie(serie);
	}
}
