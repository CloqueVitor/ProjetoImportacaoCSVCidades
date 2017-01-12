package br.sc.vitor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.sc.vitor.modelo.Cidade;

public class CidadeServicoTeste {

	CidadeServico cidadeServico = new CidadeServico();

	@Test
	public void oTamanhoDaListaRetornadaDeveSerDois() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade());
		listaCidade.add(new Cidade());
		Assert.assertEquals(2, cidadeServico.totalItens(listaCidade));
	}

	@Test
	public void oTamanhoDaListaRetornadaDeveSerZero() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		Assert.assertEquals(0, cidadeServico.totalItens(listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeIdIBGEDeveRetornarDois() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		listaCidade.add(new Cidade("2"));
		Assert.assertEquals(2, cidadeServico.totalItensDistintos("ibge_id", listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeIdIBGEDeveRetornarUm() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		Assert.assertEquals(1, cidadeServico.totalItensDistintos("ibge_id", listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeUFDeveRetornarUm() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		Assert.assertEquals(1, cidadeServico.totalItensDistintos("uf", listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeNomeDeveRetornarUm() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		Assert.assertEquals(1, cidadeServico.totalItensDistintos("name", listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeCapitalDeveRetornarUm() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		Assert.assertEquals(1, cidadeServico.totalItensDistintos("capital", listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeLonDeveRetornarUm() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		Assert.assertEquals(1, cidadeServico.totalItensDistintos("lon", listaCidade));
	}

	@Test
	public void oContatadorDaPropriedadeLatDeveRetornarUm() {
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade.add(new Cidade("1"));
		Assert.assertEquals(1, cidadeServico.totalItensDistintos("lat", listaCidade));
	}
}
