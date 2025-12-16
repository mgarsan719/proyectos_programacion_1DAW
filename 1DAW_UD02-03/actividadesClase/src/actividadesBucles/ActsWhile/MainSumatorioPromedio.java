package actividadesBucles.ActsWhile;

import java.util.Scanner;

public class MainSumatorioPromedio
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int suma = 0;

		double promedio = 0;

		int numIntroducido = 0;

		while (numIntroducido < 10)
		{
			int num = 0;
			System.out.println("Introduzca un número para sumarlo: ");
			num = sc.nextInt();

			suma = suma + num;

			numIntroducido++;
		}

		promedio = suma * 1.0 / numIntroducido;

		System.out.printf("El sumatorio de los numeros introducidos es igual a %d \n", suma);
		System.out.printf("El promedio de los numeros introducidos es igual a %.2f \n", promedio);

		sc.close();
	}

}
