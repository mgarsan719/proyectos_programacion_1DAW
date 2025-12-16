package actividadesCondiciones;

import java.util.Scanner;

public class mainParImpar
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero: ");
		int num1 = sc.nextInt();

		boolean esImpar = num1 % 2 != 0;

		String fraseSalida = "Es Impar";

		if (esImpar == false)
		{
			fraseSalida = "Es par";
		}

		System.out.println(fraseSalida);

		sc.close();
	}

}
