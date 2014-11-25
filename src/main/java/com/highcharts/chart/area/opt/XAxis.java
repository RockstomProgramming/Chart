package com.highcharts.chart.area.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.Label;
import com.highcharts.Title;
import com.highcharts.TitleChart;

public class XAxis {

	@Expose private Title title;
	@Expose private Label labels;
	@Expose private boolean allowDecimals;
	@Expose private String[] categories;
	@Expose private String tickmarkPlacement;
	
	public XAxis() {
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

	public boolean isAllowDecimals() {
		return allowDecimals;
	}

	public void setAllowDecimals(boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
	}

	public Label getLabels() {
		return labels;
	}

	public void setLabels(Label labels) {
		this.labels = labels;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public String getTickmarkPlacement() {
		return tickmarkPlacement;
	}

	public void setTickmarkPlacement(String tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
	}
}
