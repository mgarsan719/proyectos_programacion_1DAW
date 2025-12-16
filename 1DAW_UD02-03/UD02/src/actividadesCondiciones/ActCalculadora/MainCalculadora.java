package actividadesCondiciones.ActCalculadora;

import java.util.Scanner;

public class MainCalculadora
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Calculadora calc = new Calculadora();

		System.out.println("Introduce el primer numero: ");
		calc.setNum1(sc.nextDouble());

		System.out.println("Introduce operador (+, -, *, /): ");
		calc.setOperador(sc.next());

		System.out.println("Introduce el segundo numero: ");
		calc.setNum2(sc.nextDouble());

		calc.calcular();
		
		sc.close();
	}

}
