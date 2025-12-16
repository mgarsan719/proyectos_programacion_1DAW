package actividadesBucles.ActsDoWhile;

import java.util.Scanner;

public class MainParesDoWhile
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num;

		do
		{
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();

			if (num % 2 == 0)
			{
				System.out.printf("El numero %d es par \n", num);
			}

			else
			{
				System.out.printf("El numero %d es impar \n", num);
			}
		} while (num != 0);

		sc.close();
	}

}
