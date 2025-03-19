package engSenai.calculadora.dao;

import java.util.Scanner;

import engSenai.Quadrado;

public class QuadradoDao {

	public void criarQuadrado() {
		
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.println("Qual o lado do quadrado? ");
		
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarDados();
		
		//fechar o objeto scanner, remover da memoria 
		
	    leitor.close();
		
		
	}
	
}
