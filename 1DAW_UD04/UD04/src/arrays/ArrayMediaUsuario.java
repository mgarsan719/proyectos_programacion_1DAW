package arrays;

import java.util.Scanner;

public class ArrayMediaUsuario
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		/*
		 * Introduce por teclado un número n; a continuación, solicita al usuario que
		 * teclee n números y los introduzca en una tabla. Después debes recorrerla y
		 * realizar la media de los números positivos, la media de los negativos y
		 * cuenta el número de ceros introducidos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero de notas:");
		int numNotas = sc.nextInt();

		int[] notas = new int[numNotas];

		// escritura en el array
		for (int i = 0; i < notas.length; i++)
		{
			System.out.printf("Dame la %dº nota \n", i + 1);
			notas[i] = sc.nextInt();
		}

		// lectura array y medias
		double sumPos = 0;
		int contPos = 0;
		double sumNeg = 0;
		int contNeg = 0;
		int numCeros = 0;

		for (int e : notas)
		{
			if (e > 0)
			{
				sumPos += e;
				contPos++;
			}

			else if (e < 0)
			{
				sumNeg += e;
				contNeg++;
			}

			else
			{
				numCeros++;
			}
		}

		System.out.printf("La media de los numeros positivos es %.2f \n", sumPos / contPos);
		System.out.printf("La media de los numeros negativos es %.2f \n", sumNeg / contNeg);
		System.out.printf("Se han introducido %d ceros \n", numCeros);

		sc.close();
	}

}
