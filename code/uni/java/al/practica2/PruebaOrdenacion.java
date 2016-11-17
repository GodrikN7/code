import java.util.Random;

/**
 * La clase PruebaOrdenacion se encarga de probar todos y cada uno de los algoritmos de ordenacion in-situ implementados en la clase
 * Ordenacion. Cada algoritmo de ordenación se aplica a un vector con 8 items con unas claves concretas y a uno con el número de elementos
 * que indique el usuario y con las claves inicializadas aleatoriamante
 */

public class PruebaOrdenacion {


    /**
     * Este constructor se encarga de realizar las pruebas de ordenacion de todos los métodos sobre un vector concreto
     */
    public PruebaOrdenacion(){

        // Se crea un vector de Items concreto (ver creaVectorConcreto)
        Item[] vectorConcreto = creaVectorConcreto();

        pruebaAlgoritmos(vectorConcreto);
    }

    /**
     * Este constructor se encarga de realizar las pruebas de ordenacion de todos los métodos sobre un vector de claves aleatorias
     * @param tamanioAleatorio Tamaño del vector de items aleatorio con el que se desea realizar las pruebas
     */
    public PruebaOrdenacion(int tamanioAleatorio){

        // Se crea un vector de Items aleatorio (ver creaVectorAleatorio)
        Item[] vectorAleatorio = creaVectorAleatorio(tamanioAleatorio);

        pruebaAlgoritmos(vectorAleatorio);
    }

    /**
     * Este método permite crear un vector de Items con los valores {1/"E", 2/"F", 3/"B", 9/"D", 5/"H", 6/"C", 7/"A", 8/"G"}
     */
    private Item[] creaVectorConcreto(){
        Item[] vector = new Item[8];
        vector[0] = new Item(1, "E");
        vector[1] = new Item(2, "F");
        vector[2] = new Item(3, "B");
        vector[3] = new Item(9, "D");
        vector[4] = new Item(5, "H");
        vector[5] = new Item(6, "C");
        vector[6] = new Item(7, "A");
        vector[7] = new Item(8, "G");
        return vector;
    }

    /**
     * Este método permite crear un vector de Items con el tamaño que se indique como parámetro,
     * e inicializa todas sus claves con valores aleatorios.
     * @param tamanio Entero que indicará el tamaño del vector a crear
     */
    private Item[] creaVectorAleatorio(int tamanio){
        Random generador = new Random();

        Item[] vector = new Item[tamanio];
        for (int i=0;i < tamanio; i++) {
            vector[i] = new Item(10 + generador.nextInt(9*tamanio), "A");
        }
        return vector;
    }

    /**
     * Este método se encarga de aplicar los 7 algoritmos de ordenacion al vector que se pasa como parametro. Al final del metodo
     * se vuelca por consola una tabla resumen con los tiempos consumidos por cada algoritmo de ordenacion
     * @param vector Vector de Items sin ordenar
     */
    private void pruebaAlgoritmos(Item[] vector){
        long tiempos[] = new long[5];
        tiempos[0] = pruebaInsercion(vector);
        tiempos[1] = pruebaSeleccion(vector);
        tiempos[2] = pruebaBurbuja(vector);
        tiempos[3] = pruebaBurbujaOptimizado(vector);
        tiempos[4] = pruebaCombSort(vector);
        generarResumenTiempos(tiempos);
    }

    /**
     * Aplica el algoritmo (in-situ) de ordenacion por insercion
     * @param vectorDesordenado Vector de Items a ordenar
     * @return tiempo en nanosegundos consumido por el algoritmo
     */
    private long pruebaInsercion(Item[] vectorDesordenado){
        Item[] vector;
        long t;

        // PRUEBA DEL ALGORITMO DE ORDENACION POR INSERCION
        //Por cada ordenación hay que clonar el vector original dado que los métodos de ordenación son in situ
        vector = clonaVector(vectorDesordenado);
        trazaCabecera("INSERCION.", vector);

        t=Ordenacion.insercion(vector);

        trazaCierre(vector, t);
        return t;
    }



    /**
     * Aplica el algoritmo (in-situ) de ordenacion por seleccion
     * @param vectorDesordenado Vector de Items a ordenar
     * @return tiempo en nanosegundos consumido por el algoritmo
     */
    private long pruebaSeleccion(Item[] vectorDesordenado){
        Item[] vector;
        long t;

        // PRUEBA DEL ALGORITMO DE ORDENACION POR SELECCION
        //Por cada ordenación hay que clonar el vector original dado que los métodos de ordenación son in situ
        vector = clonaVector(vectorDesordenado);
        trazaCabecera("SELECCION.", vector);

        t=Ordenacion.seleccion(vector);

        trazaCierre(vector, t);
        return t;
    }

