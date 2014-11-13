package br.com.chart.serie;

import java.util.List;

public abstract class SerieComplex extends Serie {

	private List<Number> data;
	private String fillColor;
	private String strokeColor;
	
	public List<Number> getData() {
		return data;
	}

	public void setData(List<Number> data) {
		this.data = data;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getStrokeColor() {
		return strokeColor;
	}

	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}
}
