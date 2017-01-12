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
	public void quandoEntrarComCoutDistinctUFdeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct UF");
		Assert.assertEquals(0, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctNameDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct name");
		Assert.assertEquals(5291, total);
	}
	

	@Test
	public void quandoEntrarComCoutDistinctCapitalDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct capital");
		Assert.assertEquals(2, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctLonDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct lon");
		Assert.assertEquals(5565, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctLatDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct lat");
		Assert.assertEquals(5565, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctNo_accentsDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct no_accents");
		Assert.assertEquals(0, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctAlternative_namesDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct alternative_names");
		Assert.assertEquals(0, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctMicroregionDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct microregion");
		Assert.assertEquals(0, total);
	}
	
	@Test
	public void quandoEntrarComCoutDistinctMesoregionDeveRetornarOtotalDeItensDistintos() throws Exception {

		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		int total = processaEntrada.processar("count distinct mesoregion");
		Assert.assertEquals(0, total);
	}
	
}
