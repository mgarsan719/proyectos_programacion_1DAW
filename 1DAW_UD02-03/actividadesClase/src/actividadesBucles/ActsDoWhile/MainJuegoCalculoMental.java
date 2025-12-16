package actividadesBucles.ActsDoWhile;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainJuegoCalculoMental
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El
		 * jugador tendrá que introducir la solución de la suma de dos números
		 * aleatorios comprendidos entre 1 y 100. Mientras la solución introducida sea
		 * correcta, el juego continuará. En caso contrario, el programa terminará y
		 * mostrará el número de operaciones realizadas correctamente.
		 */

		Random r1 = new Random();
		Scanner sc = new Scanner(System.in);

		int resultSum;
		int n1;
		int n2;
		int respuesta;
		int contadorAcierto = -1;
		do
		{
			n1 = r1.nextInt(0, 101);
			n2 = r1.nextInt(0, 101);
			resultSum = n1 + n2;
			System.out.printf("%d + %d \n", n1, n2);
			respuesta = sc.nextInt();
			contadorAcierto++;
			
			if(respuesta==resultSum) 
			{
				System.out.println("Bien!");
			}
			
		} while (resultSum == respuesta);

		System.out.println("Has fallado");
		System.out.printf("Numero de aciertos: %d \n", contadorAcierto);
	}

}
