package br.sc.vitor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		int total = 0;
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		ProcessaEntrada processaEntrada = new ProcessaEntrada();
		total = processaEntrada.processar(entrada);	
		System.out.println(total);
	}

}
