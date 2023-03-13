package CustomException;

public class FinallyKeyword {
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3,6,7};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


        try {
            System.out.println(5/0);
        } finally {
            System.out.println("Yes i am finally");
        }
    }
}
