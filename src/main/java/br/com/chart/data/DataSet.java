package br.com.chart.data;

import java.util.ArrayList;
import java.util.List;
import br.com.chart.serie.Serie;

public abstract class DataSet<T extends Serie> {
	
	private List<T> series;

	public DataSet() {
		series = new ArrayList<T>();
	}
	
	public void addSerie(T serie) {
		getSeries().add(serie);
	}
	
	public List<T> getSeries() {
		return series;
	}
}
