package CustomException;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {

            int a[] = { 1, 2, 3, 4, 5 };

            System.out.println(a[5]);

            //  inside another try block
            try {

                // performing division by zero
                int x = a[2] / 0;
            }
            catch (ArithmeticException e2) {
                System.out.println("division by zero is not possible");
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }

    }
