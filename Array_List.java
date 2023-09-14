//Use of Array_List 

package Array_D;
import java.util.ArrayList;
import java.util.Arrays;
public class Array_List 
{
    public static void main(String[] args) 
    {
        //ArrayList <String> first = new ArrayList < > ();
        ArrayList <String> first2 = new ArrayList < > (Arrays.asList("Tushar","Snow","Tushar Barua"));
        ArrayList <Integer> first3 = new ArrayList < > (Arrays.asList(2234,3425,7553));
        //ArrayList <Integer> fisrt4 = new ArrayList < > (Arrays.asList(22,24,26));
        ArrayList <String> first5 = new ArrayList < > (Arrays.asList("USTC","ustc","UStc"));
        //ArrayList <Integer> fisrt4 = new ArrayList < > (Arrays.asList(22,24,26));
        ArrayList <Integer> first6 = new ArrayList < > (Arrays.asList(12,14,16));
        
        //System.out.println(first2.get(0));
        //System.out.println(first2.get(1));
        //System.out.println(first2.get(2));
        //System.out.println(" ");
        
        int i;
        
        System.out.println("List of name: \n");
        for( i = 0;i < 3;i++)
        {
            System.out.println(i + "." + "Name:" + first2.get(i) + "\n  Id:" + first3.get(i) + 
                    "\n  University Name:" + first5.get(i) + "\n  Age:" + first6.get(i));
            //System.out.print("Name:" + first4.get(i));
            //for(i = 0;i < 3;i++)
            //{
                //System.out.println(j + "." + " " + first3.get(j));
                //System.out.println(i + "." + " " + first2.get(i) + " " + first3.get(i));
            //}
            System.out.println(" ");
            
        }
        System.out.println(" ");
        //System.out.println(first2.size());
       
        first2.add("John");
        first3.add(3342);
        first5.add("usTC");
        first6.add(18);
        System.out.println("Adding name: ");
        System.out.print(i + "." + "Name:" + first2.get(3) + "\n  Id:" + first3.get(3) + 
                "\n  University Name:" + first5.get(3) + "\n  Age:" + first6.get(3));
        System.out.println("\n");
        
        //first2.remove("snow");
        //System.out.println(first2.remove(2));
        //System.out.println(" ");
        
        System.out.println("After removing element, List of name: ");
        first2.remove(2);
        first3.remove(2);
        first5.remove(2);
        first6.remove(2);
        System.out.print(first2 + "\n" + first3 + "\n" + first5 + "\n" + first6);
        
        
       //System.out.println("i + \".\" + \"Name:\" + first2 + \"   \\nId:\" + first3 + \"   \\nUniversity Name:\" + first5 + \"   \\nAge:\" + first6");
        System.out.println(" ");
    }
}








