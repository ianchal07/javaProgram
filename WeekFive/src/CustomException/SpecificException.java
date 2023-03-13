package CustomException;

public class SpecificException {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int index =7;
        int number =5;
        try {
            System.out.println("The value at array index entered is : " + a[index]);
            System.out.println("the value of array-value/number is : " + a[index]/number);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurred!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e1);
        } catch (Exception e2){
            System.out.println("Some other exception occurred!");
            System.out.println(e2);
        }
        System.out.println("program compiled fully");
    }

    }
