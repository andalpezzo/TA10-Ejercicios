package ejercicio4;


import java.util.InputMismatchException;
import java.util.Scanner;

import customException.CustomException;

public class Calculos {
	double Num1;
	double Num2;
	double Resultado = 0;
	String Operacion ="";
	String RealizarOtraOperacion = "SI";
	String OtraOperacion;

	public void Calcular(Scanner scanner) {
		// Pedimos operaciones hasta que salte un error o digamos que no queremos hacer otra operación
		while (RealizarOtraOperacion.equals("SI")) {
			try {
				// Mostramos las opciones por pantalla
				System.out.println("Introduce la operación que quieres realizar: [ Suma | Resta | Multiplicación | Potencia | Raíz cuadrada | Raíz cúbica | División ]");
				Operacion = scanner.next().toUpperCase();
				
				if(Operacion.equals("SUMA") || Operacion.equals("RESTA") || Operacion.equals("MULTIPLICACION") || Operacion.equals("POTENCIA") || Operacion.equals("DIVISION")) {
					System.out.print("Introduce el primer número: ");
					Num1 = scanner.nextDouble();
					System.out.print("Introduce el segundo número: ");
					Num2 = scanner.nextDouble();
				} else if(Operacion.equals("RAIZ CUADRADA") || Operacion.equals("RAIZ CUBICA")) {
					System.out.print("Introduce un número: ");
					Num1 = scanner.nextDouble();
				} else {
					throw new CustomException("No se ha introducido la operación incorrecta");
				}

				switch (Operacion) {
				case "SUMA":
					Resultado = Num1 + Num2;
					System.out.println("La suma de " + Num1 + " + " + Num2 + " es " + Resultado);
					break;
				case "RESTA":
					Resultado = Num1 - Num2;
					System.out.println("La resta de " + Num1 + " - " + Num2 + " es " + Resultado);
					break;
				case "MULTIPLICACION":
					Resultado = Num1 * Num2;
					System.out.println("La multiplicación de " + Num1 + " * " + Num2 + " es " + Resultado);
					break;
				case "POTENCIA":
					Resultado = Math.pow(Num1, Num2);
					System.out.println("La potencia de " + Num1 + " ^ " + Num2 + " es " + Resultado);
					break;
				case "RAIZ CUADRADA":
					if (Num1 < 0) {
						//El valor ha de ser mayor que 0
						throw new CustomException("No se puede hacer la raíz cuadrada de un número negativo");
					}
					Resultado = Math.sqrt(Num1);
					System.out.println("-La raíz cuadrada de " + Num1 + " es " + Resultado);
					break;
				case "RAIZ CUBICA":
					Resultado = Math.cbrt(Num1);
					System.out.println("La raíz cúbica de " + Num1 + " es " + Resultado);
					break;
				case "DIVISION":
					if (Num2 == 0) {
						//El valor no piede ser 0
						throw new CustomException("No se puede dividir entre 0");
					}
					Resultado = Num1 / Num2;
					System.out.println("La división de " + Num1 + " / " + Num2 + " = " + Resultado);
					break;
				}
				
				scanner.nextLine();
				System.out.println(" \nDeseas realizar otra operación? [ SI | NO ]");
				RealizarOtraOperacion = scanner.nextLine().toUpperCase();
				System.out.println("");
			
			} catch (InputMismatchException  mensaje) {
				System.out.println("El dato introducido no es un número \n ");
				scanner.nextLine();
			} catch (Exception mensaje) {
				System.out.println(mensaje.getMessage() + "\n ");
			} 
		}
	}
}
