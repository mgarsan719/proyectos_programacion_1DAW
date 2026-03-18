package herencia.empleado;

public class Camarero extends Empleado {

	// ATRIBUTOS
	private int numeroMesasAsignadas;

	// CONSTRUCTOR
	public Camarero(String nombre, double salario, int numeroMesasAsignadas) {
		super(nombre, salario);
		this.numeroMesasAsignadas = numeroMesasAsignadas;
	}

	// GETTERS Y SETTERS
	public int getNumeroMesasAsignadas() {
		return numeroMesasAsignadas;
	}

	public void setNumeroMesasAsignadas(int numeroMesasAsignadas) {
		this.numeroMesasAsignadas = numeroMesasAsignadas;
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
		Camarero other = (Camarero) obj;
		return super.getNombre().equals(other.getNombre()) && super.getSalario() == other.getSalario()
				&& this.numeroMesasAsignadas == other.numeroMesasAsignadas;
	}

	@Override
	public String toString() {
		return String.format("Camarero [nombre= %s, salario= %.2f, numeroMesasAsignadas= %d]", super.getNombre(),
				super.getSalario(), this.numeroMesasAsignadas);
	}

	@Override
	public void presentarse() {
		System.out.printf("Hola, me llamo %s, cobro %.2f euros y tengo asignadas %d mesas \n", super.getNombre(),
				super.getSalario(), this.numeroMesasAsignadas);
	}
}
