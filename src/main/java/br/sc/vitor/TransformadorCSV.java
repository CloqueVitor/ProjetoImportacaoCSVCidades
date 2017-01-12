package br.sc.vitor;

import java.util.ArrayList;
import java.util.List;

import br.sc.vitor.modelo.Cidade;

public class TransformadorCSV {

	public List<Cidade> transformar(List<String> linhas) {

		List<Cidade> listaCidade = new ArrayList<Cidade>();
		for (int i = 1; i < linhas.size(); i++) {
			Cidade cidade = montaCidade(linhas.get(i));
			listaCidade.add(cidade);

		}
		return listaCidade;
	}

	private Cidade montaCidade(String linha) {

		String[] part = linha.split(",");
		Cidade cidade = new Cidade();
		cidade.setIdIBGE(part[0]);
		cidade.setUf(part[1]);
		cidade.setName(part[2]);
		cidade.setCapital(part[3]);
		cidade.setLon(part[4]);
		cidade.setLat(part[5]);
		cidade.setNo_accents(part[6]);
		cidade.setAlternative_names(part[7]);
		cidade.setMicroregion(part[8]);
		cidade.setMesoregion(part[9]);
		return cidade;
	}

}
