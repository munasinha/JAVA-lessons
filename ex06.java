import java.util.Scanner;

class ex06
{
  public static void main(String args[]){

Scanner s = new Scanner (System.in);

int num1;

num1 = s.nextInt();

if(num1>0)

     System.out.println("This is a positive Number");

else if (num1<0)

      System.out.println("This is a negetive Number");

else


       System.out.println("This is zero");



}
}