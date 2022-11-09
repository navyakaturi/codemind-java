import java.util.Scanner;
class temperature
{
  public static void main(String args[])
  {
      float Fahrenheit,Celsius;
      Scanner sc=new Scanner(System.in);
      Celsius=sc.nextFloat();
      Fahrenheit=((Celsius*9)/5)+32;
      System.out.printf("%.2f",Fahrenheit);
  }
 
}
