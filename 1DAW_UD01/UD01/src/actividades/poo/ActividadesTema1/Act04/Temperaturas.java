package actividades.poo.ActividadesTema1.Act04;

public class Temperaturas
{

	//ATRIBUTOS
	private double fahrenheit;
	
	//CONSTRUCTORES
	public Temperaturas(double Fahrenheit) 
	{
		this.fahrenheit=Fahrenheit;
	}
	
	public Temperaturas() 
	{
		this.fahrenheit=0;
	}
	
	//GETTERS
	public double getFahrenheit() 
	{
		return this.fahrenheit;
	}
	
	//SETTERS
	public void setFahrenheit(double Nfahrenheit) 
	{
		this.fahrenheit=Nfahrenheit;
	}
	
	//METODOS
	public double mostrarCelsius() 
	{
		double celsius= (this.fahrenheit - 32) * 5/9;
		
		return celsius;
	}
	
}
