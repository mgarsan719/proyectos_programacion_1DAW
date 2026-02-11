package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ColeccionJuegos
{

	private List<Videojuego> juegos;
	
	public ColeccionJuegos()
	{
		this.juegos = new ArrayList<Videojuego>();
	}

	public List<Videojuego> getJuegos()
	{
		return juegos;
	}

	public void setJuegos(List<Videojuego> juegos)
	{
		this.juegos = juegos;
	}

	public Videojuego buscarPorTitulo(String titulo)
	{
		Videojuego encontrado = null;

		for (Videojuego v : juegos)
		{
			if (v.getTitulo().equals(titulo))
			{
				encontrado = v;
			}
		}

		return encontrado;
	}

	public int totalHorasInvertidas()
	{
		int sumaHoras = 0;

		for (Videojuego v : juegos)
		{
			sumaHoras += v.getHorasJugadas();
		}

		return sumaHoras;
	}

	public void mostrarJuegosPorPlataforma(String plataforma)
	{
		for (Videojuego v : juegos)
		{
			if (v.getPlataforma().equals(plataforma))
			{
				v.mostrarJuego();
			}
		}
	}

	public double valorTotalColeccion()
	{
		double totalPrecio = 0;

		for (Videojuego v : juegos)
		{
			totalPrecio += v.getPrecio();
		}

		return totalPrecio;
	}

	public Videojuego obtenerJuegoMasJugado()
	{
		Videojuego masJugado = null;
		
		int horas=0;

		for (Videojuego v : juegos)
		{
			if (v.getHorasJugadas() > horas)
			{
				masJugado = v;
				
				horas=v.getHorasJugadas();
			}
		}

		return masJugado;
	}

}
