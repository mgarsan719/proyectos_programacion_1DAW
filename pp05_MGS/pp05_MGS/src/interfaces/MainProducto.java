package interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainProducto {

	public static void main(String[] args) {

		Producto p1 = new Producto("Sardinas", "pescados", 5);
		Producto p2 = new Producto("Flan", "postres", 4);
		
		List<Producto> productos = new ArrayList<>();
		
		productos.add(p1);
		productos.add(p2);
		
		p2.espetar();

	}

}
