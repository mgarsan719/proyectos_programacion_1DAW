package actividades.Pestructurada;

import java.util.Scanner;

public class frutero
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Kilos de manzanas vendidos el semestre1: ");
		int kgManzanas1=sc.nextInt();
		
		System.out.print("Kilos de peras vendidos el semestre1: ");
		int kgPeras1=sc.nextInt();
		
		System.out.print("Kilos de manzanas vendidos el semestre2: ");
		int kgManzanas2=sc.nextInt();
		
		System.out.print("Kilos de peras vendidos el semestre2: ");
		int kgPeras2=sc.nextInt();
		
		double precioManzanas=2.35;
		double precioPeras=1.95;
		
		double totalManzanas=(kgManzanas1+kgManzanas2)*precioManzanas;
		double totalPeras=(kgPeras1+kgPeras2)*precioPeras;
		
		System.out.printf("El beneficio total de este año es de %.2f euros", totalManzanas+totalPeras);
		
	}

}
