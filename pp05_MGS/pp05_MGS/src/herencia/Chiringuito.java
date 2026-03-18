package herencia;

import java.util.ArrayList;
import java.util.List;

import herencia.empleado.Empleado;

public class Chiringuito {

	// ARTRIBUTOS
	private List<Empleado> empleados;

	// CONSTRUCTOR
	public Chiringuito() {

		this.empleados = new ArrayList<>();
	}

	// GETTERS Y SETTERS
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	// METODOS
	public void plantilla() {
		for (Empleado e : empleados) {
			e.presentarse();
		}
	}

}
