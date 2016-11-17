// package practica5;

public class EsquemaPruebaFuncionarios {

	 public static void main(String[] a) {

		    Funcionario.setSueldoBase(1300d);
		    Funcionario.set$Trienio(85d);

		    Funcionario[] funcionario = new Funcionario[9];

		    funcionario[7] = new Tedax("Luis Explosiones");
		    funcionario[7].addTrienio();

		    ((Tedax) funcionario[7]).setComplementoPersonal(200d);
		    ((Tedax) funcionario[7]).setComplementoPeligrosidad(700d);

		    double nominaTotal=0d;
		    for (int i=0;i<9;i++) {
		      // polimorfismo: en tiempo de ejecución se determina si un funcionario es profesor, policia o policia-tedax

		    }
		    System.out.println("Total nóminas: "+nominaTotal);

		  }

}
