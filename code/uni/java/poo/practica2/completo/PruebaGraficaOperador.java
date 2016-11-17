package practica2;

import java.awt.*;

public class PruebaGraficaOperador {
	
	private Frame f;
	private Operador op;
	private Panel panel;
	private Button[][] elemento;
	private Button[] resultado;
	private Button union,interseccion,salir;
	
	public PruebaGraficaOperador(int numConjuntos, int numElementos) {
	  f = new Frame();
	  f.setSize(800, 400);
	  f.setTitle("Práctica 2");
	  
	  panel = new Panel(new GridLayout(numConjuntos+2,numElementos));
	  f.add(panel);
	  
	  elemento = new Button[numConjuntos][numElementos];
	  resultado = new Button[numElementos];
	  
	  for (int c=0;c<numConjuntos;c++) 
		for (int e=0;e<numElementos;e++) { 
		  elemento[c][e] = new Button(""+e); 
		  elemento[c][e].setName(""+c+e);
		}
	  for (int e=0;e<numElementos;e++) 
		  resultado[e] = new Button("R"+e); 

	  union = new Button("unión");
	  union.setName("union");
	  interseccion = new Button("intersección");
	  interseccion.setName("interseccion");
	  salir = new Button("salir");
	  salir.setName("salir");
	  
	  op = new Operador(numConjuntos, numElementos);
	  visualizaConjuntos(op);
	  
	  f.setVisible(true);
	}
	
	private void visualizaConjuntos(Operador op) {
	
	  Controlador contr = new Controlador(op,resultado);	
		
	  for (int c=0;c<op.getNumConjuntos();c++) 
		for (int e=0;e<op.getNumElementosEnConjunto();e++) {
		  panel.add(elemento[c][e]);
		  elemento[c][e].setBackground(Color.RED);
		  elemento[c][e].addActionListener(contr);
		}

	  for (int e=0;e<op.getNumElementosEnConjunto();e++){
		  panel.add(resultado[e]);
		  resultado[e].setBackground(Color.ORANGE);
	  }
	  panel.add(union);
	  panel.add(interseccion);	  
	  panel.add(salir);	
	  union.addActionListener(contr);
	  interseccion.addActionListener(contr);
	  salir.addActionListener(contr);
	}

	public static void main(String[] args) {
		new PruebaGraficaOperador(5,5);

	}

}
