package operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {

		/* a) Definir la variable frio inicializada a false. El programa debe imprimir
		la variable frio, y nos debe salir por pantalla true.*/
		
		boolean frio=false;
		System.out.println("a) Frio : "+!frio);
		
		/* b) Imprimir la variable oportunidad, y que nos salga el valor true, sabiendo
		que es la combinación de tres variables, bueno, bonito y barato, que debes
		declarar e inicializar previamente (oportunidad debe tener la sintaxis
		siguiente: oportunidad = bueno [operador] bonito [operador] barato. Debes
		colocar los operadores binarios apropiados).*/
		
		boolean bueno=true , bonito= true, barato = true;
		boolean oportunidad = bueno && bonito && barato;
		System.out.println("b) Oportunidad : "+oportunidad);
		
		/* c) Imprimir la variable mojado y que nos salga true, sabiendo que es la
		combinación de dos variables, llueve y riego, esta última inicializada a
		false (mojado debe tener la sintaxis siguiente: mojado = llueve [operador]
		riego . Debes colocar el operador binarios apropiado).*/

		boolean llueve = true, riego = false;
		boolean mojado = llueve || riego;
		System.out.println("c) Mojado : "+mojado);

		System.out.println("\nFin del programa.");
	}

}
