package boletines.boletin3;

import java.util.Scanner;

public class Boletin3
{

	public static void decimal_palotes()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero positivo:");
		int num = sc.nextInt();

		String numeroTexto = String.valueOf(num);

		for (int i = 0; i < numeroTexto.length(); i++)
		{

			int digito = Character.getNumericValue(numeroTexto.charAt(i));

			for (int j = 0; j < digito; j++)
			{
				System.out.print("|");
			}

			if (i < numeroTexto.length() - 1)
			{
				System.out.print("-");
			}
		}
		
		sc.close();
	}

	public static void pintar_U()
	{
		Scanner sc = new Scanner(System.in);

		int altura;

		do
		{
			System.out.println("Introduzca la altura de la U:");
			altura = sc.nextInt();

			System.out.println();

		} while (altura <= 2);

		for (int i = 0; i < altura - 1; i++)
		{
			System.out.print("*");

			for (int j = 0; j < altura - 2; j++)
			{
				System.out.print(" ");
			}

			System.out.println("*");
		}

		System.out.print(" ");

		for (int c = 0; c < altura - 2; c++)
		{
			System.out.print("*");
		}

		System.out.println("\n");
		
		sc.close();
	}

	public static void insertar_Digito()
	{
		Scanner sc = new Scanner(System.in);

		long numero;
		long numeroCambiado;
		int posicion;
		int digito;
		long aux; 
		int cifras = 0; 

		do
		{
			System.out.print("Dime un entero positivo: ");
			numero = sc.nextLong();
		} while (numero <= 0);

		aux = numero;

		while (aux > 0)
		{
			aux = aux / 10;
			cifras++;
		}

		do
		{
			System.out.print("Dime la posicion donde quieres insertar: ");
			posicion = sc.nextInt();
		} while (posicion > cifras || posicion < 1);

		do
		{
			System.out.print("Dime el digito que quieres insertar: ");
			digito = sc.nextInt();
		} while (digito > 9 || digito < 0);

		int corte = (int) Math.pow(10, cifras - posicion + 1); 
		
		long parteIzq = numero / corte; 
		long parteDer = numero % corte;
		parteIzq = (parteIzq * 10 + digito) * corte; 
		numeroCambiado = parteIzq + parteDer;

		System.out.printf("El número resultante es %d \n", numeroCambiado);

		sc.close();
	}

}
