package br.sc.vitor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.sc.vitor.modelo.Cidade;

public class CidadeServico {

	public int totalItens(List<Cidade> listaCidade) {
		return listaCidade.size();
	}

	public int totalItensDistintos(String propriedade, List<Cidade> listaCidade) {

		Set<String> valores = new HashSet<String>();
		for (Cidade cidade : listaCidade) {
			if ("ibge_id".equals(propriedade)) {
				valores.add(cidade.getIdIBGE());
			} else if ("uf".equals(propriedade)) {
				valores.add(cidade.getUf());
			} else if ("name".equals(propriedade)) {
				valores.add(cidade.getName());
			} else if ("capital".equals(propriedade)) {
				valores.add(cidade.getCapital());
			} else if ("lon".equals(propriedade)) {
				valores.add(cidade.getLon());
			} else if ("lat".equals(propriedade)) {
				valores.add(cidade.getLat());
			}

		}
		return valores.size();
	}
}
