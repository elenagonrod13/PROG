package tipos_de_datos;

public class Ejercicio_05 {

	public static void main(String[] args) {

		byte edadJuan = 20;
		byte edadPedro;
		short sueldoJuan = 1980;
		short sueldoPedro = 800;
		edadPedro = (byte) (edadJuan + 1);

		System.out.println("Edad Juan : " + edadJuan + "\nEdad Pedro : " + edadPedro);
		System.out.println("Sueldo Juan : " + sueldoJuan + "\tSueldo Pedro : " + sueldoPedro);
		System.out.println("Sueldo total : " + (sueldoJuan + sueldoPedro));
		System.out.println("\nFin del programa.");

	}

}
