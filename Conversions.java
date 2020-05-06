package Conversions;
import javax.swing.JOptionPane;


public class Conversions {

  public static void main(String[] args) {

   /*VARIABLES*/
   Integer value_integer = 0;
   int value_int = 0;
   double value_double = 0;
   float value_float = 0;
   String value_string;
   char value_char;

    /*CONVERSIONS */
    //Integer.parseInt(JOptionPane.showInputDialog("Type a data for integer variable: ")) **IT'S THE SAME FOR INTEGER AND INT**
    //Double.parseDouble(JOptionPane.showInputDialog("Type a data for double variable: "));
    //Float.parseFloat(JOptionPane.showInputDialog("Type a data for float variable: "));
    //JOptionPane.showInputDialog("Type a data for char variable: ").charAt(0); **FOR CHAR ONLY ADD TO END OF THE LINE ".charAt(0);"
    


    value_integer = Integer.parseInt(JOptionPane.showInputDialog("Type a data for integer variable: "));
    value_int = Integer.parseInt(JOptionPane.showInputDialog("Type a data for int variable: "));
    value_double = Double.parseDouble(JOptionPane.showInputDialog("Type a data for double variable: "));
    value_float = Float.parseFloat(JOptionPane.showInputDialog("Type a data for float variable: "));
    value_string = JOptionPane.showInputDialog("Type a data for String variable: ");
    value_char = JOptionPane.showInputDialog("Type a data for char variable: ").charAt(0);

    JOptionPane.showMessageDialog(null, "The integer's variable value is: " + value_integer);
    JOptionPane.showMessageDialog(null, "The int's variable value is: " + value_int);
    JOptionPane.showMessageDialog(null, "The double's variable value is: " + value_double);
    JOptionPane.showMessageDialog(null, "The float's variable value is: " + value_float);
    JOptionPane.showMessageDialog(null, "The String's variable value is: " + value_string);
    JOptionPane.showMessageDialog(null, "The char's variable value is: " + value_char);
 }
}
