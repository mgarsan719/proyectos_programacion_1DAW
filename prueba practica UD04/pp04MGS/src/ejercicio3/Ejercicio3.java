package ejercicio3;

import java.util.Arrays;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] nums = { 4, 5, 4, 3, 8, 7, 4, 5, 4, 10, 11, 127, 4, 1, 6 };

		System.out.println(obtenerRango(nums));
	}

	public static int obtenerRango(int[] array)
	{
		Arrays.sort(array);

		int dif = array[array.length - 1] - array[0];

		return dif;
	}

}
