package com.highcharts.serie;

import java.util.List;
import com.google.gson.annotations.Expose;

/**
 * Arquivo: PieSerie.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class PieSerie {

	@Expose String type = "pie";
	@Expose private String name;
	@Expose private Object[] data;
	private List<String> labels;
	private List<Number> values;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<Number> getValues() {
		return values;
	}

	public void setValues(List<Number> values) {
		this.values = values;
	}
}
