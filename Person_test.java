package oop_lab_work;
 
public class Person_test 
{
    public static void main(String[] args) 
    {
        Person teacher = new Person();
        teacher.name = "Farhad";
        teacher.age = 28;
        
        System.out.println("Teacher name = "+teacher.name);
        System.out.println("Teacher age = "+teacher.age);
    }
}
