package actividadesBucles.ActsDoWhile;

import java.util.Scanner;

public class MainNumerosIguales
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n1;
		int n2;

		do
		{
			System.out.println("Introduce un numero: ");
			n1 = sc.nextInt();
			System.out.println("Introduce otro numero que sea el mismo al anterior: ");
			n2 = sc.nextInt();

			if (n1 != n2)
			{
				System.out.println("No son iguales");
			}
		} while (n1 != n2);

		System.out.println("Bien hecho");
	}

}
