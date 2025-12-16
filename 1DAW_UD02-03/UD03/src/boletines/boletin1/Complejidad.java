package boletines.boletin1;

import java.util.Random;
import java.util.Scanner;

public class Complejidad
{

	public static void adivinaNumero()
	{
		/*
		 * Este método genera un número aleatorio del 1 al 100. A continuación, va
		 * pidiendo números y va mostrando por pantalla si el número a adivinar es mayor
		 * o menor que el introducido, además de los intentos que te quedan (tienes 10
		 * intentos para acertarlo). El programa termina cuando se acierta el número
		 * (además muestra por pantalla en cuantos intentos lo has acertado), si se
		 * llega al limite de intentos te muestra el número que había generado.
		 */

		Scanner sc = new Scanner(System.in);
		Random r1 = new Random();

		int random = r1.nextInt(1, 101);
		int respuesta;
		int intentos = 9;
		boolean a = true;

		do
		{
			System.out.println("Adivina el numero del 1 al 100: ");
			respuesta = sc.nextInt();

			if (intentos == 0)
			{
				System.out.println("Has perdido, el numero era: " + random);
				a = false;
			}

			else if (respuesta == random)
			{
				System.out.printf("¡Felicidades! Has acertado en %d intentos", 10 - intentos);
				a = false;
			}

			else if (respuesta < random)
			{
				System.out.println("Has fallado, el numero es mayor");
				intentos--;
				System.out.printf("Intentos restantes: %d \n", intentos + 1);
				System.out.println("---------------------------------------------------------------");
			}

			else if (respuesta > random)
			{
				System.out.println("Has fallado, el numero es menor");
				intentos--;
				System.out.printf("Intentos restantes: %d \n", intentos + 1);
				System.out.println("---------------------------------------------------------------");

			}

		} while (a);

		sc.close();
	}

	public static void numerosAfortunados()
	{
		/*
		 * Según cierta cultura, los números de la suerte son el 3, el 7, el 8 y el 9.
		 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el
		 * 6. Un número es afortunado si contiene más números de la suerte que de la
		 * mala suerte. Este método imprime por pantalla si un número introducido por el
		 * usuario es afortunado o no.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame el numero para saber si es afortunado o no: ");
		int numero = sc.nextInt();

		int numAfor = 0;
		int numDesafor = 0;

		while (numero > 0)
		{
			int cifra = numero % 10;
			numero = numero / 10;

			if (cifra == 3 || cifra == 7 || cifra == 8 || cifra == 9)
			{
				numAfor++;
			}

			else if (cifra == 0 || cifra == 1 || cifra == 2 || cifra == 4 || cifra == 5 || cifra == 6)
			{
				numDesafor++;
			}
		}

		if (numAfor > numDesafor)
		{
			System.out.println("Tu numero es afortunado");
		} 
		
		else
		{
			System.out.println("Tu numero es desafortunado");
		}

		sc.close();

	}

	public static void validaPassword()
	{
		int mayus = 0;
		int minus = 0;
		int nums = 0;
		int esp = 0;

		Scanner sc = new Scanner(System.in);
		String pass;

		do
		{
			mayus = 0;
			minus = 0;
			nums = 0;
			esp = 0;

			System.out.println("Ingrese una contraseña: ");
			pass = sc.next();

			for (int i = 0; i < pass.length(); i++)
			{
				String caracter = pass.substring(i, i + 1);

				if (caracter.matches("[A-Z]"))
				{
					mayus++;
				} 
				
				else if (caracter.matches("[a-z]"))
				{
					minus++;
				} 
				
				else if (caracter.matches("[0-9]"))
				{
					nums++;
				} 
				
				else if (caracter.matches("[@#~*%&/]"))
				{
					esp++;
				}
			}

			if (minus >= 2 && mayus >= 2 && nums >= 2 && esp >= 2)
			{
				System.out.println("La contraseña es válida");
			} 
			
			else
			{
				System.out.println("Contraseña invalida, vuelve a intentarlo");
			}
			
		} while (!(minus >= 2 && mayus >= 2 && nums >= 2 && esp >= 2));
		
		sc.close();
	}
}
