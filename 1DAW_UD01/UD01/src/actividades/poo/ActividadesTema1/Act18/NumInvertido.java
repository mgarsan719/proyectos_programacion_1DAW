package actividades.poo.ActividadesTema1.Act18;

public class NumInvertido
{

	// ATRIBUTOS
	private int numero;

	// CONSTRUCTOR
	public NumInvertido(int Numero)
	{
		this.numero = Numero;
	}

	// GETTERS
	public int getNumero()
	{
		return this.numero;
	}

	// SETTERS
	public void setNumero(int Nnumero)
	{
		this.numero = Nnumero;
	}

	// METODOS
	public int invertirNumero()
	{
		int decenas = this.numero / 10;
		int unidades = this.numero % 10;
		int numInvertido = unidades * 10 + decenas;

		return numInvertido;
	}
}
