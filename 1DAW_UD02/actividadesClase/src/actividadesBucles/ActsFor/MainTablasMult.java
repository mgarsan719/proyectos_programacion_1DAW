package actividadesBucles.ActsFor;

import java.util.Scanner;

public class MainTablasMult
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numMult;

		do
		{
			System.out.println("Dame un número del 1 al 10 para mostrate su tabla de multiplicar \n(introduce 0 para salir)");
			numMult = sc.nextInt();

			if (numMult > 0 && numMult <= 10)
			{
				for (int i = 1; i <= 10; i++)
				{
					int resultMult = numMult * i;

					System.out.printf("%d x %d = %d \n", numMult, i, resultMult);
				}
			}

			else if (numMult == 0)
			{
				System.out.println("Has salido del programa");
			}

			else
			{
				System.out.println("El número introducido debe estar entre 1 y 10 \n");
			}

		} while (numMult != 0);

		sc.close();

	}

}
