//abstract_part_02
package OOP_Lab_03;

import java.util.Scanner;

public class Rectangle extends Shape
{
    double length,width,area,perimeter;
    
    @Override
    void extra()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        length = input.nextDouble();
        System.out.print("Please enter the width: ");
        width = input.nextDouble();
        System.out.println(" ");
        
        area = length * width;
        perimeter = 2 * (length * width);
    }
    
    @Override
    void Area()
    {
        System.out.println("The area of the Rectangle is ="+area);
    }
    
    @Override
    void Perimeter()
    {
        System.out.println("The perimeter of the Rectangle is ="+perimeter);
    }
}




