package constantvariable;

/**
 *
 * @author xerxboy
 */

/** A constant variable will keep the value even it you declare a different value.
Example: 
final int constant = 10;

constant = 15;

It will keep the "10" value and you will get a error.

*/

public class constantvariable {

public static void main(String[] args) {

   final int constant = 10;

   //constant = 15;  (Disable this line or you will get a error)

   System.out.println("The value of the constant variable is: " + constant);
 }
}
