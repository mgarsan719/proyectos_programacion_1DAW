package arrays.ordenacion;

public class OrdenacionQuickSort
{

	public static void main(String[] args)
	{
		int[] array = {54, 98, 23, 14, 8, 3};
		
		ordena(array, 0, array.length-1);

		
	}
	
	public static void ordena(int[] array, int ini, int fin) 
	{	
		
		// El pivote empieza en la mitad del array		
		int i=ini;
		int j=fin;
		
		int p=array[0];
		
		while(array[i]<p)
		{
			i++;
			
		}
		
		while(array[j]>=p) 
		{
			j--;
			
		}
		
		ordena(array, ini, p-1);
		
		ordena(array, p+1, fin);
		
		
	}

}
