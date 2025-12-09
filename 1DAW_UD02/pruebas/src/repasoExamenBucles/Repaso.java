package repasoExamenBucles;

public class Repaso
{
	public static int digitos(int numero)
	{
		// Cuenta el número de dígitos de un número entero.

		int cont = 0;

		while (numero > 0)
		{
			numero = numero / 10;

			cont++;
		}

		return cont;
	}

	public static int voltea(int num)
	{
		int numVolt = 0;

		while (num > 0)
		{
			int digit = num % 10;

			numVolt = numVolt * 10 + digit;

			num /= 10;

		}

		return numVolt;
	}
	
	public static boolean esPrimo(int num)
	{
		int contDiv=0;
		
		for(int i=1; i<=num; i++) 
		{
			if(num%i==0) 
			{
				contDiv++;
			}
		}
		
		return contDiv==2;
	}
	
	public static int siguientePrimo(int num) 
	{
		boolean encontrado=false;
		
		while(!encontrado) 
		{
			num++;
			if(esPrimo(num)) 
			{
				encontrado=true;
			}
		}
		
		return num;
	}
	
	public static long fibonacci(long n) 
	{
		if (n==1) 
		{
			return 1;
		}
		
		if(n==2) 
		{
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
