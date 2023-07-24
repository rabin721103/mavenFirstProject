package org.example;

import java.util.Scanner;

public class ReverseStringUsingCollection {
    public static String reverseString (String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        scanner.close();

        String reversedString = reverseString(str);
        System.out.println("Reversed String is: " + reversedString);
    }
}
