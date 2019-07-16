//Write apogram allow the user to enter the string saparete the characters of the string.
import java.util.Scanner;
class ex29
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	String text = s.next();
	
	char[] arr = new char[text.length()];
	for(int x=0;x<text.length();x++)
	arr[x] = text.charAt(x);
	for(int y=0;y<text.length();y++)
	System.out.println(arr[y]);
	}
}

