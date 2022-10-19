import java.util.Scanner;
class Std
{
    int roll;
    String name;
    Scanner sc = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll no.: ");
        roll = sc.nextInt();
    }
    void display()
    {
        System.out.println("Name is: "+name);
        System.out.println("Roll no. is: "+roll);
    }
    Std()
    {
        name = "Not assigned";
        roll = 000;
    }
    Std(String n, int r)
    {
        name = n;
        roll = r;
    }
}

class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Std s1 = new Std("Sharvesh", 51);
        Std s = new Std();
        s1.display();
        s.display();
        s.read();
        s.display();
    }
}