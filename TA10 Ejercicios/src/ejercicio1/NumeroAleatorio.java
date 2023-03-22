package ejercicio1;

import javax.swing.JOptionPane;

public class NumeroAleatorio {

	private int intentos;

	public NumeroAleatorio() {
		this.intentos = 0;
	}

	//Funcón que genera número aleatorio entre el 1 y el 500
	public int generaNumAleatorio() {
		return (int) (Math.random() * 500 + 1);
	}

	//Función que mira si el numero introducido es igual al introduc 
	public boolean comprobarNumero(int NumeroAleatorio, int NumeroIntroducido) {
		boolean IsAcertado = false;

		//Si es más pequeño, suma un intento y devuelve false
		if (NumeroAleatorio < NumeroIntroducido) {
			JOptionPane.showMessageDialog(null, "El número " + NumeroIntroducido + " es más pequeño que el número a encontrar");
			intentos++;
			IsAcertado = false;
		}
		//Si es más pequeño, suma un intento y devuelve false
		else if (NumeroAleatorio > NumeroIntroducido) {
			JOptionPane.showMessageDialog(null, "El número " + NumeroIntroducido + " es más grande que el número a encontrar");
			intentos++;
			IsAcertado = false;
		}
		//Si es igual, suma un intento y devuelve true
		else {
			intentos++;
			JOptionPane.showMessageDialog(null, "El número " + NumeroIntroducido + " es igual que el número a encontrar\n Lo has encontrado en: " + intentos + " intentos");
			IsAcertado = true;
		}
		return IsAcertado;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

}
