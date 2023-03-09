import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvertCurrency {
    public static void main(String[] args) {
        double amount;
        double rupee, dollar, pound, euro;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Rupee");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");

        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (choice)
        {
            case 1:  // Rupee Conversion
                dollar = amount / 70;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

                pound = amount / 88;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

                euro = amount / 80;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
                break;

            case 2:  // Dollar Conversion
                rupee = amount * 70;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Rupees");

                pound = amount *0.78;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount *0.87;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
                break;


            case 3:  // Pound Conversion
                rupee = amount * 88;
                System.out.println(amount + " pound = " + f.format(rupee) + " Rupees");

                dollar = amount *1.26;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                euro = amount *1.10;
                System.out.println(amount + " pound = " + f.format(euro) + " Euro");
                break;


            case 4:  // Euro Conversion
                rupee = amount * 80;
                System.out.println(amount + " euro = " + f.format(rupee) + " Rupees");

                dollar = amount *1.14;
                System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

                pound = amount *0.90;
                System.out.println(amount + " euro = " + f.format(pound) + " Pound");
                break;

            //Default case
            default:
                System.out.println("Invalid Input");
        }
    }
}