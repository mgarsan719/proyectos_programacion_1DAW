package poo.personas;

public class MainPersona
{

	public static void main(String[] args)
	{

		Persona p1 = new Persona("Mario", 18, 1.83);

		p1.saluda();

		p1.presentar();

		p1.setNombre("Juan");
		p1.setEdad(22);
		p1.setEstatura(1.90);

		p1.saluda();
		p1.presentar();

		System.out.println(p1);
	}

}
