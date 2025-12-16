package actividades.Pestructurada;

import java.util.Scanner;

public class Media
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean i = true;
		double numintro = 0;
		int total = 0;
		int nota = 1;

		System.out.println("Introduce un cualquier numero mayor de 10 o menor que 0 para que el programa dé la media de las notas introducidas");

		while (i == true)
		{
			System.out.printf("Introduce nota %.0f: ", numintro + 1);
			nota = sc.nextInt();

			if (nota <= 10 && nota >= 0)
			{
				total = nota + total;
				numintro = numintro + 1;
			}

			else
			{
				i = false;
			}

		}

		double media = total / numintro;

		System.out.printf("Tu nota media es un %.3f", media);

		sc.close();
	}

}
