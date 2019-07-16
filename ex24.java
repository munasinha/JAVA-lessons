import java.util.Scanner;
class ex24
{
	public static void main(String arg[])
	{

	Scanner s = new Scanner(System.in);
	
	int num1 = s.nextInt();
	int num2 = s.nextInt();

	for (int y=num1 ; y<=num2; y++)
        for (int x=1 ; x<=12; x++)

	System.out.println(y+ "x"+ x +"="+y*x);
		
	
	
  }

}




















