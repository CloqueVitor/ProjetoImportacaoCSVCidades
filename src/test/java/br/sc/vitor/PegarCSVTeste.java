package br.sc.vitor;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PegarCSVTeste {

	PegaCSV pegaCSV = new PegaCSV();

	@Test
	public void oRetornoNaoPodeSerNuloSeExistir() throws Exception {
		List<String> conteudo = pegaCSV.ler(
				"C:\\Users\\vitor\\Desktop\\TesteInvolves\\TesteInvolves2\\src\\test\\resources\\arquivos\\cidades.csv");
		Assert.assertNotNull(conteudo);

	}

	@Test
	public void oRetornoNaoPodeSerVazio() throws Exception {
		List<String> conteudo = pegaCSV.ler(
				"C:\\Users\\vitor\\Desktop\\TesteInvolves\\TesteInvolves2\\src\\test\\resources\\arquivos\\cidades.csv");
		Assert.assertFalse(conteudo.isEmpty());
	}
	
	@Test
	public void aPosicaoZeroEoCabecalho() throws Exception{
		List<String> conteudo = pegaCSV.ler(
				"C:\\Users\\vitor\\Desktop\\TesteInvolves\\TesteInvolves2\\src\\test\\resources\\arquivos\\cidades.csv");
		Assert.assertEquals("ibge_id,uf,name,capital,lon,lat,no_accents,alternative_names,microregion,mesoregion", conteudo.get(0));
	}

}
