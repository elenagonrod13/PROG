package operadores;

public class OperadoresComparacion {

	public static void main(String[] args) {

		int edadJuan = 6, edadPedro = 6, edadJulio = 21;
		int contador = 14;
		double hipotenusa = 206.73, cateto1 = 13.2, cateto2 = 5.7;

		System.out.println("a) Es " + (edadJuan < 18) + " que Juan es menor de edad.");

		System.out.println("b) Es " + (edadJuan == edadPedro) + " que Juan tiene la misma edad que Pedro.");

		System.out.println("c) Es " + (edadJulio > edadPedro) + " que Julio tiene más edad que Pedro.");

		System.out.println("d) Es " + (Math.pow(hipotenusa, 2) == Math.pow(cateto1 + cateto2, 2)) + " que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado.");

		System.out.println("e) Es " + (cateto1 > cateto2) + " que el cateto1 es mayor que el cateto2.");

		System.out.println("f) Es " + (contador == 8) + " que contado es igual a 8.");

		System.out.println("g) Es " + (contador != 8) + " que contandor es distinto de 8.");

		System.out.println("\nFin del programa.");

	}

}
