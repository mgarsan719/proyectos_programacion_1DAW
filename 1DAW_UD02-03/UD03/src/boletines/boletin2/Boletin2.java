package boletines.boletin2;

import java.util.Random;
import java.util.Scanner;

public class Boletin2
{

	/*
	 * Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'NO VOCAL'
	 * en caso contrario, el programa termina cuando se introduce un punto.
	 */
	public static void esVocal()
	{
		Scanner sc = new Scanner(System.in);
		String caracter = null;

		do
		{
			System.out.println("Dame un caracter");
			caracter = sc.next();

			if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o")
					|| caracter.equals("u"))
			{
				System.out.println("VOCAL");
			}

			else if (caracter.equals("."))
			{
				System.out.println("Ha salido del programa");
			}

			else
			{
				System.out.println("NO VOCAL");
			}

		} while (!(caracter.equals(".")));

		sc.close();
	}

	/*
	 * Pide una cadena y un carácter por teclado (valida que sea un carácter) y
	 * muestra cuantas veces aparece el carácter en la cadena.
	 */
	public static void cadenaCaracteres()
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		int numCaracter = 0;
		boolean a = true;

		do
		{
			System.out.println("Introduce una frase o una palabra:");
			String cadena = sc.nextLine();
			System.out.println("Introduce el caracter que quieras comprobar:");
			String caracter = sc1.next();

			if (caracter.matches("[a-z]") || caracter.matches("[A-Z]"))
			{
				for (int i = 0; i < cadena.length(); i++)
				{
					if (String.valueOf(cadena.charAt(i)).matches(caracter))
					{
						numCaracter++;
					}
				}

				System.out.printf("Tu palabra o frase contiene %d veces la letra %s \n", numCaracter, caracter);
			}

			else
			{
				System.out.println("Debes introducir una letra");
				a = false;
			}

		} while (a);

		sc.close();
		sc1.close();

	}

	/*
	 * Introducir una cadena de caracteres e indicar si es un palíndromo. Una
	 * palabra palíndroma es aquella que se lee igual adelante que atrás.
	 */
	public static void palindromo()
	{
		Scanner sc = new Scanner(System.in);

		String cadena = "";
		String cadena_invertida = "";

		System.out.println("Introduce una cadena de texto (debe estar todo en mayuscula o todo en minuscula):");

		cadena = sc.next();

		for (int i = cadena.length() - 1; i >= 0; i--)
		{
			cadena_invertida += cadena.charAt(i);
		}

		if (cadena_invertida.equals(cadena))
		{
			System.out.println("Es palindromo");
		}

		else
		{
			System.out.println("No es palindromo");
		}

		sc.close();
	}

	/*
	 * Ya están aquí la segunda ronda de la Copa del Rey y en el Torrent - Real
	 * Betis se esperan bastantes goles, además de la ansiada vuelta de Isco Alarcón
	 * a los terrenos de juego. Un equipo de matemáticos de la Universidad de
	 * Massachusetts ha elaborado un algoritmo para adivinar el resultado y necesita
	 * la colaboración del alumnado del IES Los Alcores para desarrollarlo. El
	 * algoritmo es el siguiente: Se debe generar un número de 9 cifras de manera
	 * aleatoria. El algoritmo debe recorrer este número dígito a dígito. Cuando nos
	 * encontremos un dígito impar anotaremos un gol al Torrent y cuando el dígito
	 * sea par el gol lo anotará el Real Betis Balompié. Además, si el gol del Betis
	 * es múltiplo de 4 es gol de Isco.
	 */
	public static void prediccionPartido()
	{
		Random r1 = new Random();

		int num_aleatorio = r1.nextInt(100000000, 1000000000);

		int goles_Torrent = 0;
		int goles_Betis = 0;
		int goles_Isco = 0;

		System.out.printf("Número generado: %d \n", num_aleatorio);

		for (int i = 9; i > 0; i--)
		{
			int digito = num_aleatorio % 10;
			num_aleatorio = num_aleatorio / 10;

			if (digito % 2 == 0)
			{
				goles_Betis++;
			}

			if (digito % 4 == 0)
			{
				goles_Isco++;
			}

			if (digito % 2 > 0)
			{
				goles_Torrent++;
			}
		}

		System.out.printf("TORRENT %d - %d BETIS \n", goles_Torrent, goles_Betis);
		System.out.printf("Goles de Isco: %d \n \n", goles_Isco);

	}

	/*
	 * Escribe un programa que, dado un número entero positivo, diga cuántos dígitos
	 * pares tiene y cuánto suman los dígitos pares. Usa long en lugar de int a la
	 * hora de pedir el número para admitir números largos.
	 */

	public static void digitosParesNumero()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número positivo: ");
		long num = sc.nextLong();
		
		int pares=0;
		int totalPares=0;

		while (num> 0)
		{
			int digito = (int) (num % 10);
			num = num / 10;
			
			if(num%2==0) 
			{
				pares++;
				totalPares=digito+totalPares;
			}
		}

		System.out.printf("En tu número hay %d pares y la suma de ellos da %d", pares, totalPares);
		
		sc.close();
	}
}
