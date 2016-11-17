package practica2;

public class Conjunto {

	private boolean elementos[];
	private int numElementos;

	/****************************************************
	 * 
	 * @param numElementos  Número de booleanos que contendrá el conjunto;
	 * 						ejemplo: false, true, true, false, false, false.
	 */
	public Conjunto(int numElementos) {
		this.numElementos = numElementos;
		elementos = new boolean[numElementos];
		for (int i = 0; i < elementos.length; i++)
		  elementos[i] = false;   //por defecto se inicializan a false
	}
	
	public Conjunto(boolean[] v) {
		this(v.length);
		for (int i = 0; i < elementos.length; i++)
		  set(i,v[i]);
	}
	
	public Conjunto(Conjunto c) {
		this(c.size());
		for (int i = 0; i < elementos.length; i++)
		  set(i,c.get(i));
	}

	public Conjunto union(Conjunto c) {
		if (c.size()!=numElementos)
		  return null;
		else {
		  Conjunto aux = new Conjunto(numElementos);
		  for (int i = 0; i < elementos.length; i++)
		    aux.elementos[i] = elementos[i] || c.get(i);
		  return aux;
		}
	}

	public Conjunto interseccion(Conjunto c) {
		if (c.size()!=numElementos)
			  return null;
		else {
		  Conjunto aux = new Conjunto(c.size());
		  for (int i = 0; i < elementos.length; i++)
		    aux.elementos[i] = elementos[i] & c.get(i);
		  return aux;
		}
	}

	public void set(int e, boolean v) {  // ejemplo de la necesidad de usar excepciones
		elementos[e] = v;
	}

    public boolean get(int e) { // ejemplo de la necesidad de usar excepciones
    	return elementos[e];
    }
    
    public int size() {
      return numElementos;
    }

	public boolean equals(Conjunto c) {
		if (c.size()!=numElementos)
		  return false;
		
		boolean iguales = true;
		int i = 0;
		while (i < elementos.length & iguales)
			if (elementos[i] == c.get(i))
				i++;
			else
				iguales = false;
		return iguales;
	}


	public String toString() {
		String cadaux = ("{");
		for (int i = 0; i < elementos.length; i++)
			if (elementos[i])
				cadaux += (i + ",");
		cadaux += ("}\n");
		return cadaux;
	}

	
	public Conjunto clone(Conjunto c) {
	   Conjunto aux = new Conjunto(c);
	   aux = c;
	   return aux;
	}


}
