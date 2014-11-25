package com.highcharts.serie;

import com.google.gson.annotations.Expose;

public class Serie {

	@Expose private String name;
	@Expose private Object[] data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}
}
