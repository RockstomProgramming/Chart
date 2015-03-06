package com.highcharts;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: Title.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class Title {

	@Expose private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
