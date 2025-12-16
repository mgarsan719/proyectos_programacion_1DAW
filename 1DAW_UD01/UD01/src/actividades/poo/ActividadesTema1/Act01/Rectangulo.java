package actividades.poo.ActividadesTema1.Act01;

public class Rectangulo
{

	// Crea una clase denominada Rectangulo con los atributos base y altura.
	// Escribe un programa que solicite al usuario la base y la altura de un
	// rectángulo, cree un objeto de la clase y calcule, mediante métodos, su
	// perímetro y su área. Muestra ambos resultados por pantalla.

	// ATRIBUTOS
	private double base;
	private double altura;

	//CONSTRUCTORES
	public Rectangulo(double Base, double Altura) 
	{
		this.base=Base;
		this.altura=Altura;
	}
	
	public Rectangulo() 
	{
		this.base=0;
		this.altura=0;
	}
	
	//GETTERS
	public double getBase() 
	{
		return this.base;
	}
	
	public double getAltura() 
	{
		return this.altura;
	}
	
	//SETTERS
	public void setBase(double Nbase) 
	{
		this.base=Nbase;
	}
	
	public void setAltura(double Naltura) 
	{
		this.altura=Naltura;
	}
	
	//METODOS
	public Rectangulo CrearRectangulo(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
		
		return new Rectangulo(base, altura);
	}
	
	public double calculaPerimetro() 
	{
		double perimetro= (this.base + this.altura)*2;
		
		return perimetro;
	}
	
	public double calculaArea() 
	{
		double area= this.base * this.altura;
		
		return area;
	}
	
}
