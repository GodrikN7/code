/**
 * La clase Ordenacion incorpora un conjunto de métodos estáticos que implementan distintos algoritmos de ordenacion.
 * Dado que estos algoritmos son de tipo "in-situ", la ordenación de los elementos
 * del vector se realiza sobre el propio vector, sin utilizar un vector auxiliar, por lo que el resultado de la ordenación
 * queda almacenado en el parámetro que se pasa en la llamada al método. En cada uno de los métodos se devuelve el tiempo
 * empleado por el algoritmo en realizar la ordenación (en nanosegundos).
 */


public class Ordenacion {


	/**
	 * Aplica el algoritmo de ordenación por Insercion sobre el vector datos.
	 *
	 * @param datos Vector de datos a ordenar. El resultado del vector ordenado se mantiene en este parámetro
	 * @return tiempo en ns consumido por el algoritmo
	 */
	public static long insercion(Item[] datos) {
		int j;
		Item elemento;
		long t1, t2;

		t1 = System.nanoTime();
		for (int i = 1; i < datos.length; i++) {
			elemento = datos[i];
			j = i;
			while ((j > 0) && (elemento.getClave() < datos[j - 1].getClave())) {
				datos[j] = datos[j - 1];
				j--;
			}
			datos[j] = elemento;
		}
		t2 = System.nanoTime();
		return (t2 - t1);
	}


	/**
	 * Aplica el algoritmo de ordenación por Seleccion sobre el vector datos.
	 *
	 * @param datos Vector de datos a ordenar. El resultado del vector ordenado se mantiene en este parámetro
	 * @return tiempo en ns consumido por el algoritmo
	 */
	public static long seleccion(Item[] datos) {
		long t1, t2;
		t1 = System.nanoTime();

		int i, j, k;
		for (i = 0; i < datos.length; i++) {
			k = i;
			for (j = i + 1; j < datos.length; j++) {
				if (datos[j].getClave() < datos[k].getClave()) {
					k = j;
				}
			}
			Item aux = datos[i];
			datos[i] = datos[k];
			datos[k] = aux;
		}

		t2 = System.nanoTime();
		return (t2 - t1);

	}

	/**
	 * Aplica el algoritmo de ordenación por Burbuja sobre el vector datos.
	 *
	 * @param datos Vector de datos a ordenar. El resultado del vector ordenado se mantiene en este parámetro
	 * @return tiempo en ns consumido por el algoritmo
	 */
	public static long burbuja(Item[] datos) {
		long t1, t2;
		t1 = System.nanoTime();

		for (int j = datos.length - 1; j >= 0; j--) {
			for (int i = 0; i < j; i++) {
				if (datos[i].getClave() > datos[i + 1].getClave()) {
					Item aux = datos[i];
					datos[i] = datos[i + 1];
					datos[i + 1] = aux;
				}
			}
		}

		t2 = System.nanoTime();
		return (t2 - t1);
	}


	/**
	 * Aplica el algoritmo de ordenación por Burbuja Optimizado sobre el vector datos.
	 *
	 * @param datos Vector de datos a ordenar. El resultado del vector ordenado se mantiene en este parámetro
	 * @return tiempo en ns consumido por el algoritmo
	 */
	public static long burbujaOptimizado(Item[] datos) {
		long t1, t2;
		t1 = System.nanoTime();

		boolean ordenado = false;
		int j = datos.length - 1;

		while (!ordenado) {
			ordenado = true;
			for (int i = 0; i < j; i++) {
				if (datos[i].getClave() > datos[i + 1].getClave()) {
					Item aux = datos[i];
					datos[i] = datos[i + 1];
					datos[i + 1] = aux;
					ordenado = false;
				}
			}
			j--;
		}
		t2 = System.nanoTime();
		return (t2 - t1);
	}

	/**
	 * Aplica el algoritmo de ordenación CombSort sobre el vector datos.
	 *
	 * @param datos Vector de datos a ordenar. El resultado del vector ordenado se mantiene en este parámetro
	 * @return tiempo en ns consumido por el algoritmo
	 */
	public static long combSort(Item[] datos) {

		long t1, t2;
		t1 = System.nanoTime();

		boolean ordenado = false;
		int gap = datos.length - 1;
		while (!ordenado || gap > 1) {
			ordenado = true;
			int i = 0;
			while (i + gap < datos.length) {
				if (datos[i].getClave() > datos[i + gap].getClave()) {
					Item aux = datos[i];
					datos[i] = datos[i + gap];
					datos[i + gap] = aux;
					ordenado = false;
				}
				i++;
			}
			if (gap > 1)
				gap = (int) Math.floor(gap / 1.3);
		}

		t2 = System.nanoTime();
		return (t2 - t1);
	}
}

