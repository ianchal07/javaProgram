package CustomException;

import java.util.Scanner;

public class TryCatchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers for division : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int c = a / b;
            System.out.println("answer is " + c);
        } catch (Exception e) {
            System.out.println("sorry we failed to do so for reason below: ");
            System.out.println(e);
        }
    }
}
