package Arithmetic;

interface interfaceArithmetic
{
   public float addition(int m, int n);
   public float subtraction(int m, int n);
   public float multiplication(int m, int n);
   public float division(int m, int n);
   public float remainder(int m, int n);
}

public class Arithmetic implements interfaceArithmetic 
{
    
    public float addition(int m, int n)
{
        return m+n;
    }
    public float subtraction(int m, int n)
{
        return m-n;
    }
    public float multiplication(int m, int n)
{
        return m*n;
    }
    public float division(int m, int n)
{
        return m/n;
    }
    public float remainder(int m, int n)
{
        return m%n;
    }
    
}