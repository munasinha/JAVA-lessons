
import java.util.*;

class ex37
{
public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	int[][] arr = new int [3][2];
	for(int r=0;r<arr.length;r++)

		for(int c=0;c<arr.length;c++)
		
		arr [r][c] = s.nextInt();
		
	for(int r=0;r<arr.length;r++)
		
		for(int c=0;c<arr.length;c++)

	System.out.println(arr[r][c]);
	
	
	}
}
