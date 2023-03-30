package grafo;

public class Grafo {
	
	public int[][] criar(){
		int[][] grafo = new int[0][0];
		return grafo;
	}
	
	public void imprimir(int[][]grafo) {
		int tam = grafo.length;
		int i,j;
		i=0; j=0;
		while(i<tam) {
			j=0;
			while(j<tam) {
				System.out.print(grafo[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public int[][] aumentar(int[][] grafo, int tam){
	    int[][] novoGrafo = new int[tam][tam];
	    for (int i = 0; i < tam-1; i++) {
	        System.arraycopy(grafo[i], 0, novoGrafo[i], 0, tam-1);
	    }
	    for (int i = 0; i < tam; i++) {
	        novoGrafo[tam-1][i] = 0;
	        novoGrafo[i][tam-1] = 0;
	    }
	    this.imprimir(novoGrafo);
	    return novoGrafo;
	}
	
	public boolean adjacente(int[][]grafo,int x,int y) {
		if(grafo.length<=x || grafo.length<=y || x<0 || y<0) {
			return false;
		}
		if(grafo[x][y]==1) {
			
			return true;
		}else
			return false;
		
	}
	
	public void vizinhos(int[][]grafo,int x) {
		int i = 0;
		int tam = grafo.length;
		if(grafo.length<=x || x<0) {
			System.out.println("\nNão Encontrado");
		}else {
			while(i<tam) {
				if(grafo[x][i]==1) {
					System.out.println("\nVertice "+i);
				}
				i++;
			}
		}
	}
	
	public int[][] addVertex(int[][] grafo){
	    int tam = grafo.length;
	    int[][] novoGrafo = aumentar(grafo, tam+1);
	    return novoGrafo;
	}
	
	public int[][] removeVertex(int[][]grafo,int vertice){
		int tam = grafo.length;
		if(tam<=0) {
			return grafo;
		}
		int i,j,i2,j2;
		int[][] novoGrafo = new int[tam-1][tam-1];
		
		
		i=0;i2=0;
		if(vertice<tam && vertice>=0) {
			while(i<tam) {
				j=0;j2=0;
				if(i==vertice) {
					i++;
				}
				while(j<tam) {
					if(j==vertice) {
						j++;
					}
					novoGrafo[i2][j2]=grafo[i][j];
					j++;j2++;
				}
				i++;i2++;
			}
		}else {
			if(vertice>=0) {
				while(i<tam) {
					j=0;
					while(j<tam) {
						
						novoGrafo[i][j]=grafo[i][j];
						j++;
					}
					i++;
				}
			}
		}
		
		return novoGrafo;
	}
	
	public int[][] addEdge(int[][] grafo,int vertA,int vertB){
		if(vertA<grafo.length && vertB<grafo.length) {
			if(grafo[vertA][vertB]==0) {
				grafo[vertA][vertB]=1;
			}
		}
		
		return grafo;
	}
	
	public int[][] removeEdge(int[][] grafo,int vertA,int vertB){
		if(vertA<grafo.length && vertB<grafo.length) {
			if(grafo[vertA][vertB]==1) {
				grafo[vertA][vertB]=0;
			}
		}
		
		return grafo;
	}
	
	

}
