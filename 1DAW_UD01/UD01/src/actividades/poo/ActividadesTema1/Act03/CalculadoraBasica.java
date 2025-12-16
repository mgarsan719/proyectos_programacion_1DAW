package actividades.poo.ActividadesTema1.Act03;

public class CalculadoraBasica
{

	//ATRIBUTOS
	double num1;
	double num2;
	
	//CONSTRUCTORES
	public CalculadoraBasica(double Num1, double Num2) 
	{
		this.num1=Num1;
		this.num2=Num2;
	}
	
	public CalculadoraBasica() 
	{
		this.num1=0;
		this.num2=0;
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
	
	//SETTERS
	public void setNum1(double Nnum1) 
	{
		this.num1=Nnum1;
	}
	
	public void setNum2(double Nnum2) 
	{
		this.num2=Nnum2;
	}
	
	//METODOS
	public void mostrarOperaciones() 
	{
		double suma= this.num1 + this.num2;
		double resta= this.num1 - this.num2;
		double multiplicacion= this.num1 * this.num2;
		double division= this.num1 / this.num2;
		
		System.out.printf("La suma de %.2f y %.2f es: %.2f \n",this.num1,this.num2,suma);
		System.out.printf("La resta de %.2f y %.2f es: %.2f \n",this.num1,this.num2,resta);
		System.out.printf("La multiplicación de %.2f y %.2f es: %.2f \n",this.num1,this.num2,multiplicacion);
		System.out.printf("La división de %.2f y %.2f es: %.2f \n",this.num1,this.num2,division);
	}
	
}
