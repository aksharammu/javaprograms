class product
{
    int pcode;
    String pname;
    double price;
}
public class Lowprice
{
    public static void main(String args[]) 
{
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.pcode=1;
        p1.pname="Diya Notebook";
        p1.price=30;
        p2.pcode=2;
        p2.pname="Classmate Notebook";
        p2.price=40;
        p3.pcode=3;
        p3.pname="Paper Plan Notebook";
        p3.price=35;
        if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);

        }
        
      
    }
  }
