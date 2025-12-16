package actividades.poo.PersonasNombre;

public class Persona
{

	// ATRIBUTOS
	String nombre;
	int edad;
	static int contador = 0;
	static String ultPers = "";

	// CONSTRUCTOR CON DATOS
	public Persona(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		contador++;
		ultPers = nombre;
	}

	// METODOS
	public static void totalPers()
	{
		System.out.printf("El numero de personas creadas es %d\n", contador);
	}

	public static void mostrarUlt()
	{
		System.out.printf("El nombre de la ultima persona creada es %s\n", ultPers);
	}

}
