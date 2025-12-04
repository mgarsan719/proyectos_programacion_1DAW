package actividades.poo.VisibilidadClases;

import java.util.Scanner;

public class CuentaCorriente
{

	// ATRIBUTOS
	Scanner sc = new Scanner(System.in);
	String DNI;
	public String nombre;
	private double saldo;

	// CONSTRUCTOR VACIO
	public CuentaCorriente()
	{
		this.DNI = null;
		this.nombre = null;
		this.saldo = 0;
	}

	// CONSTRUCTOR CON DATOS
	public CuentaCorriente(String DNI, String Nombre, double Saldo)
	{
		this.DNI = DNI;
		this.nombre = Nombre;
		this.saldo = Saldo;
	}

	// METODOS
	public void CrearCuenta()
	{
		System.out.print("Dime tu DNI: ");
		this.DNI = sc.next();

		System.out.print("Dime tu nombre: ");
		this.nombre = sc.next();

		this.saldo = 0;
	}

	public void MostrarInfo()
	{
		System.out.printf("Su información actual es la siguiente: \n"
						+ "DNI: %s \n"
						+ "Nombre: %s  \n"
						+ "Saldo: %.2f€ \n", this.DNI, this.nombre, this.saldo);
	}

	public void IngresarDinero()
	{
		System.out.print("Dime cuanto dinero quieres ingresar: ");
		double ingresarDinero = sc.nextDouble();

		if (ingresarDinero > 0)
		{
			this.saldo += ingresarDinero;
			System.out.printf("Ha ingresado %.2f€, saldo actual: %.2f€ \n", ingresarDinero, this.saldo);
		}

		else
		{
			System.out.println("Cantidad introducida no válida");
		}
	}

	public void SacarDinero()
	{
		System.out.print("Dime cuanto dinero quieres sacar: ");
		double sacarDinero = sc.nextDouble();

		if (this.saldo >= sacarDinero && sacarDinero > 0)
		{
			this.saldo -= sacarDinero;
			System.out.printf("Ha sacado %.2f€, saldo restante: %.2f€ \n", sacarDinero, this.saldo);
		}

		else if (this.saldo < sacarDinero)
		{
			System.out.println("La cantidad introducida es mayor a su saldo");
		}

		else
		{
			System.out.println("Cantidad introducida no válida");
		}
	}

}