/*
* a04_Parsing.java
* This program covers data parsing in Java, which involves converting 
* a string representation of a number into its corresponding numeric type.
* 
* Parsing is an essential concept in Java, especially when handling input 
* data from users or external sources (like files or databases). In Java, 
* we can use methods like Integer.parseInt() and Double.parseDouble() 
* to convert string data to primitive data types like int, double, etc.
* 
* Common Parsing Examples:
* - String to Integer: Integer.parseInt(String)
* - String to Double: Double.parseDouble(String)
* - String to Boolean: Boolean.parseBoolean(String)
* 
* This example demonstrates how to parse strings to different data types 
* and print the parsed values.
*/

public class a04_Parsing {

   public static void main(String[] args) {
       
       // Example 1: Parsing String to Integer
       System.out.println("=== Parsing String to Integer ===");
       /*
        * In this example, we are parsing a string representation of an integer 
        * into an actual integer using Integer.parseInt().
        * 
        * If the string is not a valid number, it will throw a NumberFormatException.
        */
       String strNum = "123";
       int parsedInt = Integer.parseInt(strNum);
       System.out.println("Parsed Integer: " + parsedInt);

       System.out.println(); // For spacing

       // Example 2: Parsing String to Double
       System.out.println("=== Parsing String to Double ===");
       /*
        * In this example, we are parsing a string representation of a decimal 
        * number into a double using Double.parseDouble().
        * 
        * If the string is not a valid decimal, it will throw a NumberFormatException.
        */
       String strDouble = "3.14159";
       double parsedDouble = Double.parseDouble(strDouble);
       System.out.println("Parsed Double: " + parsedDouble);

       System.out.println(); // For spacing

       // Example 3: Parsing String to Boolean
       System.out.println("=== Parsing String to Boolean ===");
       /*
        * In this example, we are parsing a string representation of a boolean 
        * value ("true" or "false") into a boolean using Boolean.parseBoolean().
        * 
        * Note: Any string other than "true" (case-insensitive) is parsed as false.
        */
       String strBoolean = "true";
       boolean parsedBoolean = Boolean.parseBoolean(strBoolean);
       System.out.println("Parsed Boolean: " + parsedBoolean);

       System.out.println(); // For spacing

       // Example 4: Handling Invalid Parsing (Exception)
       System.out.println("=== Handling Invalid Parsing ===");
       /*
        * Here, we demonstrate an invalid parsing attempt where a non-numeric 
        * string is attempted to be parsed as an integer. This will throw 
        * a NumberFormatException which is caught and handled.
        */
       String invalidStr = "abc";
       try {
           int invalidInt = Integer.parseInt(invalidStr);
           System.out.println("Parsed Invalid Integer: " + invalidInt);
       } catch (NumberFormatException e) {
           System.out.println("Error: Invalid string for parsing as integer.");
       }
   }
}

