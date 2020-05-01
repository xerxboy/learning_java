package primitivetypesofdata;

/**
 *
 * @author xerxboy
 */


/**
We can use these types of data:

For numbers:
Name     Size    =======================Range=======================
long=   64 bits  -9,223,372,036,854,775,808 to 9,223,372,854,775,807
double= 64 bits   4.9e-324 to 1.8e+308
float=  32 bits   1.4e-045 a 3.4e+038
int=    32 bits  -2,147,48,648 to 2,147,483,647
short=  16 bits  -32,768 to 32,767
byte=   8 bits   -128 to 127
NOTE: If you want to use float in a variable,
you need to add "f" in the end of the line.
Example " float variable = 18.4f; ". 

For characters: 
Name   ==============Utility==============
char=  All the keyboard can be a character (numbers too)
Example= char = 'a'

For logic:
Name     ==============Utility==============
boolean= Can be used for decisions
Example
"boolean decision = true; "


*/

public class primitivetypesofdata {

  public static void main(String[] args) {
   
   float variable1 = 18.4f;
     System.out.println("This is a float variable: " + variable1);
   
   char character = 'a';
     System.out.println("This is a character data type: " + character);

   boolean decision = true;
     System.out.println ("This is a boolean data type: " + decision);

  
 }
}
