public class a01_BasicMath {

    // Method to count the number of digits in an integer
    public static int countDigits(int number) {
        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);

        // Special case for zero
        if (number == 0) {
            return 1;
        }

        int count = 0;

        // While Loop Explanation:
        // This loop iterates as long as the 'number' is greater than 0.
        // In each iteration, it removes the last digit of the number by performing integer division by 10 (number /= 10;).
        // The count is incremented in each iteration, effectively counting the digits.
        // Example:
        // number = 1234, count = 0
        // 1st iteration: number becomes 123, count becomes 1
        // 2nd iteration: number becomes 12, count becomes 2
        // 3rd iteration: number becomes 1, count becomes 3
        // 4th iteration: number becomes 0, count becomes 4 (loop terminates)
        while (number > 0) {
            number /= 10; // Integer division removes the last digit
            count++;
        }
        return count;
    }

    // Method to extract the digits of a number into an array
    public static int[] extractDigits(int number) {
        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);

        // First, find out how many digits there are
        int numDigits = countDigits(number);

        // Create an array to hold the digits
        int[] digits = new int[numDigits];

        // For Loop Explanation:
        // This loop iterates from the last index of the 'digits' array (numDigits - 1) down to 0.
        // In each iteration:
        // 1. It extracts the last digit of the 'number' using the modulo operator (%) and stores it in the 'digits' array.
        // 2. It removes the last digit from the 'number' by performing integer division by 10.
        // The loop ensures that digits are extracted and placed in the correct order in the array.
        // Example:
        // number = 123, numDigits = 3, digits = [0, 0, 0]
        // 1st iteration: i = 2, digits[2] = 123 % 10 = 3, number becomes 12
        // 2nd iteration: i = 1, digits[1] = 12 % 10 = 2, number becomes 1
        // 3rd iteration: i = 0, digits[0] = 1 % 10 = 1, number becomes 0
        // Result: digits = [1, 2, 3]
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10; // Get the last digit
            number /= 10;            // Remove the last digit
        }
        return digits;
    }

    // Method to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        // While Loop Explanation:
        // This loop continues as long as the 'number' is not equal to 0.
        // In each iteration:
        // 1. It extracts the last digit of the 'number' using the modulo operator (%).
        // 2. It builds the 'reversed' number by multiplying it by 10 and adding the extracted digit.
        // 3. It removes the last digit from the 'number' by performing integer division by 10.
        // Example:
        // number = 123, reversed = 0
        // 1st iteration: digit = 3, reversed = 0 * 10 + 3 = 3, number becomes 12
        // 2nd iteration: digit = 2, reversed = 3 * 10 + 2 = 32, number becomes 1
        // 3rd iteration: digit = 1, reversed = 32 * 10 + 1 = 321, number becomes 0 (loop terminates)
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int countDigitsUsingLog10(int number) {
        // 1. Handle the special case where the number is zero:
        //    The logarithm of 0 is undefined, so we need to handle this case separately.
        //    Zero has one digit (0 itself).
        if (number == 0) {
            return 1;
        }

        // 2. Handle negative numbers:
        //    The Math.log10() function is defined for positive numbers.
        //    To handle negative numbers, we take the absolute value using Math.abs().
        //    The number of digits is the same whether the number is positive or negative.
        number = Math.abs(number);

        // 3. Calculate the number of digits using the logarithm base 10:
        //    Math.log10(number) returns the base-10 logarithm of the number.
        //    For example:
        //      - Math.log10(100) returns 2.0 (because 10^2 = 100).
        //      - Math.log10(1000) returns 3.0 (because 10^3 = 1000).
        //    Math.floor(log10(number)) rounds the result *down* to the nearest integer.
        //    We add 1 to the result because the logarithm effectively gives you the power of 10
        //    *less than* the number of digits.  For example, log10(123) is approximately 2.0899,
        //    so floor(2.0899) is 2, and we add 1 to get 3 digits.
        //    Finally, we cast the result to an int to return an integer value.

        return (int)(Math.floor(Math.log10(number)) + 1);
    }

    public static void main(String[] args) {
        int num = 12345;

        // Count digits
        int digitCount = countDigits(num);
        System.out.println("Number of digits in " + num + ": " + digitCount);

        // Extract digits
        int[] digitsArray = extractDigits(num);
        System.out.print("Digits of " + num + ": ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reverse the number
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number of " + num + ": " + reversedNum);


        int countDigitUsingLog = countDigitsUsingLog10(num);
        System.out.println("Digits counted using Log10 of " + num + ": " + countDigitUsingLog);
    }
}
