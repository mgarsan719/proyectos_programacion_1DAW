package persona;

public abstract class Persona implements Comparable<Persona>{

	// ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String dni;

	// CONSTRUCTOR
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		setDni(dni);
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDni(String dni) {
		if (dni.length() != 9) {
			throw new IllegalArgumentException("DNI invalido");
		}
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.dni.equals(other.dni);
	}

	public abstract void saludar();

	@Override
	public int compareTo(Persona o) {

		int result = this.nombre.compareTo(o.nombre);
		
		if(result ==0) {
			result =this.dni.compareTo(o.dni);
		}
		
		return result;
	}

}
