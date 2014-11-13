package br.com.chart.data;

import java.util.Arrays;
import java.util.List;
import br.com.chart.serie.Serie;

public abstract class DataSetComplex<T extends Serie> extends DataSet<T> {

	private List<String> labels;

	public void addLabels(String[] labels) {
		this.labels = Arrays.asList(labels);
	}

	public List<String> getLabels() {
		return labels;
	}
}
