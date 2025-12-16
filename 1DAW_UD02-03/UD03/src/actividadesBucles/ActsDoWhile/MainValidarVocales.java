package actividadesBucles.ActsDoWhile;

import java.util.Scanner;

public class MainValidarVocales
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String letra = null;

		do
		{
			System.out.println("Introduce una vocal: ");
			letra = sc.next();

			if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
			{
				System.out.println("Bien hecho");
				break;
			}

			else
			{
				System.out.println("El o los caracteres introducidos no son una vocal");
			}
		} while (!(letra.equals("a") && letra.equals("e") && letra.equals("i") && letra.equals("o") && letra.equals("u")));
		
		sc.close();
	}

}
