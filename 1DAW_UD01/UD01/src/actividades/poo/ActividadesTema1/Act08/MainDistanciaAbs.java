package actividades.poo.ActividadesTema1.Act08;

public class MainDistanciaAbs
{

	public static void main(String[] args)
	{

		DistanciaAbs d1 = new DistanciaAbs(-5, 10);
		
		System.out.printf("La distancia absoluta entre los puntos %.2f y %.2f es: %.2f",d1.getNum1(),d1.getNum2(), d1.calculaDistancia());
	}

}
