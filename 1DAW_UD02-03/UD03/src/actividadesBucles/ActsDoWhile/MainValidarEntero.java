package actividadesBucles.ActsDoWhile;

import java.util.Scanner;

public class MainValidarEntero
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		do
		{

			System.out.println("Introduce un numero del 1 al 10: ");
			num = sc.nextInt();

			if (num < 1 || num > 10)
			{
				System.out.println("Error: Tiene que ser entre 1 y 10 ");
			}

			else
			{
				System.out.println("Bien hecho");
			}

		} while (num < 1 || num > 10);
		
		sc.close();
	}

}
