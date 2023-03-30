package grafo;

import java.util.Scanner;

public class App {
	public static void main(String[] args){
		int nav,vertX,vertY;
		Scanner sc = new Scanner(System.in);
		int[][]grafo;
		nav = 0;
		Grafo g = new Grafo();
		grafo = g.criar();
		
		Menu m = new Menu();
		
		while(nav!=7) {
			
			nav = m.imprime(sc);
			switch(nav) {
			case 1:
				System.out.println("\nVerificar Arestas");
				System.out.println("\nInsira o primeiro vértice: ");
				vertX = sc.nextInt();
				System.out.println("\nInsira o segundo vértice: ");
				vertY = sc.nextInt();
				if(g.adjacente(grafo,vertX,vertY)) {
					System.out.println("\nExiste");
				}else System.out.println("\nNão Existe");
				break;
				
			case 2:
				System.out.println("\nVizinhos");
				System.out.println("\nInsira o vértice: ");
				vertX = sc.nextInt();
				g.vizinhos(grafo, vertX);
				break;
			case 3:
				System.out.println("\nAdicionando Vertice");
				grafo = g.addVertex(grafo);
				break;
			case 4:
				System.out.println("\nRemover Vertice");
				System.out.println("\nInsira o vértice: ");
				vertX = sc.nextInt();
				grafo = g.removeVertex(grafo, vertX);
				break;
			case 5:
				System.out.println("\nCriar Aresta");
				System.out.println("\nInsira o primeiro vértice: ");
				vertX = sc.nextInt();
				System.out.println("\nInsira o segundo vértice: ");
				vertY = sc.nextInt();
				grafo = g.addEdge(grafo, vertX, vertY);
				break;
			case 6:
				System.out.println("\nDeletar Aresta");
				System.out.println("\nInsira o primeiro vértice: ");
				vertX = sc.nextInt();
				System.out.println("\nInsira o segundo vértice: ");
				vertY = sc.nextInt();
				grafo = g.removeEdge(grafo, vertX, vertY);
				break;
			default:
				g.imprimir(grafo);
				break;
			
			}
		}
		sc.close();
	}
}
