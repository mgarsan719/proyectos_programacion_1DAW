package actividades.poo.ActividadesTema1.Act13;

public class Intercambio
{

	// ATRIBUTOS
	private int a;
	private int b;

	// CONSTRUCTOR
	public Intercambio(int A, int B)
	{
		this.a = A;
		this.b = B;
	}

	// GETTERS
	public int getA()
	{
		return this.a;
	}

	public int getB()
	{
		return this.b;
	}

	// SETTERS
	public void setA(int Na)
	{
		this.a = Na;
	}

	public void setB(int Nb)
	{
		this.b = Nb;
	}

	// METODOS
	public void intercambiar()
	{
		int recuerdaA =this.a;
		this.setA(this.b);
		this.setB(recuerdaA);

		System.out.printf("Ahora a es igual a %d y b es igual a %d", this.a, this.b);
	}

}
