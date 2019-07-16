import java.util.Scanner;

class ex08
{
  public static void main(String args[]){

Scanner s = new Scanner (System.in);

	double num1,num2,ans=0;
	int option;
	num1 = s.nextDouble();
	num2 = s.nextDouble();
	option = s.nextInt();
	switch(option)
	{
	case 1:ans = num1 + num2;break;
	case 2:ans = num1 - num2;break;
	case 3:ans = num1 * num2;break;
	case 4:ans = num1 / num2;break;
	default: System.out.println("invalid operetor");

	}
	System.out.println(ans);
	

	
}
}
