package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.Label;
import com.highcharts.Title;
import com.highcharts.TitleChart;

public class YAxis {
	
	@Expose private Title title;
	@Expose private Label labels;

	public YAxis() {
		setTitle(new TitleChart());
	}
	
	public void setTitle(String title) {
		getTitle().setText(title);
	}
	
	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Label getLabels() {
		return labels;
	}

	public void setLabels(Label labels) {
		this.labels = labels;
	}
}
