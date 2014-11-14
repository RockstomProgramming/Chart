package br.com.chart.data;

import java.util.Arrays;
import java.util.List;
import br.com.chart.serie.SerieComplex;

public abstract class DataSetComplex<T extends SerieComplex> extends DataSet<T> {

	private List<String> labels;

	public void addLabels(String[] labels) {
		this.labels = Arrays.asList(labels);
	}

	public List<String> getLabels() {
		return labels;
	}
}
