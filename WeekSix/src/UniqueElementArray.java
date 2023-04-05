import java.util.HashSet;

public class UniqueElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 3, 3, 3};

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Loop through the array and add each element to the HashSet
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Print the original array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print the unique set
        System.out.print("\nUnique Set: ");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
    }
}
