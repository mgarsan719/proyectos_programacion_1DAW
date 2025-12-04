package actividadesBucles.ActsFor;

import java.util.Scanner;

public class MainContador
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime hasta que numero quieres contar");
		int numMax=sc.nextInt();
		
		for(int i=1; i<=numMax;i++) 
		{
			System.out.println(i);
		}
		
		sc.close();

	}

}
