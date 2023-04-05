
import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrivenList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.next();
                    list.add(elementToAdd);
                    System.out.println("Element added: " + elementToAdd);
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("List is empty. No element to remove.");
                    } else {
                        System.out.print("Enter element to remove: ");
                        String elementToRemove = scanner.next();
                        if (list.remove(elementToRemove)) {
                            System.out.println("Element removed: " + elementToRemove);
                        } else {
                            System.out.println("Element not found: " + elementToRemove);
                        }
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("Elements in the list: " + list);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
