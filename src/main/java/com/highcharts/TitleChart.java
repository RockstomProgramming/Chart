package com.highcharts;

import com.google.gson.annotations.Expose;

/**
 * Arquivo: TitleChart.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class TitleChart extends Title {

	@Expose private Boolean floating;
	@Expose private String align;
	@Expose private String verticalAlign;
	@Expose private Integer y;

	public Boolean getFloating() {
		return floating;
	}

	public void setFloating(Boolean floating) {
		this.floating = floating;
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getVerticalAlign() {
		return verticalAlign;
	}

	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

}
