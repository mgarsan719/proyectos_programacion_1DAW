package actividadesBucles.ActsFor;

import java.util.Scanner;

public class MainMedia
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int num=0;
		
		for (int i=0; i<10; i++) 
		{
			System.out.printf("Dame la %dº nota \n", (i+1));
			int tempNum=sc.nextInt();
			
			num=num+tempNum;
		}
		
		double media=(num*1.0)/10;
		
		System.out.printf("Tu media es %.2f \n", media);
		sc.close();

	}

}
