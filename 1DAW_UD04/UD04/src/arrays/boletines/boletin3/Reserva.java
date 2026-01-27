package arrays.boletines.boletin3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva
{

	private int numeroHabitacion;

	private String nombreCliente;

	private LocalDate fechaEntrada; // (formato "dd/MM/yyyy")

	private int noches;

	// CONSTRUCTOR
	public Reserva()
	{
		this.numeroHabitacion = 0;
		this.nombreCliente = "";
		this.fechaEntrada = null;
		this.noches = 0;
	}

	public Reserva(int NumeroHabitacion, String NombreCliente, String FechaEntrada, int Noches)
	{
		this.numeroHabitacion = NumeroHabitacion;
		this.nombreCliente = NombreCliente;
		this.fechaEntrada = LocalDate.parse(FechaEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.noches = Noches;
	}

	// GETTERS
	public int getNumeroHabitacion()
	{
		return numeroHabitacion;
	}

	public String getNombreCliente()
	{
		return nombreCliente;
	}

	public LocalDate getFechaEntrada()
	{
		return fechaEntrada;
	}

	public int getNoches()
	{
		return noches;
	}

	// SETTERS
	public void setNumeroHabitacion(int numeroHabitacion)
	{
		this.numeroHabitacion = numeroHabitacion;
	}

	public void setNombreCliente(String nombreCliente)
	{
		this.nombreCliente = nombreCliente;
	}

	public void setFechaEntrada(LocalDate fechaEntrada)
	{
		this.fechaEntrada = fechaEntrada;
	}

	public void setNoches(int noches)
	{
		this.noches = noches;
	}

	// METODOS
	public double calcularPrecio(int precioPorNoche)
	{
		int precio = noches * precioPorNoche;

		return precio;
	}

	public void mostrarInfo()
	{
		System.out.printf("Num habitacion: %d \n Nombre Cliente: %s \n Fecha Entrada: %s \n Noches: %d ",
				this.numeroHabitacion, this.nombreCliente, this.fechaEntrada, this.noches);
	}

}
