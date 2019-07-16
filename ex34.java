
import java.util.*;

class ex34
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of the array");
	
	int size = s.nextInt();

	int[] arr = new int[size];
	for (int x=0;x<size;x++)

		arr[x] = s.nextInt();
	
	int min = arr[0];
	for(int y=1;y<size;y++)
	if(arr[y]<min)
		min = arr[y];
	
	System.out.println("Minimum value is : "+min);
	}
}
