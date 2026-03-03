package actividadesCondiciones;

import java.util.Scanner;

public class mainContadorCifras
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numero ");
		int num = sc.nextInt();

		int contadorCifra = 1;

		if (num <= 99999 && num >= 0)
		{
			if (num < 100 && num > 9)
			{
				contadorCifra = 2;
				System.out.println("El " + num + " tiene " + contadorCifra + " cifras ");
			} else if (num > 100 && num < 1000)
			{
				contadorCifra = 3;
				System.out.println("El " + num + " tiene " + contadorCifra + " cifras ");
			} else if (num > 1000 && num < 10000)
			{
				contadorCifra = 4;
				System.out.println("El " + num + " tiene " + contadorCifra + " cifras ");
			} else if (num > 10000 && num < 100000)
			{
				contadorCifra = 5;
				System.out.println("El " + num + " tiene " + contadorCifra + " cifras ");
			}
		} else
		{
			System.out.println("Error");
		}

		sc.close();
	}

}
