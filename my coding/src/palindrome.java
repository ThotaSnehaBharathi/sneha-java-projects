public class palindrome{
    public static void main(String[] args)
    {
        int num = ;
        int original = num;
        int reversed = 0;
        while (num!=0)
        {
            int digit = num%10;
            reversed = reversed*10+digit;
            num/=10;
        }
        if (original==reversed)
        {
          System.out.println(original+"is palindrome");
        }
        else{
        System.out.println(original+"is not a palindrome");
        }
    }
    }
