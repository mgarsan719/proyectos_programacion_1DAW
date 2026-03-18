package interfaces;

import java.util.Comparator;

import herencia.empleado.Empleado;

public class ComparaEmpleados implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		
		int r = Double.compare(o2.getSalario(), o1.getSalario());

		if (r == 0) {

			r = o1.getNombre().compareTo(o2.getNombre());
		}
		return 0;
	}

}
