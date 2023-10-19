/*Write a Java program that throws an exception and catch it using a try-catch
block.*/
package Exceptions;
 
public class NullPointerException 
{
    public static void main(String[] args) 
    {
        try
        {
            NullPointerException.myMethod("I wanna be expert in coding");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exceptions: "+e);
        }
        finally
        {
            System.out.println("Last line of the program");
        }
    }
    
     
    public static void myMethod(String name) throws IllegalArgumentException 
    { 
        if(!" ".equals(name))
        {
            throw new IllegalArgumentException("Error exists");
        }
        else
        {
            System.out.println("Run successful");
        }
    } 
}
