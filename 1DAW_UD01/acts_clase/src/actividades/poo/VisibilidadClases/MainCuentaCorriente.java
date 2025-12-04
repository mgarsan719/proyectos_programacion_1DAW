package actividades.poo.VisibilidadClases;

import java.util.Scanner;

public class MainCuentaCorriente
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		CuentaCorriente c1 = new CuentaCorriente();

		boolean a = true;
		int b;

		while (a == true)
		{

			System.out.println("---------------------------------------------------------------------------------------\n" 
							 + "MENÚ PRINCIPAL \n"
							 + "Pulse 1 para Crear cuenta \n"
							 + "Pulse 2 para Ingresar dinero \n"
							 + "Pulse 3 para Sacar Dinero \n"
							 + "Pulse 4 para Mostrar Información \n"
							 + "Pulse 5 para Salir \n"
							 + "---------------------------------------------------------------------------------------\n");

			b = sc.nextInt();

			switch (b)
			{
			case 1:
				System.out.println("Ha seleccionado Crear cuenta \n");
				c1.CrearCuenta();
				break;

			case 2:
				System.out.println("Ha seleccionado Ingresar Dinero \n");
				c1.IngresarDinero();
				break;

			case 3:
				System.out.println("Ha seleccionado Sacar Dinero \n");
				c1.SacarDinero();
				break;

			case 4:
				System.out.println("Ha seleccionado Mostrar Información \n");
				c1.MostrarInfo();
				break;

			case 5:
				System.out.println("Ha seleccionado Salir");
				a = false;
				break;
			}
		}
	}

}
