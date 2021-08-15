import java.util.Scanner;
interface Student
{
void Academic(String name,int reg,float m1,float m2,float percentage);
}
interface Sports
{
void sports_score(String item,int rank);
} 
class Result implements Student,Sports
{
    String name;
    int reg;
    float m1;
    float m2;
    float percentage;
    String item;
    int rank;
    public void Academic(String name,int reg,float m1,float m2,float percentage)
    {
        this.name=name;
        this.reg=reg;
        this.m1=m1;
        this.m2=m2;
        this.percentage=percentage;
    }
    public void sports_score(String item,int rank)
    {
        this.item=item;
        this.rank=rank;

    }
    void display()
    {
        System.out.println("\t ACADAMIC INFO \t");
        System.out.println("Name : "+name);
        System.out.println("Register Number : "+reg);
        System.out.println("Mark in subject 1 : "+m1);
        System.out.println("Mark in subject 2 : "+m2);
        System.out.println("Academic Percentage : "+percentage);
        System.out.println("\t SPORTS INFO \t");
        System.out.println("Sports Item : "+item);
        System.out.println("Rank : "+rank);
    }
    

}
class Score
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        Result R=new Result();
        System.out.println("Enter the name : ");
        String name=sc.next();
        System.out.println("Enter the Reg.number : ");
        int reg=sc.nextInt();
        System.out.println("Enter the mark of subject 1 : ");
        float m1=sc.nextFloat();
        System.out.println("Enter the mark of subject 2 : ");
        float m2=sc.nextInt();
        float percentage=((m1+m2)/200)*100f;
        System.out.println("Enter the main sports item : ");
        String item=sc.next();
        System.out.println("Rank obtain in  main sports item : ");
        int rank=sc.nextInt();

        R.Academic(name,reg,m1,m2,percentage);
        R.sports_score(item,rank);
        R.display();
        
    }
}