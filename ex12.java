import java.util.Scanner;

class ex12
{
  public static void main(String args[])
	{

	Scanner s = new Scanner (System.in);
	int low,high;
	low = s.nextInt();
	high = s.nextInt();
	if(low>0 || high<100)
	System.out.println("valied range");
	else
	System.out.println("invalied range");+
	}
	
	
}

