package actividades.Pestructurada;

import java.util.Scanner;

public class Edad_user 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);		
		
		System.out.print("Escriba su edad: ");
		
		int edad=sc.nextInt();
		
		System.out.printf("Su edad es %d, por lo que el año que viene usted tendra %d años", edad, edad+1);

		sc.close();
	}

}
