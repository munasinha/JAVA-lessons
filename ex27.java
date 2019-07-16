//Create an array allow user to enter 5 numbers and desplay the entered numbers.
import java.util.Scanner;
class ex27
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("enter a size of a array");
	int size = s.nextInt();
	int[] arr = new int [size];
	for(int x=0;x<size;x++)
	arr[x] = s.nextInt();
	for(int y=size-1;y>=0;y--)
	System.out.println(arr[y]);
	}
}

