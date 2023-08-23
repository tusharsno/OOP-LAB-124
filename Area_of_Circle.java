``/*Write a Java program ot calculate the area of a Circle.(You 
have to take input the circle radius from user)*/
package oop_lab_work;

import java.util.Scanner;

public class Area_of_Circle 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double radius,Area;
        System.out.print("Please enter the radius of Circle: ");
        radius = input.nextInt();
        
        Area = 3.1416 * radius * radius;
        
        System.out.println("The area of Circle = "+Area);
    }
}
