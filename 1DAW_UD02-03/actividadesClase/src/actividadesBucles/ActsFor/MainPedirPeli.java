package actividadesBucles.ActsFor;

import java.util.Scanner;

public class MainPedirPeli
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);		
		System.out.println("Dime cuantas veces quieres pedirle una peli a Vladi:");
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++) 
		{
			System.out.println("¿Hoy vamos a ver una peli, Vladi?");
			System.out.println("No.");
		}
		
		sc.close();
	}

}
