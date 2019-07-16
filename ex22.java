import java.util.Scanner;
class ex22
{
	public static void main(String arg[])
	{

	Scanner s = new Scanner(System.in);
	
	int size = s.nextInt();

	for (int x=0 ; x<size; x++)

	{
	for(int y = 0; y<=x; y++)

	System.out.print("* ");
		
	System.out.println();
	}
  }

}




















