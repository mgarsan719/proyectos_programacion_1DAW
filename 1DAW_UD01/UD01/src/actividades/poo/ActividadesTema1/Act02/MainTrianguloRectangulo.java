package actividades.poo.ActividadesTema1.Act02;

public class MainTrianguloRectangulo
{

	public static void main(String[] args)
	{

		TrianguloRectangulo t1 = new TrianguloRectangulo();
		
		t1.setCatetoA(3);
		t1.setCatetoB(4);
		
		System.out.printf("La hipotenusa del triángulo rectángulo con catetos %.2f y %.2f es: %.2f \n",t1.getCatetoA(),t1.getCatetoB(),t1.calculaHipotenusa());
		
	}

}
