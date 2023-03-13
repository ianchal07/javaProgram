package CustomException;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAge extends Exception{
    @Override
    public String toString() {
        return "something bad happened inside of me, age should less than 100";
    }

    @Override
    public String getMessage() {
        return "incorrect age";
    }
}
public class CustomExceptionClass {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        x = sc.nextInt();
        if (x < 9) {
            try {
                throw new ArithmeticException("this is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("completed");
            }
            System.out.println("final complete");
        }
    }
}
