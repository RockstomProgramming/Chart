package com.highcharts.chart.column.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.Title;

/**
 * Arquivo: XAxis.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class XAxis {

	@Expose private String[] categories;
	@Expose private Title title;

	public XAxis() {
		setTitle(new Title());
	}

	public void setTitle(String title) {
		getTitle().setText(title);
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
}
