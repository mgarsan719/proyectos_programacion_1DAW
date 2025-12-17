package arrays.lectura_escritura;

import java.util.Scanner;

public class ArrayMayorNum
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud de la tabla:");
		int tam = sc.nextInt();

		int[] numeros = new int[tam];

		// escritura en el array
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.printf("Dame el %dº numero \n", i + 1);
			numeros[i] = sc.nextInt();
		}
		
		System.out.printf("El numero mayor en la tabla es el %d \n", numMax(numeros));
	
		sc.close();
	}

	public static int numMax(int[] array)
	{
		int numMax = array[0];

		for (int e : array)
		{
			if (e > numMax)
			{
				numMax = e;
			}
		}

		return numMax;
	}

}
