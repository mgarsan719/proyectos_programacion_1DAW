package actividadesBucles.Recursivas;

public class Suma
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println(sumar(8));		
	}

	public static int sumar(int n) 
	{ 
		
		if(n==0) 
		{
			return 0;
		}
		
		return n+sumar(n-1);
	}
	
}
