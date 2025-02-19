/*
1415. The k-th Lexicographical String of All Happy Strings of Length n

A happy string is a string that:

consists only of letters of the set ['a', 'b', 'c'].
s[i] != s[i + 1] for all values of i from 1 to s.length - 1 (string is 1-indexed).
For example, strings "abc", "ac", "b" and "abcbabcbcb" are all happy strings and strings "aa", "baa" and "ababbc" are not happy strings.

Given two integers n and k, consider a list of all happy strings of length n sorted in lexicographical order.

Return the kth string of this list or return an empty string if there are less than k happy strings of length n.

Example 1:

Input: n = 1, k = 3
Output: "c"
Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
Example 2:

Input: n = 1, k = 4
Output: ""
Explanation: There are only 3 happy strings of length 1.
Example 3:

Input: n = 3, k = 9
Output: "cab"
Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"

 */

 import java.util.*;

 public class p1415 {
     public static String getHappyString(int n, int k) {
              // Character array containing 'a', 'b', 'c'
              char arr[] = {'a', 'b', 'c'};
      
              // List to store happy strings
              ArrayList<String> ans = new ArrayList<>();
      
              // StringBuilder to build strings
              StringBuilder sb = new StringBuilder();
      
              // Call recursive function to generate happy strings
              buildString(n, ans, arr, sb);
                    
                            // If k is out of range, return empty string
                            if (ans.size() < k) {
                                return "";
                            }
                    
                            // Return k-th happy string (1-indexed)
                            return ans.get(k - 1);
                        }
                    
                        static void buildString(int n, ArrayList<String> ans, char arr[], StringBuilder sb) {
              // Base case: If length of sb is n, add to list and return
              if (sb.length() == n) {
                  ans.add(sb.toString());
                  return;
              }
      
              // Iterate through 'a', 'b', 'c'
              for (int i = 0; i < 3; i++) {
                  // Only add character if it's not the same as the last one
                  if (sb.length() == 0 || sb.charAt(sb.length() - 1) != arr[i]) {
                      sb.append(arr[i]);  // Add character
                      buildString(n, ans, arr, sb); // Recursive call
                      sb.deleteCharAt(sb.length() - 1); // Backtrack
                  }
              }
          }
     
          public static void main(String[] args) {
             
            System.out.println(getHappyString(3,9));
            
     }
 }
 