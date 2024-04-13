import java.util.Scanner;
public class fabonacci
{
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        int num1=0,num2=1;
        int num3;
        int i=0;
        Scanner s=new Scanner(System.in);
        int count =s.nextInt();
        System.out.println(" "+num1);
        System.out.println(" "+num2);
        while(i< count)
        {
            num3=num1+num2;
            System.out.println(" "+num3);
            num1=num2;
            num2=num3;
        i++;
        }
    }
}