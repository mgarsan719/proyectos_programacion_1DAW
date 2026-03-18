package herencia.empleado;

public class Cocinero extends Empleado {

	// ATRIBUTOS
	private Especialidad especialidad;

	// CONSTRUCTOR
	public Cocinero(String nombre, double salario, String especialidad) {
		super(nombre, salario);
		this.setEspecialidad(especialidad);
	}

	// GETTERS Y SETTERS
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = Especialidad.valueOf(especialidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cocinero other = (Cocinero) obj;
		return super.getNombre().equals(other.getNombre()) && super.getSalario() == other.getSalario()
				&& this.especialidad.equals(other.especialidad);
	}

	@Override
	public String toString() {
		return String.format("Cocinero [nombre= %s, salario= %.2f, especialidad= %d]", super.getNombre(),
				super.getSalario(), this.especialidad);
	}

	@Override
	public void presentarse() {

		System.out.printf("Hola, me llamo %s, cobro %.2f euros y mi especialidad son los %s. \n", super.getNombre(),
				super.getSalario(), this.especialidad.toString());
	}

}
