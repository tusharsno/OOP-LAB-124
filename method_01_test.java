package OPP_method;

public class method_01_test 
{
    public static void main(String[] args) 
    {
        method_01 teacher_01 = new method_01();
        teacher_01.name = "Farhad";
        teacher_01.age = 28;
        teacher_01.first();
        
        System.out.println("\n");
        
        method_01 teacher_02 = new method_01();
        teacher_02.name = "MTK";
        teacher_02.age = 36;
        teacher_02.first();
    } 
}
