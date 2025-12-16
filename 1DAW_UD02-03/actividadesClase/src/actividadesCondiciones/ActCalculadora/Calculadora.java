package actividadesCondiciones.ActCalculadora;

public class Calculadora
{

	// ATRIBUTOS
	double num1;
	double num2;
	String operador;

	// CONSTRUCTOR
	public Calculadora(double num1, double num2, String operador)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
	}

	public Calculadora()
	{
		this.num1 = 0;
		this.num2 = 0;
		this.operador = null;
	}

	// GETTERS
	public double getNum1()
	{
		return num1;
	}

	public double getNum2()
	{
		return num2;
	}

	public String getOperador()
	{
		return operador;
	}

	// SETTERS
	public void setNum1(double num1)
	{
		this.num1 = num1;
	}

	public void setNum2(double num2)
	{
		this.num2 = num2;
	}

	public void setOperador(String operador)
	{
		if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/"))
		{
			this.operador = operador;
		}

		else
		{
			System.out.println("has introducido un operador no válido");
		}

		if (operador.equals("/") && this.num2 != 0)
		{
			this.operador = operador;
		}

		else
		{
			System.out.println("Operador introducido no válido");
		}
	}

	// METODOS
	public void calcular()
	{
		double resultado = 0;

		switch (operador)
		{
		case "+":

			resultado = num1 + num2;
			break;

		case "-":

			resultado = num1 - num2;
			break;

		case "*":

			resultado = num1 * num2;
			break;

		case "/":

			resultado = num1 / num2;

			break;

		default:

			System.out.println("Error, Operador no valido");
			break;
		}

		System.out.println("El resultado es: " + resultado);
	}
}
