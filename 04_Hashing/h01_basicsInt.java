
/*
    // ======================= HASHING THEORY =======================
    * Hashing is a technique used to store and retrieve data efficiently by mapping keys to values using a hash function.
    * A hash function takes an input (key) and returns an index (hash value) where the corresponding value is stored.
    * Hash tables use this technique to allow fast lookups, insertions, and deletions, making them ideal for problems requiring quick access.
    * In Java, HashMaps are implemented using an array of linked lists (chaining) to handle collisions.
    * Hashing is commonly used in problems involving counting frequencies, checking presence of elements, and implementing caches.
    */
        
    // ===================== PRE-COMPUTATION THEORY =====================
    /*
    * Pre-computation is the process of storing frequently used results in advance so that they can be retrieved quickly when needed.
    * Instead of recalculating the same information multiple times, pre-computation stores values in a hash table (HashMap) to speed up queries.
    * For example, in frequency counting, we first traverse the array and store the count of each number in a HashMap.
    * Once stored, any query about the frequency of a number can be answered in O(1) time instead of searching the entire array again.
    * Pre-computation is widely used in competitive programming to optimize solutions that require multiple queries on the same data.
    */

    // ====================== FETCHING THEORY ======================
    /*
    * Fetching is the process of retrieving precomputed values in constant time using a hash table.
    * Since data is already stored in a HashMap, fetching is as simple as looking up the key and returning its associated value.
    * In Java, HashMap provides the 'get()' method, which retrieves the value associated with a given key in O(1) average time complexity.
    * Additionally, 'getOrDefault()' can be used to return a default value (e.g., 0) if the key is not found in the map.
    * This makes hashing an efficient technique for answering queries quickly after precomputing the required information.
*/

import java.util.*;

public class h01_basicsInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1}; // Given array
        
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Precompute the frequency of each number using a for loop
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); 
            // getOrDefault() Method in Java HashMap
            // The getOrDefault() method in Java's HashMap is used to retrieve the value associated with a key. If the key does not exist, it returns a default value instead of null.
        }

        // Fetching (Querying) frequencies in O(1) time
        System.out.println("Frequency of 1: " + freqMap.getOrDefault(1, 0)); // Output: 3
        System.out.println("Frequency of 2: " + freqMap.getOrDefault(2, 0)); // Output: 2
        System.out.println("Frequency of 3: " + freqMap.getOrDefault(3, 0)); // Output: 1
        System.out.println("Frequency of 4: " + freqMap.getOrDefault(4, 0)); // Output: 0 (not present)
    }
}
