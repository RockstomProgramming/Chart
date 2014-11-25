package com.highcharts.chart.column.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.Title;

public class YAxis {

	@Expose private int min;
	@Expose private Title title;

	public YAxis() {
		setTitle(new Title());
	}

	public void setTitle(String title) {
		getTitle().setText(title);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
}
