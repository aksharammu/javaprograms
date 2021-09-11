import java.util.*;
class Username extends Exception
{
    Username(String s)
    {
        super(s);
    }
}
class Password extends Exception
{
    Password(String s)
    {
        super(s);
    }
}
class Authenticate
{
    public static void main(String args[]) 
{
        
        String username,password;
           try
{
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the username:");
                username=sc.nextLine();
                System.out.println("enter the password:");
                password=sc.nextLine();
                if(!username.equals("Tech"))
                    throw new Username("incorrect Username");
                else if(!password.equals("Tech"))               
                     throw new  Password("incorrect password");
                else
                     System.out.println("\tlogin successfull");
                }
                 catch(Username e)
{
                        System.out.println(e);
                  }
                  catch(Password e)
{
                         System.out.println(e);
                  }
                 finally
{
                       System.out.println("\n  program ends");
}
}
}