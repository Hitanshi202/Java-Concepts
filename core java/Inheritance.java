public class Inheritance
{}
class Parent
{
    void display()
    {
        System.out.println("This is parent class");
    }
}
class Child extends Parent
{
     void display()
    {
        System.out.println("This is child class");
    }

    public static void main(String[] args)
    {
        Parent parent = new Parent();
        Child child = new Child();
        parent.display();
        child.display();

    }

}