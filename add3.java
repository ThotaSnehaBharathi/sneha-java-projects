import java.util.*;
class add3
{
public static void main(String[] args)
{
Stack s=new Stack();
s.push(10);
s.push(6);
System.out.println(s.toString());
s.pop();
System.out.println(s);
Enumeration e=s.elements();
while(e.hasMoreElements());
{
System.out.println(e.nextElement());
}
}
}
