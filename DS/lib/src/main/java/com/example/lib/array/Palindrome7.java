package com.example.lib.array;

/**
 * Created by Vijay on 10-09-2023.
 */
public class Palindrome7 {

    public boolean isPalindrome(String palindrome) {
        char[] charArray = palindrome.toCharArray();
        int start = 0;
        int end = palindrome.length() - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]){
                return false;
            }
        start++;
        end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palindromeCheck = "MADAM";
        Palindrome7 obj = new Palindrome7();
        if (obj.isPalindrome(palindromeCheck)) {
            System.out.println("paldindrome");
        } else {
            System.out.println("not paldindrome");
        }
    }

}
