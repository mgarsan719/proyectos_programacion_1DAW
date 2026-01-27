package arrays.boletines.boletin3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarritoCompra
{

	private List<Producto> productos;

	// CONSTRUCTOR
	public CarritoCompra()
	{
		this.productos = new ArrayList<Producto>();
	}

	// METODOS
	public void agregarProducto(Producto p)
	{
		Producto pEncontrado = buscarProducto(p.getNombre());

		if (pEncontrado != null)
		{
			pEncontrado.setCantidad(pEncontrado.getCantidad() + p.getCantidad());
		} 
		
		else
		{
			productos.add(p);
		}
	}

	public boolean eliminarProductoPorNombre(String nombre)
	{
		boolean eliminado = false;
		Producto pTemp = buscarProducto(nombre);

		if (pTemp != null)
		{
			productos.remove(pTemp);
			eliminado = true;
		}

		return eliminado;
	}

	public Producto buscarProducto(String nombre)
	{
		Producto pTemp = null;

		for (Producto p1 : productos)
		{
			if (p1.getNombre().equalsIgnoreCase(nombre) && pTemp == null)
			{
				pTemp = p1;
			}
		}

		return pTemp;
	}

	public double calcularTotal()
	{
		double total = 0.0;

		for (Producto p1 : productos)
		{
			total += p1.calcularImporte();
		}

		return total;
	}

	public void mostrarCarrito()
	{
		for (Producto p1 : productos)
		{
			System.out.printf("Producto: %s | Cantidad: %d | Importe: %.2f€\n", p1.getNombre(), p1.getCantidad(),
					p1.calcularImporte());
		}
	}

	public int contarProductosDistintos()
	{
		return productos.size();
	}

	// OPCIONALES
	public void ordenarPorNombre()
	{
		productos.sort(Comparator.comparing(Producto::getNombre));
	}

	public void ordenarPorImporteDescendente()
	{
		productos.sort(Comparator.comparing(Producto::calcularImporte).reversed());
	}
}