package com.highcharts.chart.pie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Explode {
	@Expose private Object name;
	@Expose @SerializedName("y") private Object value;
	@Expose private boolean sliced = true;
	@Expose private boolean selected = true;

	public Explode(Object name, Object value) {
		setName(name);
		setValue(value);
	}
	
	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public boolean isSliced() {
		return sliced;
	}

	public void setSliced(boolean sliced) {
		this.sliced = sliced;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
