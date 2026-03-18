package interfaces;

public class Producto implements Espetable, Comparable<Producto> {

	// ATRIBUTOS
	private String nombre;
	private Categoria categoria;
	private double precio;

	// CONSTRUCTOR
	public Producto(String nombre, String categoria, double precio) {

		this.nombre = nombre;
		this.setCategoria(categoria);
		this.precio = precio;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = Categoria.valueOf(categoria);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// METODOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return this.categoria.equals(other.categoria) && this.nombre.equals(other.nombre)
				&& this.precio == other.precio;
	}

	@Override
	public String toString() {
		return String.format("Producto [nombre= %s, categoria= %s, precio= %.2f]", this.nombre,
				this.categoria.toString(), this.precio);
	}

	@Override
	public void espetar() {
		if (this.categoria != Categoria.mariscos && this.categoria != Categoria.pescados) {
			throw new IllegalStateException("Producto no espetable");
		}

		System.out.println("Espeto de " + this.nombre);
	}

	@Override
	public int compareTo(Producto o) {

		int r = this.categoria.compareTo(o.categoria);

		if (r == 0) {

			r = Double.compare(this.precio, o.precio);
		}

		return r;
	}

}
