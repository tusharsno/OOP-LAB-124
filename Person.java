/*Write a java program to create a class called "Person" with a 
name and age attribute. Create two instances of the "Person" 
class, set their attributes using the constructor, and print 
thier name and age.*/
package oop_lab_work;

public class Person 
{
     public static void main(String[] args) 
    {
         test teacher = new test();
         teacher.name = "Farhad";
         teacher.age = 28;
         
         System.out.println("Name: "+teacher.name);
         System.out.println("Age: "+teacher.age);
    }
}

class test
{
    String name;
    int age;
}
