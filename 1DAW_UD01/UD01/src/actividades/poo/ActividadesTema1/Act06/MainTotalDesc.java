package actividades.poo.ActividadesTema1.Act06;

public class MainTotalDesc
{

	public static void main(String[] args)
	{

		
		TotalDesc td1 = new TotalDesc();
		
		td1.setTotal(100);
		
		System.out.println("El precio final es: " + td1.calcularDescuento(15));
	}

}
