public class express
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[]=new int[6];
	a[7]=1/0;
}
catch(ArithmeticException ae)
{
	System.out.println(ae);
	}
catch(ArrayIndexOutOfBoundsException ae)
{
	System.out.println(ae);
}
	}
}