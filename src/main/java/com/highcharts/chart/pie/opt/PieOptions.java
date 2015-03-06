package com.highcharts.chart.pie.opt;

import com.google.gson.annotations.Expose;
import com.highcharts.opt.LabelOptions;

/**
 * Arquivo: PieOptions.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public class PieOptions {

	@Expose private boolean allowPointSelect = true;
	@Expose private boolean showInLegend = false;
	@Expose private String cursor = "pointer";
	@Expose private LabelOptions dataLabels;
	@Expose private int depth;

	public PieOptions() {
		setDataLabels(new LabelOptions());
	}

	public boolean isAllowPointSelect() {
		return allowPointSelect;
	}

	public void setAllowPointSelect(boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public LabelOptions getDataLabels() {
		return dataLabels;
	}

	public void setDataLabels(LabelOptions dataLabels) {
		this.dataLabels = dataLabels;
	}

	public boolean isShowInLegend() {
		return showInLegend;
	}

	public void setShowInLegend(boolean showInLegend) {
		this.showInLegend = showInLegend;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
}
