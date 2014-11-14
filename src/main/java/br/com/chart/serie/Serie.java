package br.com.chart.serie;

/**
 * Esta classe é indicada para gráficos simples cuja série armazene um único valor e label.
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
public abstract class Serie extends SerieBasic {

	private Number value;
	private String color;

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
