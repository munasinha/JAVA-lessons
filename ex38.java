
import java.util.*;

class ex38
{
public static void main(String args[])

	int[] arr = new int [3];
	int[] arr2 = new int [3];
	System.out.println("Enter values for the first array");
	
	
	for(int x=0;r<arr.length;x++)
	arr[x] = s.nextInt();
	System.out.println("Enter values for the second array");


	for(int y=0;y<arr2.length;y++)
	arr[y] = s.nextInt();
	int[] merge = new int[arr.length + arr2.length];
	
	
	for(int z=0;z<merge.length;z++)
	if(z<arr.length)
	merge[z] = arr[z];

	else	
	
	merge[z] = arr2[z-arr.length];
	System.out.println("Enter merge array");

		
		
	for(int a=0;a<merge.length;a++)

	System.out.println(merge[c]);
	
	
	}
}
