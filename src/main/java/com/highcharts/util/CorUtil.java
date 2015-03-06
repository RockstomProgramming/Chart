package com.highcharts.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Arquivo: CorUtil.java <br/>
 * @since 06/03/2015
 * @author Wesley Luiz
 * @version 1.0.0
 */
public final class CorUtil {

	private static String gerarCor(List<String> cores) {
		final String[] hex = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String cor = "#";
		for (int i = 0; i < 6; i++) {
			final Double aleatorio = aleatorio(0, hex.length);
			cor += hex[aleatorio.intValue()];
		}

		if (cores.contains(cor)) {
			gerarCor(cores);
		}

		return cor;
	}

	private static double aleatorio(final int inf, final int sup) {
		final int pos = sup - inf;
		double al = Math.random() * pos;
		al = Math.floor(al);
		return Integer.valueOf(inf) + al;
	}

	public static List<String> obterCores(final int qnt) {
		final List<String> cores = new ArrayList<>();
		for (int i = 0; i < qnt; i++) {
			cores.add(gerarCor(cores));
		}
		return cores;
	}
}
