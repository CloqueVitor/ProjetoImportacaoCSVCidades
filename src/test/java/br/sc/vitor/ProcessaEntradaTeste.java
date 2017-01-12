package br.sc.vitor;

import org.junit.Assert;
import org.junit.Test;

public class ProcessaEntradaTeste {

	@Test
	public void quandoEntrarComCountAsteristicoDeveRetornarONumeroTotalDois() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count *");
		Assert.assertEquals(5565, total);

	}

	@Test
	public void quandoEntrarComCoutDistinctIBGE_idDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct ibge_id");
		Assert.assertEquals(5565, total);

	}
	
	@Test
	public void quandoEntrarComCoutDistinctNameDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct name");
		Assert.assertEquals(5291, total);

	}
}
