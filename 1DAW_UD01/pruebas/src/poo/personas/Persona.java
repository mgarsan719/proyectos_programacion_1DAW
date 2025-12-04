package poo.personas;

public class Persona
{

	// ATRIBUTOS
	String nombre;
	int edad;
	double estatura;

	// CONSTRUCTOR
	public Persona(String Nombre, int Edad, double Estatura)
	{
		this.nombre = Nombre;
		this.edad = Edad;
	}

	// GETTERS
	public String getNombre()
	{
		return this.nombre;
	}

	public int getEdad()
	{
		return this.edad;
	}

	public double getEstatura()
	{
		return this.estatura;
	}

	// SETTERS
	public void setNombre(String Nnombre)
	{
		this.nombre = Nnombre;
	}

	public void setEdad(int Nedad)
	{
		this.edad = Nedad;
	}

	public void setEstatura(double Nestatura)
	{
		this.estatura = Nestatura;
	}

	// FUNCIONES
	void saluda()
	{
		System.out.println("HOLA!!!!!");
	}

	void presentar()
	{
		System.out.printf("Hola, soy %s, tengo %d años y mido %.2f m\n", this.nombre, this.edad, this.estatura);
	}

	// ToString
	public String toString()
	{
		return "Nombre: " + this.nombre + " | Edad: " + this.edad + " | Estatura: " + this.estatura;
	}
}
