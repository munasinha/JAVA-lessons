//Write apogram allow the user to enter the string saparete the characters of the string.
import java.util.Scanner;
class ex28
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	String text = s.next();
	
	//arr[x] = s.nextInt();
	char[] arr = new char[6];
	for(int x=0;x<6;x++)
	arr[x] = text.charAt(x);
	for(int y=0;y<6;y++)
	System.out.println(arr[y]);
	}
}

