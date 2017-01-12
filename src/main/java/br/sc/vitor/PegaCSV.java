package br.sc.vitor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PegaCSV {

	public List<String> ler(String caminhoArquivo) throws Exception {

		List<String> linhas = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo));
		String linha;
		while ((linha = bufferedReader.readLine()) != null) {
			linhas.add(linha);
		}
		return linhas;

	}

}
