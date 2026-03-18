package herencia;

import herencia.empleado.Camarero;
import herencia.empleado.Cocinero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camarero c1 = new Camarero("Mario", 1500, 10);

		Cocinero co1 = new Cocinero("Jesus", 1800, "espetos");

		Chiringuito ch1 = new Chiringuito();

		ch1.getEmpleados().add(co1);
		ch1.getEmpleados().add(c1);

		ch1.plantilla();
		
		

	}

}
