package br.com.chart.data;

import br.com.chart.serie.PieSerie;

public class PieDataSet extends DataSet<PieSerie> {
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
