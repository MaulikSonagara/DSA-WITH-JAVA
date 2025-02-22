public class r02_Recursion {
    public static void main(String[] args) {
        int testArr[] = { 1, 2, 3, 4, 5, 6 };
        revArray(testArr, 0);
        
        for (int i : testArr) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        String s = "madam";
        System.out.println("Is palindrome : " + isPali(s, 0));

        // 0 1 1 2 3 5 8 13 21 34 55
        int n = 10;
        System.out.print(n +  "th Fibonacci number : " + fiboNum(n));
        System.out.println();

    }

    // reverse a array using recursion and two pointer
    public static void revArray(int arr[], int l) {
        if (l >= arr.length/2) return;

        int temp = arr[l];
        arr[l] = arr[arr.length-l-1];
        arr[arr.length-l-1] = temp;

        revArray(arr, l+1);
    }

    // check for string is palindrome or not using recursion
    public static boolean isPali(String s, int l){
        if ( l >= s.length()/2){ 
            return true;
        }

        if (s.charAt(l) != s.charAt(s.length()-l-1)) {
            return false;
        }
        return isPali(s, l+1);
    }

    // print the Nth fibonacci number
    // 0 1 1 2 3 5 8 13 21 34
    public static int fiboNum(int n){
        if (n==1) return 1;
        if (n==0) return 0;
        return fiboNum(n-1) + fiboNum(n-2);
    }
}