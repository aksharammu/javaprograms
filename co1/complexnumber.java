class complex
{
    int image;
    int real;
    void add(int e,int f,int g,int h)
    {
        real=e+g;
        image=f+h;
        System.out.println("addition of two complex number is: "+real+"+"+image+" i");
    }
}
public class ComplexNumber 
{
    public static void main(String args[])
   {
        complex c1=new complex();
        c1.add(3,8,6,9);

      
    }
  }
