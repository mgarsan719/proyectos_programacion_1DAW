package boletin3;

public class MainCarrito
{

	public static void main(String[] args)
	{

		CarritoCompra miCarrito = new CarritoCompra();

		// Añadir productos
		miCarrito.agregarProducto(new Producto("Leche", 1.20, 2));
		miCarrito.agregarProducto(new Producto("Pan", 0.85, 1));
		miCarrito.agregarProducto(new Producto("Leche", 1.20, 3)); // Repetido: aumenta cantidad a 5
		miCarrito.agregarProducto(new Producto("Manzanas", 2.50, 4));

		System.out.println("--- CARRITO INICIAL ---");
		miCarrito.mostrarCarrito();

		// Buscar un producto
		System.out.println("\nBuscando Pan...");
		Producto buscado = miCarrito.buscarProducto("Pan");
		if (buscado != null)
		{
			System.out.println("Encontrado: " + buscado.getNombre() + " (" + buscado.getCantidad() + " unidades)");
		}

		// Eliminar un producto
		System.out.println("\nEliminando Manzanas...");
		miCarrito.eliminarProductoPorNombre("Manzanas");

		System.out.println("\n--- CARRITO ACTUALIZADO ---");
		miCarrito.mostrarCarrito();

		// Total
		System.out.printf("\nTotal del carrito: %.2f€\n", miCarrito.calcularTotal());
		System.out.println("Productos distintos: " + miCarrito.contarProductosDistintos());
	}
}
