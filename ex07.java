import java.util.Scanner;

class ex07
{
  public static void main(String args[]){

Scanner s = new Scanner (System.in);

int num1;

num1 = s.nextInt();

if(num1<40)

     System.out.println("fail");

else if (num1<55)

      System.out.println("c");


else if (num1<70)

      System.out.println("B");


else if (num1<100)

      System.out.println("A");

	
}
}