package br.sc.vitor;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import br.sc.vitor.modelo.Cidade;

public class TransformadorTeste {

	TransformadorCSV transformadorCSV = new TransformadorCSV();

	@Test
	public void deveCriarUmaLista() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List cidades = transformadorCSV.transformar(linhas);
		Assert.assertNotNull(cidades);
	}

	@Test
	public void aListaNaoPodeEstarVazia() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List cidades = transformadorCSV.transformar(linhas);
		Assert.assertFalse(cidades.isEmpty());
	}

	@Test
	public void deveRetornarIdIBGE1100015() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("1100015", cidades.get(0).getIdIBGE());
	}

	@Test
	public void deveRetornarUF_RO() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("RO", cidades.get(0).getUf());
	}

	@Test
	public void deveRetornarAltaFlorestaD_Oeste() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("Alta Floresta D'Oeste", cidades.get(0).getName());
	}

	@Test
	public void deveRetornarCapitalVazia() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("", cidades.get(0).getCapital());
	}

	@Test
	public void deveRetornarLongradouro619998238963() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("-61.9998238963", cidades.get(0).getLon());
	}

	@Test
	public void deveRetornarLat119355403048() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("-11.9355403048", cidades.get(0).getLat());
	}

	@Test
	public void deveRetornarNo_accentsAltaFlorestaApostrofoDoeste() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("Alta Floresta D'Oeste", cidades.get(0).getNo_accents());
	}

	@Test
	public void deveRetornarAlternative_NamesVazio() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("", cidades.get(0).getAlternative_names());
	}

	@Test
	public void deveRetornarMicroregionCacoal() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("Cacoal", cidades.get(0).getMicroregion());
	}

	@Test
	public void deveRetornarMesoregionLesteRondoniense() {
		List<String> linhas = new ArrayList<String>();
		linhas.add("cabecalho");
		linhas.add(
				"1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense");
		List<Cidade> cidades = transformadorCSV.transformar(linhas);
		Assert.assertEquals("Leste Rondoniense", cidades.get(0).getMesoregion());
	}

}
