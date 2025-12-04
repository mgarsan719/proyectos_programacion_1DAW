package actividades.poo.ActividadesTema1.Act04;

public class MainTemperaturas
{

	public static void main(String[] args)
	{

		Temperaturas temp1 = new Temperaturas();
		
		temp1.setFahrenheit(100);
		
		System.out.printf("La temperatura de %.2f grados Fahrenheit son %.2f grados Celsius \n",temp1.getFahrenheit(),temp1.mostrarCelsius());
		
	}

}
