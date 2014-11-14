package br.com.chart.data;

import br.com.chart.serie.PieSerie;

public class PieDataSet extends DataSet<PieSerie> {

	private Integer colorR = 50;
	private Integer colorG = 50;
	private Integer colorB = 50;

	public void addSerie(PieSerie serie) {
		if (serie.getColor() == null) {
			serie.setColor("rgb(" + colorR + "," + colorG + "," + colorB + ")");
			colorR += 10;
			colorG += 10;
			colorB += 10;
		}
		
		super.addSerie(serie);
	}
}
