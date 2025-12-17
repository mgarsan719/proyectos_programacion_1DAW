package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		/*
		 * Crear una tabla de longitud 10 que se inicializará con números aleatorios
		 * comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios
		 * que se guardan en la tabla.
		 */

		Random r1 = new Random();

		int[] numRandom = new int[10];

		int suma = 0;

		for (int i = 0; i < numRandom.length; i++)
		{

			numRandom[i] = r1.nextInt(0, 101);

			suma += numRandom[i];
		}

		System.out.println(Arrays.toString(numRandom));

		System.out.printf("La suma de todos los numero aleatorios es %d", suma);

	}

}
