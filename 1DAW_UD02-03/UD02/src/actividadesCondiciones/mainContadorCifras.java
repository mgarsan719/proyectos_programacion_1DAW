package actividadesCondiciones;

import java.util.Scanner;

public class mainContadorCifras
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numero ");
		int num1 = sc.nextInt();

		int contadorCifra = 1;

		if (num1 <= 99999 && num1 >= 0)
		{
			if (num1 < 100 && num1 > 9)
			{
				contadorCifra = 2;
				System.out.println("El " + num1 + " tiene " + contadorCifra + " cifras ");
			} else if (num1 > 100 && num1 < 1000)
			{
				contadorCifra = 3;
				System.out.println("El " + num1 + " tiene " + contadorCifra + " cifras ");
			} else if (num1 > 1000 && num1 < 10000)
			{
				contadorCifra = 4;
				System.out.println("El " + num1 + " tiene " + contadorCifra + " cifras ");
			} else if (num1 > 10000 && num1 < 100000)
			{
				contadorCifra = 5;
				System.out.println("El " + num1 + " tiene " + contadorCifra + " cifras ");
			}
		} else
		{
			System.out.println("Error");
		}

		sc.close();
	}

}
