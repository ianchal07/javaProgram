import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // Input queue elements
        System.out.print("Enter the queue elements: ");
        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }

        System.out.print("Enter the number of elements to reverse: ");
        int k = scanner.nextInt();

        // Reverse the first k elements of the queue
        reverseFirstK(queue, k);

        // Print the modified queue
        System.out.print("Modified queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    private static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k < 0 || k > queue.size()) {
            return;
        }

        // Create a stack to store the first k elements of the queue
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Enqueue the reversed elements from the stack to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Enqueue the remaining elements to the queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }
}
