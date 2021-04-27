package it.polito.tdp.metroparis.model;

import org.jgrapht.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class ProvaGrafo {

	public static void main(String[] args) {
	
		Graph<String, DefaultEdge> grafo = new SimpleGraph<>(DefaultEdge.class);
		
		grafo.addVertex("UNO");
		grafo.addVertex("DUE");
		grafo.addVertex("TRE");
		
		grafo.addEdge("UNO", "TRE");
		grafo.addEdge("TRE", "DUE");
		//grafo.addEdge("UNO", "SETTE"); //Scatena un'eccezione 
		//grafo.addEdge("UNO", "UNO"); //loop non concesso --> Scatena un'eccezione
		
		System.out.println(grafo);
		
		

	}

}
