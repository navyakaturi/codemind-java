import java.util.Scanner;
class Demo{
    public static void main(String[]args){
        double s1,s2,s3;
        double area,resArea;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        s3=sc.nextDouble();
        area=(s1+s2+s3)/2.0d;
        resArea=Math.sqrt(area*(area-s1)*(area-s2)*(area-s3));
        System.out.printf("%.2f",resArea);
    }
}