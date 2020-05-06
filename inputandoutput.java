package inputandoutput;

import java.util.Scanner;

  
public class inputandoutput {

  
  
  public static void main(String[] args) {

  /* SCANNER TO INPUT USER DATA */
  Scanner input_int = new Scanner(System.in);
  Scanner input_string = new Scanner(System.in);
  Scanner input_char = new Scanner(System.in);
  Scanner input_double = new Scanner(System.in);

  /* FOR INTEGER */  /*NOTE: IS GOOD DECLARE "0" TO NEW VARIABLES, WITH THAT WE CAN
                     KEEP OUR VALUES WITHOUT ERRORS*/
  int value_int=0;
  System.out.println("Type a integer: ");
  value_int = input_int.nextInt();
  System.out.println("The value of the interger variable is: "+value_int); 
  


  /* FOR DOUBLE */   /*NOTE: IS GOOD DECLARE "0" TO NEW VARIABLES, WITH THAT WE CAN
                     KEEP OUR VALUES WITHOUT ERRORS*/

  double value_double=0;
  System.out.println("Type a double: ");
  value_double = input_double.nextDouble();
  System.out.println("The value of the double variable is: "+value_double);


  /* FOR STRING */
  String value_string;
  System.out.println("Type a String: ");
  value_string = input_string.nextLine();
  System.out.println("The content of the String variable is: "+value_string); 


  /* FOR CHARACTER */
  char value_char;
  System.out.println("Type a character: ");
  value_char = input_char.next().charAt(0);
  System.out.println("The character is: "+value_char);
  

 }
}
