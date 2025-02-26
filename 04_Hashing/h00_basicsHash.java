// Difference between Hash and HashMap:
// - A hash is a general term referring to a data structure that maps keys to values using a hash function.
// - A HashMap is a specific implementation of a hash table in Java, part of the Java Collection Framework.

// Difference between HashTable and HashMap:
// - HashTable is synchronized, making it thread-safe but slower due to synchronization overhead.
// - HashMap is non-synchronized, making it faster but not thread-safe.

// What is an Unordered Hash?
// - An unordered hash refers to a hash table where the order of elements is not guaranteed.
// - Both HashTable and HashMap are examples of unordered hashes unless specific implementations like LinkedHashMap are used.

// How Data is Stored in Hash or HashMap:
// - Data is stored as key-value pairs.
// - A hash function is used to map the key to an index in an array (or bucket), where the corresponding value is stored.
// - In case of collisions (multiple keys mapping to the same index), techniques like chaining or open addressing are used.

// Example of HashMap in Java:
public class h00_basicsHash {
    public static void main(String[] args) {
        // Create a HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Retrieve values by key
        System.out.println("Apples: " + map.get("Apple"));
        System.out.println("Bananas: " + map.get("Banana"));
        System.out.println("Cherries: " + map.get("Cherry"));
    }
}
