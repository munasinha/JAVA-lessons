import java.util.Scanner;

class ex14
{
  public static void main(String args[])

	{

	int num=10;
	System.out.println(num++);
	System.out.println(++num);
	System.out.println(num--);
	System.out.println(--num);
	
	}
	
	
}


      Display	      Memory
	
	10		11
	12		12
	12		11
	10		10

nmu++	post increment
++num	pre increment
num--	post decrement
--num	pre decrement
