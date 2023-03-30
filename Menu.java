package grafo;

import java.util.Scanner;

public class Menu {
	
	public int imprime(Scanner sc) {
		int nav;
		
		System.out.println("SELECIONE\n"+
		"\n1- Verificar Aresta\n2- Checar Vizinho\n3- Criar Vertice\n"+
		"4- Deletar Vertice\n5- Criar Aresta\n6- Deletar Aresta\n7- Sair");
		nav = sc.nextInt();
		
		return nav;
	}
	
}
