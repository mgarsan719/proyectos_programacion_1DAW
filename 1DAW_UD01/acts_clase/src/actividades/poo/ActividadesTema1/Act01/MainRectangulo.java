package actividades.poo.ActividadesTema1.Act01;

import java.util.Scanner;

import actividades.poo.CuentaCorriente.CuentaCorriente;

public class MainRectangulo
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		Rectangulo r1 = new Rectangulo();

		boolean a = true;
		int b;

		while (a == true)
		{

			System.out.println("---------------------------------------------------------------------------------------\n" 
							 + "MENÚ PRINCIPAL \n" 
							 + "Pulse 1 para Crear Rectangulo \n"
							 + "Pulse 2 para Calcular Área \n" 
							 + "Pulse 3 para Calcular Perimetro \n" 
							 + "Pulse 4 para Salir \n"
							 + "---------------------------------------------------------------------------------------\n");

			b = sc.nextInt();

			switch (b)
			{
			case 1:
				System.out.println("Ha seleccionado Crear Rectangulo \n");
				r1.CrearRectangulo();
				System.out.printf("Rectángulo creado con %.2f cm de base y %.2f cm de altura \n",r1.getBase(),r1.getAltura());
				break;

			case 2:
				System.out.println("Ha seleccionado Calcular Area \n");
				System.out.printf("El área del rectángulo es: %.2f cm² \n",r1.calculaArea());
				break;

			case 3:
				System.out.println("Ha seleccionado Calcular Perimetro \n");
				System.out.printf("El perímetro del rectángulo es: %.2f cm \n",r1.calculaPerimetro());
				break;


			case 4:
				System.out.println("Ha seleccionado Salir");
				a = false;
				break;
			}
		}
		
	}

}
