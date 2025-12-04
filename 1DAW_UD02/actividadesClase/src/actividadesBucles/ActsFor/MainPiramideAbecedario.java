package actividadesBucles.ActsFor;

public class MainPiramideAbecedario
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		v2();
	}

	public static void v1()
	{
		for (char i = 'Z'; i >= 'A'; i--)
		{
			for (char j = i; j >= 'A'; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void v2()
	{
		String abcd = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

		for (int i = 0; i<= abcd.length(); i++)
		{
			System.out.println(abcd.substring(i, abcd.length()));
		}
	}
}
