package actividades.poo.ActividadesTema1.Act06;

public class TotalDesc
{

	//ATRIBUTOS
	private double total;
	
	//CONSTRUCTORES
	public TotalDesc(double total) 
	{
		this.total=total;
	}
	
	public TotalDesc() 
	{
		this.total=0;
	}
	
	//GETTERS
	public double getTotal() 
	{
		return this.total;
	}
	
	//SETTERS
	public void setTotal(double Ntotal) 
	{
		this.total=Ntotal;
	}
	
	//METODOS
	public double calcularDescuento(double descuento) 
	{
		double totalDescuento= this.total - (this.total * (descuento/100));
		
		return totalDescuento;
	}
}
