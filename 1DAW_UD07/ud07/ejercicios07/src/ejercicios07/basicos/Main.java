package ejercicios07.basicos;

import java.util.List;
import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;
import ejercicios07.dataset.Pedido;
import ejercicios07.dataset.Producto;

public class Main {

	public static void main(String[] args) {

	}

	// 9. Filtrar los empleados del departamento "Ventas" y ordenarlos
	// alfabéticamente por nombre.
	public static List<Empleado> ejercicio9(){
		return Dataset.getEmpleados()
				.stream()
				.filter(e -> e.getDepartamento().equals("Ventas"))
				.sorted((e1, e2) -> e1.getNombre().compareTo(e2.getNombre()))
				.toList();
	}

	// 10. Obtener los nombres de los productos que empiezan por la letra "A".
	public static List<String> ejercicio10(){
		return Dataset.getProductos()
				.stream()
				.filter(p -> p.getNombre().startsWith("A"))
				.map(p -> p.getNombre())
				.toList();
	}
	
	// 11. Obtener una lista con todos los productos de la categoría "Electrónica".
	public static List<Producto> ejercicio11(){
		return Dataset.getProductos()
				.stream()
				.filter(p -> p.getCategoria().equals("Electrónica"))
				.toList();
	}

	// 12. Obtener una lista que contenga únicamente los nombres de todos los
	// empleados.
	public static List<String> ejercicio12(){
		return Dataset.getEmpleados()
				.stream()
				.map(e -> e.getNombre())
				.toList();
	}

	// 13. Obtener una lista con los nombres de los empleados que pertenecen al
	// departamento de "Ventas".
	public static List<String> ejercicio13(){
		return Dataset.getEmpleados()
				.stream()
				.filter(e -> e.getDepartamento().equals("Ventas"))
				.map(e -> e.getNombre())
				.toList();
	}

	// 14. Obtener una lista con los diferentes estados de los pedidos (sin
	// elementos duplicados).
	public static List<String> ejercicio14(){
		return Dataset.getPedidos()
				.stream()
				.map(p -> p.getEstado())
				.distinct()
				.toList();
	}

	// 15. Contar cuántos empleados tienen estrictamente más de 30 años.
	public static long ejercicio15(){
		return Dataset.getEmpleados()
				.stream()
				.filter(e -> e.getEdad() > 30)
				.count();
	}
	
	// 19. Comprobar si ningún producto supera los 5000 de precio.
	public static boolean ejercicio19() {
		return Dataset.getProductos()
				.stream()
				.noneMatch(p -> p.getPrecio()>5000);
	}

	// 20. Obtener una lista de todos los productos ordenados por su precio de menor a
	// mayor.
	public static List<Producto> ejercicio20(){
		return Dataset.getProductos()
				.stream()
				.sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
				.toList();
	}

	// 21. Comprobar si algún producto de la categoría "Alimentación" cuesta menos de 2
	// euros.
	public static boolean ejercicio21() {
		return Dataset.getProductos()
				.stream()
				.filter(p -> p.getCategoria().equals("Alimentación"))
				.anyMatch(p -> p.getPrecio() < 2);
	}

	// 22. Comprobar si todos los empleados del departamento "IT" tienen un salario
	// superior a 1000 euros.
	public static boolean ejercicio22() {
		return Dataset.getEmpleados()
				.stream()
				.filter(e -> e.getDepartamento().equals("IT"))
				.allMatch(e -> e.getSalario()>1000);
	}
	
	// 23. Comprobar que ningún producto de la tienda tenga un stock negativo (menor a
	// 0).
	public static boolean ejercicio23() {
		return Dataset.getProductos()
				.stream()
				.noneMatch(p -> p.getStock() < 0);
	}

	// 24. Obtener una lista con todos los pedidos, omitiendo los 5 primeros de la lista
	// original.
	public static List<Pedido> ejercicio24(){
		return Dataset.getPedidos()
				.stream()
				.skip(5)
				.toList();
	}

}
