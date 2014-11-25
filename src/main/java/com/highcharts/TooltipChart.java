package com.highcharts;

import com.google.gson.annotations.Expose;

public class TooltipChart {

	private static final String DEFAULT_FORMAT = "{series.name}: <b>{point.percentage:.1f}%</b>";
	@Expose private String pointFormat = DEFAULT_FORMAT;
	@Expose private Boolean shared;
	@Expose private String valueSuffix;

	@Expose private String headerFormat;
	@Expose private String footerFormat;
	@Expose private Boolean useHTML;

	public String getPointFormat() {
		return pointFormat;
	}

	public void setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
	}

	public Boolean getShared() {
		return shared;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public String getValueSuffix() {
		return valueSuffix;
	}

	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
	}

	public String getHeaderFormat() {
		return headerFormat;
	}

	public void setHeaderFormat(String headerFormat) {
		this.headerFormat = headerFormat;
	}

	public String getFooterFormat() {
		return footerFormat;
	}

	public void setFooterFormat(String footerFormat) {
		this.footerFormat = footerFormat;
	}

	public Boolean getUseHTML() {
		return useHTML;
	}

	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}
}
