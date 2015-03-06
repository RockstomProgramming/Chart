package com.highcharts.chart.column.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.Title;

/**
 * Arquivo: YAxis.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
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
