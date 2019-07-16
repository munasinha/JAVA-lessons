import java.util.Scanner;
class ex19
{
  public static void main(String arg[])
  {

        Scanner s = new Scanner(System.in);
  	int low,high,tot_pos=0,tot_neg=0;
	low=s.nextInt();
	high=s.nextInt();


	for(int x=low;x<=high;x++)

	if(x>0)

        tot_pos = tot_pos + x;

	else 
	
	tot_neg = tot_neg + x;
      

	System.out.println("total positive numbers are : "+tot_pos);
	System.out.println("total negetive numbers are : "+tot_neg);
	
  }

}




















