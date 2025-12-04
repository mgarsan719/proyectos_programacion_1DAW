package actividadesCondiciones;

import java.util.Scanner;

public class mainNumerosIguales
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero ");
		int n1 = sc.nextInt();

		System.out.println("Introduce otro numero ");
		int n2 = sc.nextInt();

		if (n1 == n2)
		{
			System.out.println("Son iguales");
		}

		else
		{
			System.out.println("No son iguales");
		}

		sc.close();
	}

}
