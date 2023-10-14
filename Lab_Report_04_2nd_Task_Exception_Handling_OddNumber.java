/*Write a Java program to create a method that takes an integer as a parameter
and throws an exception if the number is odd*/
package Lab_Report_04;
 
public class Exception_Handling_OddNumber 
{
    public void Check_Number(int number) throws ArithmeticException, ClassNotFoundException
    //public static void myMethod(int number) throws ArithmeticException, ClassNotFoundException
    { 
        if(number % 2 != 0)
        {
            throw new ArithmeticException("Error exists");
        }
        else
        {
            System.out.println("Run successful");
        }
    } 

    public static void main(String args[])
    { 
        try
        { 
            Exception_Handling_OddNumber obj = new Exception_Handling_OddNumber();
            obj.Check_Number(127);
            //Exception_Handling_OddNumber.myMethod(123); 
        }
        catch(ArithmeticException | ClassNotFoundException e)
        {
            System.out.println("Exceptions: "+e);
        } 
        finally
        {
            System.out.println("Last line of the program");
        }
    }
}
