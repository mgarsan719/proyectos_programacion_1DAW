package actividades.poo.ActividadesTema1.Act02;

public class TrianguloRectangulo
{

	//ATRIBUTOS
	private double catetoA;
	private double catetoB;
	
	//CONSTRUCTORES
	public TrianguloRectangulo(double CatetoA, double CatetoB) 
	{
		this.catetoA=CatetoA;
		this.catetoB=CatetoB;
	}
	
	public TrianguloRectangulo() 
	{
		this.catetoA=0;
		this.catetoB=0;
	}
	
	//GETTERS
	public double getCatetoA() 
	{
		return this.catetoA;
	}
	public double getCatetoB() 
	{
		return this.catetoB;
	}
	
	//SETTERS
	public void setCatetoA(double NcatetoA) 
	{
		this.catetoA=NcatetoA;
	}
	
	public void setCatetoB(double NcatetoB) 
	{
		this.catetoB=NcatetoB;
	}
	
	//METODOS
	public double calculaHipotenusa() 
	{
		double hipotenusa= Math.sqrt((this.catetoA*this.catetoA)+(this.catetoB*this.catetoB));
		
		return hipotenusa;
	}
	
}
