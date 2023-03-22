package ejercicio3;

import java.util.Random;

import customException.CustomException;

public class TA10Ejercicio3App {
	public static void main(String[] args) {
		
		Random rand = new Random();
		try {
			System.out.println("Generando número aleatorio...");
			int num = rand.nextInt(1000); // Generamos un número aleatorio entre 0 y 999
			System.out.println("El número aleatorio generado es: " + num);

			//Comprobamos si par o no y lo asignamos a la excepción creada en la anterior actividad 
			if (num % 2 == 0) {
				throw new CustomException("Es par");
			} else {
				throw new CustomException("Es impar");
			}
		} catch (CustomException mensaje) {
			//Mostramos el mensaje por pantalla
			System.out.println(mensaje.getMessage());
		}
	}
}
