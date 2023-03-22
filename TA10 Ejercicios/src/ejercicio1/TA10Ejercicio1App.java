package ejercicio1;

import javax.swing.JOptionPane;

public class TA10Ejercicio1App {
	public static void main(String[] args) {
		
		//Declaracíon de variables
		int NumeroGenerado;
		int NumeroIntroducido = 0;
		boolean isAcertado = false;

		//Creamos el objecto NumeroAleatorio
		NumeroAleatorio NumeroAleatorio = new NumeroAleatorio();
		//Llamamos a la función que números aleatorios entre el 1 y el 500
		NumeroGenerado = NumeroAleatorio.generaNumAleatorio();

		// Pedimos un número hasta que no se acierte
		while (isAcertado == false) {
			//Try-Catch que controla que se tiene que introducir un número entero
			try {
				NumeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
				isAcertado = NumeroAleatorio.comprobarNumero(NumeroGenerado, NumeroIntroducido);

			}
			//Si no es un número entero, se lo diermos por ventana e incrementaremos el número de intentos
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El dato introducido no es un número", "Error", 0);
				NumeroAleatorio.setIntentos(NumeroAleatorio.getIntentos() + 1);

			}
		}
	}
}
