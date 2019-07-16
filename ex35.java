
import java.util.*;

class ex35
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of the array");
	
	int size = s.nextInt();

	int[] arr = new int[size];
	for (int x=0;x<size;x++)

		arr[x] = s.nextInt();
	
	int max = arr[0];
	for(int y=1;y<size;y++)
	if(arr[y]>max)
		max = arr[y];
	
	System.out.println("Maximum value is : "+max);
	}
}
