package arrays.boletines;

import java.util.Arrays;
import java.util.Random;

public class Boletin_inicial
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] array = generaArrayInt(10, 0, 10);

		System.out.println(Arrays.toString(array));

		System.out.printf("El numero minimo del array es el %d\n", minimoArrayInt(array));

		System.out.printf("El numero maximo del array es el %d\n", maximoArrayInt(array));
		
		System.out.printf("La media del array es %.2f\n", mediaArrayInt(array));


	}

	// generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
	// intervalo (mínimo y máximo) se indica como parámetro.

	public static int[] generaArrayInt(int tamano, int principioRandom, int finalRandom)
	{
		Random r1 = new Random();

		int[] arrayRamdom = new int[tamano];

		for (int i = 0; i < arrayRamdom.length; i++)
		{
			arrayRamdom[i] = r1.nextInt(principioRandom, finalRandom + 1);
		}

		return arrayRamdom;
	}

	// minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.

	public static int minimoArrayInt(int[] array)
	{
		int min = array[0];

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}

		return min;
	}

	// maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
	
	public static int maximoArrayInt(int[] array)
	{
		int max = array[0];

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}

		return max;
	}

	// mediaArrayInt: Devuelve la media del array que se pasa como parámetro.

	public static double mediaArrayInt(int[] array) 
	{
		double suma=0;
		
		for (int i = 0; i < array.length; i++)
		{
			suma+=array[i];
		}
		
		double media= suma/array.length;
		
		return media;
	}

}
