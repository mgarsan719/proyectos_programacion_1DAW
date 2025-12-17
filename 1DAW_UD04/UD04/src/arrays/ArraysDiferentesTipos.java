package arrays;

import java.util.Arrays;

public class ArraysDiferentesTipos
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] enteros = new int[5];

		enteros[0] = 1;
		enteros[1] = 2;
		enteros[2] = 3;
		enteros[3] = 4;
		enteros[4] = 5;

		double[] decimales = new double[5];

		decimales[0] = 1.1;
		decimales[1] = 1.2;
		decimales[2] = 1.3;
		decimales[3] = 1.4;
		decimales[4] = 1.5;

		boolean[] booleanos = new boolean[5];

		booleanos[0] = true;
		booleanos[1] = false;
		booleanos[2] = true;
		booleanos[3] = false;
		booleanos[4] = true;

		System.out.println(Arrays.toString(enteros));
		System.out.println(Arrays.toString(decimales));
		System.out.println(Arrays.toString(booleanos));
	}

}
