package Graphics;
interface interfaceGraphics
{
    public void rectangleArea(int l, int w);
    public void circleArea(int r);
    public void squareArea(int a);
    public void triangleArea(int b, int h);
}

public class Graphics implements interfaceGraphics 
{
    
    public void  rectangleArea(int l, int w)
{
        System.out.println("Area of Rectangle : "+l*w) ;
    }
    public void circleArea(int r)
{
        System.out.println("Area of Circle : "+3.14*r*r);
    }
    public void squareArea(int a)
{
        System.out.println("Area of Square : "+a*a);
    }
    public void triangleArea(int b, int h)
{
        System.out.println("Area of Triangle : "+(b*h)/2);
    }
    
}