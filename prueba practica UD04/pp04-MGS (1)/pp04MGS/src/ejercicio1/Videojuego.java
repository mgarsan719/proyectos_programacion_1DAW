package ejercicio1;

public class Videojuego
{
	private String titulo;
	private String plataforma;
	private double precio;
	private int horasJugadas;

	// CONSTRUCTOR
	public Videojuego(String titulo, String plataforma, double precio, int horasJugadas)
	{
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.precio = precio;
		this.horasJugadas = horasJugadas;
	}

	// GETTERS
	public String getTitulo()
	{
		return titulo;
	}

	public String getPlataforma()
	{
		return plataforma;
	}

	public double getPrecio()
	{
		return precio;
	}

	public int getHorasJugadas()
	{
		return horasJugadas;
	}

	// SETTERS
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public void setPlataforma(String plataforma)
	{
		this.plataforma = plataforma;
	}

	public void setPrecio(double precio)
	{
		this.precio = precio;
	}

	public void setHorasJugadas(int horasJugadas)
	{
		this.horasJugadas = horasJugadas;
	}

	// METODOS
	public void mostrarJuego()
	{
		System.out.printf("Titulo: %s | Plataforma: %s | Precio: %.2f |Horas jugadas: %d \n", this.getTitulo(),
				this.getPlataforma(), this.getPrecio(), this.getHorasJugadas());
	}

}
