package ejercicio5;

import java.util.Random;

/**
 * @author paul_
 *
 */
public class Password {
		
	private final int LONGITUD = 8; // Definimos la longitud por defecto en 8
	//Definimos los valores que generará la contraseña
	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	private int longitud;
	private String contraseña;
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}
	
	public Password() {
		this.longitud = LONGITUD;
	}
	
	public String generarPassword(int longitud) {
		String contraseña = "";
		for (int i = 0; i < longitud; i++) {
			Random rand = new Random();
			//Generamos una contraseña con un random de los caracteres preestablecidos anterioirmente
			contraseña += CARACTERES.charAt(rand.nextInt(CARACTERES.length()));
		}
		return contraseña;
	}
	
	public boolean esFuerte() {
		int NumMays = 0; 
		int NumMins = 0;
		int NumNums = 0;
		
		//Recoremos cada caracter de la contraseña, para sumar cuantos tipos de cada hay
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'Z') {
				NumMays+=1;
			}
			if (contraseña.charAt(i) >= 'a' && contraseña.charAt(i) <= 'z') {
				NumMins+=1;
			}
			if (contraseña.charAt(i) >= '0' && contraseña.charAt(i) <= '9') {
				NumNums+=1;
			}
		}
		
		 //Si la contraseña cumple con los requisitos mínimos retornamos true si no false
		if (NumMays >= 2 && NumMins >= 1 && NumNums >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
}
