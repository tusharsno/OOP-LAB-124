/*Write a Java program that checks wheather a strig is a 
  valid password. Suppose the password rule is as follows:
        1. A password must have at least ten characters.
        2. A password consists of only letters and digits.
        3. A password must contain at least two digits.
        4. A password must contain a whitespace.*/

package oop_lab_work;

import java.util.Scanner;

public class check_password 
{
    public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) 
    {
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the password: ");
        password = input.nextLine();
        
        int input_lenght = password.length();
        
        int char_count = 0;
        int digit_count = 0;
        int whitespace_count = 0;
        
        for(int i = 0;i < input_lenght;i++)
        {
            char ch = password.charAt(i);
            
            if(Character.isLetter(ch))
                char_count++;
            else if(Character.isDigit(ch))
                digit_count++;
            else if(Character.isWhitespace(ch))
                whitespace_count++;
        }
        
       
        if(char_count >= 1 && digit_count >= 2 && whitespace_count >= 1 && input_lenght >= PASSWORD_LENGTH)
           System.out.print("This password is valid");
        else
           System.out.print("This password is invalid");
        
        System.out.println("\n");
    }
}

