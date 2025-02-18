/*
 * Java Conditional Statements - a03_Conditions.java
 * This program covers Java's conditional statements, including:
 * - if statement
 * - if-else statement
 * - if-else-if ladder
 * - switch-case statement
 */

 public class a02_Conditions {
    public static void main(String[] args) {
        // 1. If Statement
        System.out.println("=== If Statement ===");
        int num = 10;
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        System.out.println();

        // 2. If-Else Statement
        System.out.println("=== If-Else Statement ===");
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        System.out.println();

        // 3. If-Else-If Ladder
        System.out.println("=== If-Else-If Ladder ===");
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        System.out.println();

        // 4. Switch-Case Statement
        System.out.println("=== Switch-Case Statement ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
