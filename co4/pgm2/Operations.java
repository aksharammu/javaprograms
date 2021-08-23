import Arithmetic.*;

class Operations
{
    public static void main(String args[])
{
        Arithmetic testObj = new Arithmetic();
        System.out.println("sum = "+testObj.addition(4,6));
        System.out.println("Difference = "+testObj.subtraction(8,5));
        System.out.println("product = "+testObj.multiplication(3,2));
        System.out.println("division = "+testObj.division(12,4));
        System.out.println("remainder = "+testObj.remainder(13,3));
    }
}