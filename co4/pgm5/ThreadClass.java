import java.lang.*;
import java.util.*;
class multiplication extends Thread
{
public void run()
{
    for(int i=1;i<=10;i++)
    {
        System.out.println(i+" * 5 = "+(i*5));
        
    }
    try
{  
        Thread.sleep(500);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    
}
class primenumbers extends Thread
{
int num;

public void run()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("count of first N prime numbers : ");
    int n=sc.nextInt();
    System.out.println("\t Prime Numbers are \t");
    for(int i=2;i<100;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if (i%j==0)
            {
                count=count+1;
            }

        }
        if(count==2)
        {
            System.out.print(i+ "  ");
            num=num+1;

        }
        if (num==n)
        {
        break;
        }
    }
    try
{  
        Thread.sleep(500);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
public class ThreadClass
{
    public static void main(String args[])
{
    multiplication m=new multiplication();
    primenumbers p=new primenumbers();
    m.start();
    p.start();
    }
}