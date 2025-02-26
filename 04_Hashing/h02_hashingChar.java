import java.util.HashMap;
import java.util.Map;

public class h02_hashingChar {
    public static void main(String[] args) {
        String s = "aabbccabc"; // Given string
        
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        // Precompute the frequency of each character using a for loop
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Get current character
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Fetching (Querying) frequencies in O(1) time
        System.out.println("Frequency of 'a': " + freqMap.getOrDefault('a', 0)); // Output: 3
        System.out.println("Frequency of 'b': " + freqMap.getOrDefault('b', 0)); // Output: 3
        System.out.println("Frequency of 'c': " + freqMap.getOrDefault('c', 0)); // Output: 3
        System.out.println("Frequency of 'd': " + freqMap.getOrDefault('d', 0)); // Output: 0 (not present)
    }
}
