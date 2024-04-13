import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
if(i%2==0){
System.out.println("the number is even");
}
else
{
    System.out.println("the number is odd");
}
}
}