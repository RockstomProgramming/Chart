package com.highcharts.serie;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: Serie.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
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
