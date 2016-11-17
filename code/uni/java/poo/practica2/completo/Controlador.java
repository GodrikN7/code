package practica2;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Button;

public class Controlador implements ActionListener {
	
	private Operador op;
	private Button[] resultado;
	
	public Controlador (Operador op, Button[] resultado) {
		this.op = op;
		this.resultado = resultado;
	}
	
	public void actionPerformed (ActionEvent e) {
	  Component c = (Component) e.getSource();
	  String nombre = c.getName();
	  if (nombre.length()==2) {
		int conjunto = nombre.charAt(0)-'0';
		int elemento = nombre.charAt(1)-'0';
		Conjunto conj = op.get(conjunto);
		if (conj.get(elemento)) {
		  conj.set(elemento, false);
		  c.setBackground(Color.RED);
		} else {
		  conj.set(elemento, true);
		  c.setBackground(Color.GREEN);			
		}
			
	  } else { // acción
		  if (nombre.equals("salir"))
			  System.exit(0);
		  else {			  
		    boolean[] b = new boolean[resultado.length];
		    for (int i=0;i<resultado.length;i++)
		      b[i] = true;
		    
		    Conjunto conj;
		    if (nombre.equals("union")) 
		     conj = op.union(b);	    	   
		   else  
		     conj = op.interseccion(b);
		       
		    for (int i=0;i<resultado.length;i++)
		      if (conj.get(i))
		        resultado[i].setBackground(Color.GREEN);
		      else
			    resultado[i].setBackground(Color.RED);						  
	      }
	   }
	}

}