    /**
     * Aplica el algoritmo (in-situ) de ordenacion por  burbuja
     * @param vectorDesordenado Vector de Items a ordenar
     * @return tiempo en nanosegundos consumido por el algoritmo
     */
    private long pruebaBurbuja(Item[] vectorDesordenado){
        Item[] vector;
        long t;

        // PRUEBA DEL ALGORITMO DE ORDENACION POR  BURBUJA
        //Por cada ordenación hay que clonar el vector original dado que los métodos de ordenación son in situ
        vector = clonaVector(vectorDesordenado);
        trazaCabecera("BURBUJA.", vector);

        t=Ordenacion.burbuja(vector);

        trazaCierre(vector, t);
        return t;
    }

    /**
     * Aplica el algoritmo (in-situ) de ordenacion por burbuja optimizado
     * @param vectorDesordenado Vector de Items a ordenar
     * @return tiempo en nanosegundos consumido por el algoritmo
     */
    private long pruebaBurbujaOptimizado(Item[] vectorDesordenado){
        Item[] vector;
        long t;

        // PRUEBA DEL ALGORITMO DE ORDENACION POR BURBUJA OPTIMIZADO
        //Por cada ordenación hay que clonar el vector original dado que los métodos de ordenación son in situ
        vector = clonaVector(vectorDesordenado);
        trazaCabecera("BURBUJA OPTIMIZADO.", vector);

        t=Ordenacion.burbujaOptimizado(vector);

        trazaCierre(vector, t);
        return t;
    }

    /**
     * Aplica el algoritmo (in-situ) de ordenacion combSort
     * @param vectorDesordenado Vector de Items a ordenar
     * @return tiempo en nanosegundos consumido por el algoritmo
     */
    private long pruebaCombSort(Item[] vectorDesordenado){
        Item[] vector;
        long t;

        // PRUEBA DEL ALGORITMO DE ORDENACION COMBSORT
        //Por cada ordenación hay que clonar el vector original dado que los métodos de ordenación son in situ
        vector = clonaVector(vectorDesordenado);
        trazaCabecera("COMBSORT.", vector);

        t=Ordenacion.combSort(vector);

        trazaCierre(vector, t);
        return t;
    }

    /**
     * Vuelca por consola el contenido del vector de datos
     * @param datos Vector de Items cuyo contenido se vuelca por consola
     */
    public void imprimirClavesVector(Item[] datos){
        for(int i=0; i<datos.length; i++){
            if(i>0) System.out.print(", ");
            System.out.print(datos[i].getClave());
        }
        System.out.println();
    }

    /**
     * Vuelca por pantalla la cabecera del algoritmo a aplicar y el vector a ordenar
     * @param metodo Cadena de caracteres que contendrá el nombre del algoritmo a aplicar
     * @param vector Vector de Items a ordenar
     */
    private void trazaCabecera(String metodo, Item[] vector){
        System.out.println("----------------------------------");
        System.out.println(metodo);
        System.out.println("----------------------------------");
        System.out.print("Claves del vector antes de ordenar:   ");
        imprimirClavesVector(vector);
    }

    /**
     * Vuelca por pantalla la traza final del algoritmo una vez aplicado
     * @param vector Vector de Items ordenados
     * @param t Tiempo consumido por el algoritmo en ordenar los datos del vector
     */
    private void trazaCierre(Item[] vector, double t){
        System.out.print("Claves del vector despues de ordenar: ");
        imprimirClavesVector(vector);
        System.out.println("Ordenación realizada en " + t + " [ns]");
        System.out.println();
    }

    /**
     * Vuelca por consola la tabla de tiempos que se pasa como parámetro
     * @param tiempos Vector que contendrá los tiempos de ejecucion de los 7 algoritmos de ordenacion
     */
    private void generarResumenTiempos(long[] tiempos){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("RESUMEN DE TIEMPOS DE EJECUCION DE LOS 5 ALGORITMOS DE ORDENACION");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Insercion       Seleccion       Burbuja         BurbujaOPt      CombSort");
        System.out.println("---------------------------------------------------------------------------------------");
        for (long t: tiempos){
            System.out.print(t / 10E6);
            for (int j = Double.toString((t/10E6)).length(); j < 16; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("[miliseg]");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();

    }

    /**
     * Dado el vector de Items que se pasa como parámetro, este método se encarga de hacer una copia independiente del mismo
     * en otro vector de Items.
     * @param vector a clonar
     * @return copia independiente del vector que se pasa como parámetro
     */
    private Item[] clonaVector(Item[] vector){
        Item[] nuevoVector = new Item[vector.length];
        System.arraycopy(vector, 0, nuevoVector, 0, vector.length);
        return nuevoVector;
    }


    public static void main(String[] args){

        new PruebaOrdenacion();
        new PruebaOrdenacion(100);
    }
}
