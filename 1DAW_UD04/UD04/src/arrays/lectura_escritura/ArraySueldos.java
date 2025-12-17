package arrays.lectura_escritura;

import java.util.Arrays;

public class ArraySueldos
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		double[] sueldos = new double[5];

		Arrays.fill(sueldos, 1234.56);

		System.out.println(Arrays.toString(sueldos));

		// Ecritura en el array
		for (int i = 0; i < sueldos.length; i++)
		{
			sueldos[i] += sueldos[i] * 0.2;
		}

		System.out.println(Arrays.toString(sueldos));

		// Busqueda en el array
		for (double e : sueldos)
		{
			System.out.println(e);
		}
	}

}