import java.util.Scanner;
class ex18
{
  public static void main(String arg[])
  {

        Scanner s = new Scanner(System.in);
  	int low,high,tot=0,z,o;
	low=s.nextInt();
	high=s.nextInt();


	for(int x=low;x<=high;x++)

	if(x%2==0)
	tot_even = tot_even + x;
	else
	tot_odd = tot_odd +x;

	System.out.println("total 0dd numbers are : "+tot_odd);
	System.out.println("total even numbers are : "+tot_even);
	
  }

}




















