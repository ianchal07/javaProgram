import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElementArraylist  {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>(list);

        // Create a new ArrayList to store unique elements
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);

        // Print the original list
        System.out.println("Original List: " + list);

        // Print the unique list
        System.out.println("Unique List: " + uniqueList);
    }
}
