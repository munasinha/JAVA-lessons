
import java.util.Scanner;
import java.util.Arrays;
class ex31
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	int size = s.nextInt();
	int[]arr=new int[size];
	for(int x=0;x<size;x++)
		arr[x] = s.nextInt();
	System.out.println("How many element do you want to copy?");
	int num = s.nextInt();
	int[] copy=Arrays.copyOf(arr,3);
	for(int y=0;y<num;y++)
	System.out.println(copy[y]);
	}
}

