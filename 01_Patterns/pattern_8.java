package Patterns;

public class pattern_8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}