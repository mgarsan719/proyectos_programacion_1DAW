package herencia.empleado;

public abstract class Empleado {

	// ATRIBUTOS
	private static double propinas;

	private String nombre;
	private double salario;

	// CONSTRUCTORES
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.setSalario(salario);
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {

		if (salario < 1221) {
			throw new IllegalArgumentException("El salario introducido es menor al salario minimo");
		}

		this.salario = salario;
	}

	public static double getPropinas() {
		return propinas;
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
		Empleado other = (Empleado) obj;
		return this.nombre.equals(other.nombre) && this.salario == other.salario;
	}

	@Override
	public String toString() {
		return String.format("Empleado [nombre= %s, salario= %.2f]", this.nombre, this.salario);
	}

	public void añadirBote(double bote) {
		Empleado.propinas += bote;

		System.out.println("El bote tiene actualmente " + Empleado.getPropinas());
	}

	public abstract void presentarse();

}
