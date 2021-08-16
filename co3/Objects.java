import java.util.Scanner;
interface prototypes
{
    public void area();
    public void perimeter();

}
 class Circle implements prototypes
{
    int r;
    float area;
    float perimeter;
    public void area()
    {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius  : ");
    r=sc.nextInt();
    area=3.14f*r*r;

    }
    public void perimeter()
    {
        perimeter=2*3.14f*r ;
        System.out.println("Perimeter of circle  : "+perimeter);
        System.out.println("Area of circle  : "+area);

    }

}
class Rectangle implements prototypes
{

    int l,b;
    float area;
    float perimeter;
    public void area()
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the length  : ");
    l=sc.nextInt();
    System.out.println("Enter the breadth  : ");
    b=sc.nextInt();
    area=l*b;
    }
    public void perimeter()
    {
        perimeter=2*l*b;
        System.out.println("Perimeter of Rectangle  : "+perimeter);
        System.out.println("Area of Rectangle  : "+area);
    }



}
class Objects
{
    public static void main(String args[]) 
{
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\n\t MENU \t\n");
        System.out.println("\t1. Circle\n\t2. Rectangle\n");
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
        switch (ch) 
{
            case 1:
            prototypes p1=new Circle();
            p1.area();
            p1.perimeter(); 
            break;
            case 2:
            prototypes p2=new Rectangle();
            p2.area();
            p2.perimeter(); 
            break;
            default:
            System.out.println("Enter valid choice : ");

            break;
        }


    }
}