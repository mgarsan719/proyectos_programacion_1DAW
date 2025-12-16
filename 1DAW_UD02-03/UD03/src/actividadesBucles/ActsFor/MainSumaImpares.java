package actividadesBucles.ActsFor;


public class MainSumaImpares
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int suma=0;
		
		System.out.println("Numeros impares:");
		for(int i=0;i<=20;i++) 
		{
			if(i%2!=0) 
			{
				System.out.println(i);
				suma=suma+i;
			}
		}
		
		System.out.println("\nLa suma de los 10 primeros numeros impares es de " + suma);
	}

}
