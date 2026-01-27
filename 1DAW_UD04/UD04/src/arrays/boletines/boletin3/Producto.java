package arrays.boletines.boletin3;

public class Producto
{

	private String nombre;
	private double precioUnitario;
	private int cantidad;

	// CONSTRUCTOR
	public Producto(String nombre, double precioUnitario, int cantidad)
	{
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	// GETTERS
	public String getNombre()
	{
		return nombre;
	}

	public double getPrecioUnitario()
	{
		return precioUnitario;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	// SETTERS
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setPrecioUnitario(double precioUnitario)
	{
		this.precioUnitario = precioUnitario;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}

	// METODOS
	public double calcularImporte()
	{
		return precioUnitario * cantidad;
	}
}