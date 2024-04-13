public class sneha 
{
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,4,5};
        A obj = new A();
        System.out.println(obj.a);
        System.out.println(new A().a);
        new A().a=45;
        System.out.println(new A().a);
        System.out.println(obj.a);
    }
    }
}