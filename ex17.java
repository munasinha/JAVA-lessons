import java.util.Scanner;
class ex17
{
  public static void main(String arg[])
  {

        Scanner s = new Scanner(System.in);
  	int low,high,tot=0;
	low=s.nextInt();
	high=s.nextInt();
	for(int x=low;x<=high;x++)
	tot = tot + x;
        System.out.println("total is : "+tot);
  }

}




















