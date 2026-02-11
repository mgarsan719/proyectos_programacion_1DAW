package ejercicio2;

import java.util.Arrays;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] nums = { 4, 5, 4, 8, 9, 10, 8, 1 };
		
		System.out.println(Arrays.toString(nums));
		
		cosasConArrays(nums);
		
		System.out.println(Arrays.toString(nums));

	}

	public static void cosasConArrays(int[] array)
	{
		int[] copia = Arrays.copyOf(array, array.length);

		for (int i = 1; i <= array.length - 2; i++)
		{
			array[i] = (copia[i - 1] + copia[i + 1]) / 2;
		}
	}
}
