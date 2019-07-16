//Write a program copy a number rang in a puticuler array
import java.util.*;

class ex33
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	int size = s.nextInt();
	int[]arr=new int[size];
	for(int x=0;x<size;x++)
		arr[x] = s.nextInt();
	
	System.out.println("Enter low range");
	int low = s.nextInt();
	
		
	System.out.println("Enter high range");
	int high = s.nextInt();

		if (low<high && low>0 && high<=arr.length)
	{

	int[] result=Arrays.copyOfRange(arr,low,high);
	for(int y=0;y<result.length;y++)
	System.out.println(result[y]);
	}
	else
	System.out.println("Array Range Error");
	}
}
