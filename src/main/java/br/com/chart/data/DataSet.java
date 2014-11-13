package br.com.chart.data;

import java.util.ArrayList;
import java.util.List;
import br.com.chart.serie.Serie;

/**
 * As classes <i>dataset</i> são responsáveis por armazenar os dados e configurações  dos gráficos.
 * Para criar um gráfico a partir do lado do servidor o primeiro passo é instanciar uma classe que
 * implementa <code>DataSet</code>. Em seguida deve-se criar às séries, que por sua vez  armazenam 
 * todos  os  dados do  gráfico  e  suas  configurações,  como  nome  do label, cores  e  valores.
 * 
 * @since 13/11/2014
 * @author Wesley Luiz
 * @version 1.0.0
 */
public abstract class DataSet<T extends Serie> {
	
	/** Atributo series. */
	private List<T> series;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public DataSet() {
		series = new ArrayList<T>();
	}
	
	/**
	 * Método responsável por adicionar as séries ao dataset.
	 * @author Wesley Luiz
	 * @since 13/11/2014
	 * @param serie
	 */
	public void addSerie(T serie) {
		getSeries().add(serie);
	}

	/**
	 * Método responsável por adicionar as séries ao dataset.
	 * @author Wesley Luiz
	 * @since 13/11/2014
	 * @param serie
	 */
	public void addSerie(T... series) {
		for (T serie : series) {
			addSerie(serie);
		}
	}
	
	public List<T> getSeries() {
		return series;
	}
}
