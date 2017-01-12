package br.sc.vitor;

import java.util.List;

import br.sc.vitor.modelo.Cidade;

public class ProcessaEntrada {

	public int processar(String entrada) throws Exception {

		PegaCSV pegaCSV = new PegaCSV();
		TransformadorCSV transformaCSV = new TransformadorCSV();
		CidadeServico cidadeServico = new CidadeServico();

		List<String> linhas = pegaCSV.ler(
				".\\src\\main\\resources\\arquivos\\cidades.csv");
		List<Cidade> listaCidade = transformaCSV.transformar(linhas);

		if (entrada.equals("count *")) {
			return cidadeServico.totalItens(listaCidade);
		} else if (entrada.indexOf("count distinct") != -1) {
			return cidadeServico.totalItensDistintos(entrada.replace("count distinct ", ""), listaCidade);
		} else {
			return 0;
		}
	}
}
