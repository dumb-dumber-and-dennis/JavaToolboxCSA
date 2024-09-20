
/**
* Toolbox class
*
* @author Oham09, SC7RED, daredrew2
* @version 9.19.2024
* 
* testing
*/

import java.util.Scanner;

public class tb
{
    static Scanner scammy = new Scanner(System.in);
    
    public static int getInt(String message)//this method gets an int and adds a message
    {
        print(message);
        int myInt = scammy.nextInt();
        return myInt;
    }
    
    public static double getDouble(String message)//this method gets a double and adds a message
    {
        print(message);
        double myDouble = scammy.nextDouble();
        return myDouble;
    }
    
    public static char getChar(String message)//this method gets a char and adds a message
    {
        scammy.nextLine();
        print(message);
        char myChar = scammy.nextLine().charAt(0);
        return myChar;
    }
    
    public static String getString(String message)//this method gets a string and adds a message
    {
        scammy.nextLine();
        print(message);
        String myString = scammy.nextLine();
        return myString;
    }
    
    public static double round(double num, double place)//this is a rounding class
    {
        place = Math.pow(10.0, place);
        double rounded = (int)(num * place + 0.5) / place;
        return rounded;
    }
    
    public static void print(String string)//this method prints
    {
        System.out.println(string);
    }
    
    public static void print(int a)
    {
        System.out.println(a);
    }
    
    public static void print(double a)
    {
        System.out.println(a);
    }
        
    public static void print(char a)
    {
        System.out.println(a);
    }
    
    //this is a new and improved print method, will replace old one eventually
    public static void newPrint(String a, Object... args)//sooo turns out there is a way to add infinite inputs of any type
    {       
        String result = String.format(a,args);
        System.out.println(result);
        
        //made an entire working method by myself but turns out there is a built in feature, you just have to use %f in your string
        //doing %f.1 will do it to one decimal place, %s for string and so on
        
        // int[] pos = new int[6];

        // int length = 0;
        
        // for(int i = 0; i < 6; i+=2)//this is an optional use of loops and arrays to expand compactly
        // {
            // pos[i] = a.indexOf("{", length);    
            // pos[i + 1] = a.indexOf("}", length);
            
            // length = pos[i + 1] + 1;
        // }
        
        // String newString = a.substring(0,pos[0]) + b + a.substring(pos[1] + 1, pos[2]) + c + a.substring(pos[3] + 1, pos[4]) + d + a.substring(pos[5] + 1);
        
        // System.out.println(newString);
    }
}

