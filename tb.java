/**
* Toolbox class
*
* @author Oham09
* @version 9.18.2007
*/

import java.util.Scanner;

public class tb
{
static Scanner scammy = new Scanner(System.in);

public static void print(String string)//this method prints
{
System.out.print(string);
}

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
}