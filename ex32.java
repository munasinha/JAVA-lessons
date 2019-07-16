//Write a program copy a number rang in a puticuler array
import java.util.Scanner;
import java.util.Arrays;
class ex32
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	int size = s.nextInt();
	int[]arr=new int[size];
	for(int x=0;x<size;x++)
		arr[x] = s.nextInt();
	
	int num = s.nextInt();
	int[] result=Arrays.copyOfRange(arr,3,5);
	for(int y=0;y<result.length;y++)
	System.out.println(result[y]);
	}
}

