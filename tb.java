
/**
* Toolbox class
*
* @author Oham09, SC7RED, daredrew2
* @version 9.19.2024
*/

//"ctrl + shift + i" fixes indentation

import java.util.Scanner;

public class tb
{
    static Scanner scammy = new Scanner(System.in);
    
    public static long getLong(String message)//this method gets a long and adds message
    {
        print(message);
        long myLong = scammy.nextLong();
        return myLong;
    }
    
    public static int getInt(String message)//this method gets an int and adds a message
    {
        print(message);
        int myInt = 0;
        try
        {
            myInt = scammy.nextInt();
        }
        catch (Exception e)
        {
            print("That is not a valid int please try again: ");
            scammy.nextLine();
            myInt = getInt("");
        }
        return myInt;
    }
    
    public static int getIntPos(String message)//this method gets an int and adds a message, allows for range of numbers
    {
        print(message);
        int myInt = 0;
        try
        {
            myInt = scammy.nextInt();
        }
        catch (Exception e)
        {
            print("That is not a valid int please try again: ");
            scammy.nextLine();
            myInt = getInt("");
        }
        
        if (myInt < 0)
        {
            print("That is not a valid int please try again: ");
            scammy.nextLine();
            myInt = getInt("");
        }
        
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
    
    public static double round(double num, double place)//this is a rounding class
    {
        place = Math.pow(10.0, place);
        double rounded = (int)(num * place + 0.5) / place;
        return rounded;
    }
    
    public static void print(String a, Object... args)//sooo turns out there is a way to add infinite inputs of any type
    {       
        String result = String.format(a,args);
        System.out.print(result);
    }
    
    public static void println(String a, Object... args)//sooo turns out there is a way to add infinite inputs of any type
    {       
        String result = String.format(a,args);
        System.out.println(result);
    }
    
    public static String getString(String message)//this method gets a string and adds a message
    {
        print(message);
        String myString = scammy.nextLine();
        return myString;
    }
    
    public static int random(int sp, int ep)
    {
        double rnd = Math.random();
        double dif = Math.abs(ep - sp);
        int random = (int)(rnd * dif) + sp;
        return random;
    }   
    
    public static boolean isItPrime(int num)
    {
        boolean prime = false;
        for (int i = 2; i < Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                prime = false;
            } else
            {
                prime = true;
            }
        }
        if (num <= 0) prime = false;
        return prime;
    }
}

