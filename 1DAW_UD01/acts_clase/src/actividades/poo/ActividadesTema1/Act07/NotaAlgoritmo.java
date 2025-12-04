package actividades.poo.ActividadesTema1.Act07;

public class NotaAlgoritmo
{

	// ATRIBUTOS
	private double parcial1;
	private double parcial2;
	private double parcial3;
	private double examenFinal;
	private double trabajoFinal;

	// CONSTRUCTOR
	public NotaAlgoritmo(double Parcial1, double Parcial2, double Parcial3, double examenFinal, double trabajoFinal)
	{
		this.parcial1 = Parcial1;
		this.parcial2 = Parcial2;
		this.parcial3 = Parcial3;
		this.examenFinal = examenFinal;
		this.trabajoFinal = trabajoFinal;
	}
	
	//getters y setters no necesarios

	// METODOS
	public double calcularNotaFinal()
	{
		double notaFinal = ((this.parcial1 + this.parcial2 + this.parcial3) / 3) * 0.55 + this.examenFinal * 0.30 + this.trabajoFinal * 0.15;
		
		return notaFinal;
	}

}
