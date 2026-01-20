package arrays.boletines;

import java.util.Arrays;

public class boletin2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(estaEnArrayInt(array, 5));
		
		System.out.println(estaEnArrayInt(array, 32));

		System.out.println(posicionEnArray(array, 5));
		
		System.out.println(posicionEnArray(array, 32));
		
		System.out.println(Arrays.toString(volteaArrayInt(array)));

		
	}
	
	// estaEnArrayInt: Dice si un número está o no dentro de un array.
	
	public static String estaEnArrayInt(int[] array, int num) 
	{
		String msg="Numero " + num + " no encontrado";
		
		for(int i = 0; i<array.length; i++) 
		{
			if(array[i]==num) 
			{
				msg="Numero " + num + " encontrado" ;
			}
		}
		
		return msg;
	}
	
	// posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra. En caso de no estar devuelve -1.

	public static int posicionEnArray(int[] array, int num) 
	{
		int pos=0;
		
		for(int i = 0; i<array.length; i++) 
		{
			if(array[i]==num) 
			{
				pos=i;
			}
			
			else 
			{
				pos=-1;
			}
		}
		
		return pos;
	}
	
	// volteaArrayInt: Le da la vuelta a un array.

	public static int[] volteaArrayInt(int[] array) 
	{
		int[] arrayVolt = new int[array.length];
		
		int pos=0;
		
		for(int i = array.length-1; i>=0; i--) 
		{
			arrayVolt[pos]=array[i];
			
			pos++;
		}
		
		return arrayVolt;
	}
	
}
