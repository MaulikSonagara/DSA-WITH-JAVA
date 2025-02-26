
// Why Use Hashing Methods?
// Hashing methods are used for efficient data retrieval and storage by mapping keys to indices in a hash table.
// This allows for fast lookup, insertion, and deletion operations, making it particularly useful in applications like databases and search engines[1][6].

// Benefits of Hashing:
// - **Fast Data Retrieval**: Hashing enables quick access to data by mapping keys to specific indices, reducing search time significantly[1][8].
// - **Data Integrity**: Hashing helps ensure data integrity by generating a unique hash value for data; any changes result in a different hash value[1][4].
// - **Password Storage**: Hashing is used to securely store passwords, making it difficult for unauthorized access even if the hash values are compromised[2][3].
// - **Efficient Caching**: Hash tables are used in caching systems to quickly retrieve data from cache memory, improving system performance[1].

// Why Specific Hashing Methods?
// - **Division Method**: Simple and fast, but requires careful choice of hash table size to avoid collisions[7].
// - **Folding Method**: Useful for keys that can be divided into parts, reducing collisions by summing parts[7].
// - **Mid Square Method**: Extracts middle digits from the square of the key, providing a balanced distribution of hash values[7].

public class h03_hashMethods {
    public static void main(String[] args) {
        // Example key
        int key = 12345;
        
        // Size of the hash table
        int M = 95;

        // Division Method
        // This method involves dividing the key by the size of the hash table and using the remainder as the index.
        int divisionIndex = key % M;
        System.out.println("Division Method Index: " + divisionIndex);

        // Folding Method
        // This method involves dividing the key into parts and summing them to obtain the hash value.
        // Example: Divide key into parts (e.g., 12, 34, 5) and sum them.
        int k1 = 12;
        int k2 = 34;
        int k3 = 5;
        int foldingSum = k1 + k2 + k3;
        int foldingIndex = foldingSum % M;
        System.out.println("Folding Method Index: " + foldingIndex);

        // Mid Square Method
        // This method involves squaring the key and extracting the middle digits to obtain the hash value.
        // Example: Square the key, extract middle digits (e.g., 129 from 15129), and use them as the index.
        int square = key * key; // square = 15129
        // Extract middle digits, e.g., 129
        String squareStr = String.valueOf(square);
        int midSquareIndex = Integer.parseInt(squareStr.substring(1, 4)); // Extracting "129"
        midSquareIndex = midSquareIndex % M; // Normalize to hash table size
        System.out.println("Mid Square Method Index: " + midSquareIndex);
    }
}
