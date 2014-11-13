package br.com.chart.serie;

import java.util.List;

public class LineSerie extends SerieComplex {

	private String pointColor;
	private String pointStrokeColor;
	private String pointHighlightFill;
	private String pointHighlightStroke;
	
	public LineSerie() {
		super();
	}
	
	public LineSerie(List<Number> data) {
		setData(data);
	}
	
	public String getPointColor() {
		return pointColor;
	}

	public void setPointColor(String pointColor) {
		this.pointColor = pointColor;
	}

	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	public void setPointStrokeColor(String pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
	}

	public String getPointHighlightFill() {
		return pointHighlightFill;
	}

	public void setPointHighlightFill(String pointHighlightFill) {
		this.pointHighlightFill = pointHighlightFill;
	}

	public String getPointHighlightStroke() {
		return pointHighlightStroke;
	}

	public void setPointHighlightStroke(String pointHighlightStroke) {
		this.pointHighlightStroke = pointHighlightStroke;
	}
}
