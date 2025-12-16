package actividadesCondiciones;

import java.util.Scanner;

public class mainMultiplos
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo numero: ");
		int num2 = sc.nextInt();

		boolean sonDistintos = (num1 != num2 || num1 == 0 || num2 == 0);

		boolean esMultiplo = num2 != 0 ? (num1 % num2 == 0 || num2 % num1 == 0) : false;

		System.out.printf("¿Los numeros son distintos o alguno de ellos es 0? %b \n", sonDistintos);

		System.out.printf("¿Los numeros multiplos entre sí? %b \n", esMultiplo);

		sc.close();
	}

}
