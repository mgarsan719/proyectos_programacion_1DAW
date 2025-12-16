package actividades.Pestructurada;

import java.util.Scanner;

public class MayorEdad 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad=sc.nextInt();
		
		boolean esMayor = (edad>=18);
		
		System.out.printf("¿Eres mayor de edad? \n%b",esMayor);
		
		sc.close();
	}

}
