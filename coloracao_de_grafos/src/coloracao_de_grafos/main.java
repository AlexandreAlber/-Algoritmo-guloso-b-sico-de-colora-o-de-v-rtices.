package coloracao_de_grafos;
import java.text.SimpleDateFormat;
import java.util.Date;



public class main {
	  // Driver method
    public static void main(String args[])
    {
    	double inicio;
    	double fim;
    	
    	
    	inicio = System.currentTimeMillis();
    	 Grafo g1 = new Grafo(8);
    	  g1.adiciona_aresta(0, 1);
    	  g1.adiciona_aresta(0, 6);
    	  g1.adiciona_aresta(0, 7);
    	  g1.adiciona_aresta(1, 2);
    	  g1.adiciona_aresta(1, 7);
    	  g1.adiciona_aresta(2, 3);
    	  g1.adiciona_aresta(2, 7);
    	  g1.adiciona_aresta(3, 4);
    	  g1.adiciona_aresta(3, 7);
    	  g1.adiciona_aresta(4, 5);
    	  g1.adiciona_aresta(4, 7);
    	  g1.adiciona_aresta(5, 6);
    	  g1.adiciona_aresta(5, 7);
    	  g1.adiciona_aresta(6, 7);
        System.out.println("Resultado para o grafo 1:");
        g1.colore_vertice();
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
 
        inicio = System.currentTimeMillis();
        System.out.println();
        Grafo g2 = new Grafo(6) ;
        g2.adiciona_aresta(0, 1);
        g2.adiciona_aresta(0, 3);
        g2.adiciona_aresta(0, 5);
        g2.adiciona_aresta(1, 2);
        g2.adiciona_aresta(1, 4);
        g2.adiciona_aresta(2, 3);
        g2.adiciona_aresta(2, 5);
        g2.adiciona_aresta(3, 4);
        g2.adiciona_aresta(4, 5);
        System.out.println("Resultado para o grafo 2:");
        g2.colore_vertice();
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
        
        inicio = System.currentTimeMillis();
        System.out.println();
        Grafo g3 = new Grafo(10);
        g3.adiciona_aresta(0, 1);
        g3.adiciona_aresta(0, 4);
        g3.adiciona_aresta(0, 5);
        g3.adiciona_aresta(1, 2);
        g3.adiciona_aresta(1, 6);
        g3.adiciona_aresta(2, 3);
        g3.adiciona_aresta(2, 7);
        g3.adiciona_aresta(3, 4);
        g3.adiciona_aresta(3, 8);
        g3.adiciona_aresta(4, 9);
        g3.adiciona_aresta(5, 7);
        g3.adiciona_aresta(5, 8);
        g3.adiciona_aresta(6, 8);
        g3.adiciona_aresta(6, 9);
        g3.adiciona_aresta(7, 9);
        System.out.println("Resultado para o grafo 3:");
        g3.colore_vertice();
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
        
        inicio = System.currentTimeMillis();
        System.out.println();
        Grafo g4 = new Grafo(12);
        g4.adiciona_aresta(0, 1);
        g4.adiciona_aresta(0, 6);
        g4.adiciona_aresta(0, 7);
        g4.adiciona_aresta(1, 2);
        g4.adiciona_aresta(1, 10);
        g4.adiciona_aresta(2, 3);
        g4.adiciona_aresta(2, 11);
        g4.adiciona_aresta(3, 4);
        g4.adiciona_aresta(3, 11);
        g4.adiciona_aresta(4, 5);
        g4.adiciona_aresta(4, 9);
        g4.adiciona_aresta(5, 6);
        g4.adiciona_aresta(5, 9);
        g4.adiciona_aresta(6, 7);
        g4.adiciona_aresta(7, 8);
        g4.adiciona_aresta(8, 9);
        g4.adiciona_aresta(8, 10);
        g4.adiciona_aresta(10, 11);
        System.out.println("Resultado para o grafo 4:");
        g2.colore_vertice();
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
        
        
        System.out.println();
        inicio = System.nanoTime();
        Grafo g5 = new Grafo(6);
        g5.adiciona_aresta(0, 1);
        g5.adiciona_aresta(0, 4);
        g5.adiciona_aresta(1, 2);
        g5.adiciona_aresta(1, 4);
        g5.adiciona_aresta(2, 3);
        g5.adiciona_aresta(3, 4);
        g5.adiciona_aresta(3, 5);
        System.out.println("Resultado para o grafo 5:");
        g5.colore_vertice();
        fim = System.nanoTime();
        System.out.println("Tempo: " + (fim - inicio));
        
      
}
}
