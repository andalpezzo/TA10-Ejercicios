package ejercicio2;

import customException.CustomException;

public class TA10Ejercicio2App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		try {
			System.out.println("Mensaje mostrado por pantalla");
			
			//Lanzamos la excepción customizada
			throw new CustomException("Esto es una excepción customizada");
			
		} catch (CustomException mensaje) {
			//Mostramos la excepción capturada y mostramos el mensaje personalizado
			System.out.println("Excepcion capturada con mensaje: " + mensaje.getMessage());
		} finally {
			//Al terminar los indicamos por pantalla
			System.out.println("Programa terminado");
		}
	}
}
