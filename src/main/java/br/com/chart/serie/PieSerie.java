package br.com.chart.serie;

public class PieSerie extends Serie {

	private String color;
	private Number value;
	
	public PieSerie(String label, Number value) {
		setLabel(label);
		setValue(value);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}

}
