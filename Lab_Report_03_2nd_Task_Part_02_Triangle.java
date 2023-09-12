//interface_part_02;
package OOP_Lab_03;
 
public class Triangle implements Shape
{
    @Override
    public void getArea()
    { 
        double heigth,base;
        heigth = 12.4;
        base = 6.2;
        
        double Area = 0.5 * heigth * base;
        
        System.out.println("Area of Triangle: "+Area);
    }
}



