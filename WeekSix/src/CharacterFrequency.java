
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
         String input = "believe in yourself";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the input string
        for (char c : input.toCharArray()) {
            // Ignore non-alphanumeric characters
            if (!Character.isLetterOrDigit(c)) {
                continue;
            }

            // Update the frequency map
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        // Print the character frequencies
        System.out.println("Character Frequencies:");
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + " = " + frequencyMap.get(c));
        }
    }
}
