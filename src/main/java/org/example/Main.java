package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        String numStr = String.valueOf(Math.abs(num));
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedStr);
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        String numberWords = "";
        String[] nums = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        for (char chr: String.valueOf(num).toCharArray()) {
            numberWords += nums[Integer.parseInt(String.valueOf(chr))] + " ";
        }
        return numberWords.trim();
    }
}
