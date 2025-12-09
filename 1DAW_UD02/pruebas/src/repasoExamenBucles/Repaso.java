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
		int contDiv = 0;

		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
			{
				contDiv++;
			}
		}

		return contDiv == 2;
	}

	public static int siguientePrimo(int num)
	{
		boolean encontrado = false;

		while (!encontrado)
		{
			num++;
			if (esPrimo(num))
			{
				encontrado = true;
			}
		}

		return num;
	}

	public static long fibonacci(long n)
	{
		if (n == 1)
		{
			return 1;
		}

		if (n == 2)
		{
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int digitoN(int num, int pos)
	{
		// Devuelve el dígito que está en la posición n de un número entero. Se empieza
		// contando por el 0 y de izquierda a derecha

		int totalDigit = digitos(num);

		int digitosDerecha = totalDigit - 1 - pos;

		for (int i = 0; i < digitosDerecha; i++)
		{
			num = num / 10;
		}

		return num % 10;
	}

	public static boolean esCapicua(int num)
	{
		int numVolt = voltea(num);

		return numVolt == num;
	}

	public static int potencia(int base, int exponente)
	{
		int result = 1;

		for (int i = 1; i <= exponente; i++)
		{
			result = result * base;
		}

		return result;
	}

	public static int posicionDeDigito(int num, int numBuscar)
	{
		// Da la posición de la primera ocurrencia de un dígito dentro de un número
		// entero. Si no se encuentra, devuelve -1

		int posicion = -1;

		while (num > 0)
		{
			int digito = num % 10;

			if (digito == numBuscar)
			{
				posicion = posicion+1;
			}

			num = num / 10;

			posicion++;
		}

		return posicion;
		
	}

}
