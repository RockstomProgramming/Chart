package br.com.chart.serie;

import java.util.List;

/**
 * Esta classe é indicada para gráficos complexos que possuam vários valores e labels.
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
public abstract class SerieComplex extends SerieBasic {

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
