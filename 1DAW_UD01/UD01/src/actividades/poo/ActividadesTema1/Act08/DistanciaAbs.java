package actividades.poo.ActividadesTema1.Act08;

public class DistanciaAbs
{

	//ATRIBUTOS
	private double num1;
	private double num2;
	
	//CONSTRUCTOR
	public DistanciaAbs(double Num1, double Num2) 
	{
		this.num1=Num1;
		this.num2=Num2;
	}
	//GETTERS
	public double getNum1() 
	{
		return this.num1;
	}
	
	public double getNum2() 
	{
		return this.num2;
	}
	
	//METODOS
	public double calculaDistancia() 
	{
		double resultado= Math.abs(num1 - num2);
		
		return resultado;
	}
	
}
