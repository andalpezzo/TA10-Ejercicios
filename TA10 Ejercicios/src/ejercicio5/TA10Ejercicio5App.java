package ejercicio5;

import java.util.Scanner;

public class TA10Ejercicio5App {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int CantidadContraseñas;
			int Longitud;	
			
		try {
			// Pedimos por teclado la longitud de la lista y de la contraseña
			System.out.print("Número de contraseñas que deseas generar: ");
			CantidadContraseñas = scanner.nextInt();
			System.out.print("Introduce la longitud de la contraseña: ");
			Longitud = scanner.nextInt();
			
			// Creamos el array de contraseñas y booleanos de contraseñas fuertes
			Password Contraseñas[] = new Password[CantidadContraseñas];
			boolean ContraseñasFuertes[] = new boolean[CantidadContraseñas];

			for (int i = 0; i < Contraseñas.length; i++) {
				//Generamos una contraseña con la longitud indicada y la guardamos en el array
				Contraseñas[i] = new Password();
				Contraseñas[i].generarPassword(Longitud);
				//Comprobamos si la contraseña es fuerte
				ContraseñasFuertes[i] = Contraseñas[i].esFuerte();
				//Mostramos todas las contraseñas en una liasta junto con si son fuertes o no
				System.out.println("Contraseña " + (i+1) + " --> " + Contraseñas[i].getContraseña() + " --> " + ContraseñasFuertes[i]);
			}
			
		// Hacemos un try catch para mostrar un mensaje si se introduce otro valor en lugar de int 
		} catch (Exception mensaje) {
			System.out.println("Debes introducir un número");
		}
		scanner.close();
	}
}
