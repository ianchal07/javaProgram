import java.util.Scanner;
import java.util.regex.*;

public class PinValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test Case 2:
        String num1 = "132103";
        System.out.println( num1 + " : "+ isValidPinCode(num1));

        // Test Case 2:
        String num2 = "201 305";
        System.out.println(num2 + " : " + isValidPinCode(num2));

        // Test Case 3:
        String num3 = "014205";
        System.out.println(num3 + " : " + isValidPinCode(num3));

        // Test Case 4:
        String num4 = "1473598";
        System.out.println(num4 + " : " + isValidPinCode(num4));

    }
    public static boolean isValidPinCode(String pinCode) {
        // Regex to check valid pin code
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the pin code is empty
        if (pinCode == null) {
            return false;
        }
        // Pattern class contains matcher() method to find matching between given pin code and regular expression.
        Matcher m = p.matcher(pinCode);
        // Return if the pin code matched the ReGex
        return m.matches();
    }

}