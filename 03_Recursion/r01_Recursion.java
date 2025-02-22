/*

Recursion :
When a function calls ITSELF untill a soecified condition is met

Key Concepts:
Base Case: Stops recursion (prevents infinite calls).
Recursive Case: Calls itself with a smaller input.
Stack Memory: Recursion stores function calls in a stack.

 */

 public class r01_Recursion {

    public static void main(String[] args) {
        int N = 5; // Define the value of N
        System.out.print("Numbers from 1 to " + N + ": ");
        printNumbers(N); // Call the recursive function to print numbers from 1 to N
        System.out.println(); // Add a newline for better formatting
        System.out.println(); // Add a newline for better formatting

        System.out.println("Print " + N + " Times : ");
        printNtimes(1,N); // Call the recursive function to print N times
        System.out.println();
        
        System.out.println("Print " + N + " to 1 : ");
        printNto1(N); // Call the recursive function to print N to 1
        System.out.println();

        System.out.println("Print " + N + " to 1 (Backtrack) : ");
        printnto1BackTrack(1,N); // Call the recursive function to print N to 1
        System.out.println();
        
        System.out.println("Print sum of first " + N + " numbers : ");
        sumOfN(0, N); // call the recursive function to print sum of first N numbers
        System.out.println();

        System.out.print("Print sum of first " + N + " numbers without extra parameter : ");
        System.out.println(sumOfNwithoutExtraParam(N)); // call the recursive function to print sum of first N numbers
        
        System.out.println("Print factorial of " + N + " : ");
        factOfN(1, N); // call the recursive function to print Factorial of N
        System.out.println();

    }

    // Recursion Function to print 1 to N numbers    
    public static void printNumbers(int n) {
        // Base case: when n is 0, stop the recursion
        if (n == 0) {
            return; // This stops the function from calling itself again
        }

        // Recursive case: print the current number and then call the function with a smaller number
        printNumbers(n - 1); // Call the function again with n-1
        System.out.print(n + " "); // Print the current value of n
    }

    // Recursion Function to print something N times
    public static void printNtimes(int i, int n){
        if (i > n) {
            return;
        }
        System.out.println("Maulik");
        i++;
        printNtimes(i, n);
    }

    // Recursion Function to print N to 1
    public static void printNto1(int n) {
        
        if(n==0) return;
        System.out.print(n + " ");
        printNto1(n-1);

        //using recursion
    }

    public static void printnto1BackTrack(int i, int n){
        if (i>n)return;
        printnto1BackTrack(i+1, n);
        System.out.print(i + " ");
    }

    public static void sumOfN(int sum,int n){
        if (n == 0) {
            System.out.println("Sum : " + sum);
            return;
        }
        sum += n;
        sumOfN(sum, n-1);
    }

    public static int sumOfNwithoutExtraParam(int n){
        if (n == 0) {
            return 0;
        }

        return n + sumOfNwithoutExtraParam(n-1);

    }

    public static void factOfN(int ans,int n){
        if (n == 0) {
            System.out.println("Factorial : " + ans);
            return;
        }
        ans *= n;
        factOfN(ans, n-1);
    }

}
