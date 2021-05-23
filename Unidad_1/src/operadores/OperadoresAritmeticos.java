package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		/* a) Multiplicar 2,2 * 1,0, y al resultado sumarle 5,0. Guardar el resultado en
		un identificador llamado impuesto. Visualizar el resultado.*/
		
		float impuesto = 2.2f * 1.0f + 5.0f;
		System.out.println("a) Impuesto : "+impuesto);
		
		/* b) Definir una variable, impuesto2 que recoja el resultado de la expresión
		aritmética siguiente: a la división entera de 12 entre 2, sumarle -8.
		Visualizar el resultado.*/
		
		int impuesto2 = 12/2+(-8);
		System.out.println("b) Impuesto2 : " +impuesto2);
		
		/* c) Definir una variable cociente y otra resto, que recoja el cociente entero
		y el resto, de dividir 16 entre 3. Visualiza el resultado. Después define una
		variable que llamaremos cociente_decimal, que recoja el cociente con
		decimales.*/
		
		int cociente, resto;
		float cociente_decimal;
		cociente=16/3;
		resto=16%3;
		cociente_decimal=16f/3;
		System.out.println("c) Cociente : "+cociente+"\n\tCociente_decimal : "+cociente_decimal+"\n\tResto : "+resto);
		
		/* d) Asigna a una variable nueve, el valor 9. Haz un programa que defina
		una variable postIncremento, que tome el valor que tiene nueve y que
		incremente en uno la variable nueve.*/
		
		int nueve=9;
		int postIncremento = nueve++;
		System.out.println("d) Nueve : "+nueve+"\n\tPost Incremento : "+postIncremento);
	
		/* e) Define una variable preIncremento, que tome incrementado en 1, el
		valor de nueve, y esta variable acabe también incrementando en 1 su
		valor. Visualiza resultados.*/
		
		int preIncremento = ++nueve;
		System.out.println("e) Nueve : "+nueve+"\n\tPre Incremento : "+preIncremento);
	
		/* f) Define una variable postDecremento que tome el valor de nueve y
		decremente nueve en 1. Visualiza resultados.*/
		
		int postDecremento = nueve--;
		System.out.println("f) Nueve : "+nueve+"\n\tPost Decremento : "+postDecremento);
		
		/* g) Define una variable preDecremento, que tome decrementando en 1 el
		valor de nueve y esta variable acabe también decrementada en 1.*/
		
		int preDecremento = --nueve;
		System.out.println("g) Nueve : "+nueve+"\n\tPre Decremento : "+preDecremento);
		
		System.out.println("\nFin del programa.");

	}

}
