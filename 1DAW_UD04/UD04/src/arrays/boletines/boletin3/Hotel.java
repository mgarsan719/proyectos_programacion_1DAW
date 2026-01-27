package arrays.boletines.boletin3;

import java.util.ArrayList;
import java.util.List;

public class Hotel
{

	private List<Reserva> reservas;

	// CONSTRUCTOR
	public Hotel()
	{
		this.reservas = new ArrayList<Reserva>();
	}

	// METODOS
	public void nuevaReserva(Reserva r)
	{
		reservas.add(r);
	}

	public boolean cancelarReserva(int numeroHabitacion)
	{
		boolean cancelada = false;
		
		Reserva rTemp= buscarReserva(numeroHabitacion);
		
		if(rTemp!=null) 
		{
			reservas.remove(rTemp);
			
			cancelada=true;

		}
		
		return cancelada;
	}
	
	public Reserva buscarReserva(int numeroHabitacion) 
	{
		Reserva rTemp = null;
		
		for(Reserva r1 : reservas) 
		{
			if(r1.getNumeroHabitacion() == numeroHabitacion && rTemp==null) 
			{
				rTemp=r1;
			}
		}
		
		return rTemp;
	}
	
	public List<Reserva> reservasCliente(String nombreCliente)
	{
		List<Reserva> reservasClient = new ArrayList<Reserva>();
		
		for(Reserva r1 : reservas) 
		{
			if(r1.getNombreCliente().equals(nombreCliente))
			{
				reservasClient.add(r1);
			}
		}
		
		return reservasClient;
	}
	
	public double ingresosTotales(int precioPorNoche)
	{
		double total=0.0;
		
		
		
		return total;
	}

}
