package com.stackroute.PE2;

public class Palindrome {

    public String checkPalindromeString(String s)
    {

        String temp= s;
        String reverse="";
        for (int i=s.length()-1; i>=0; i--)
        {
            reverse= reverse+ s.charAt(i);

        }


        if (temp.equals(reverse))
            return "a given number is palindrome";
        else
            return "a given number not is a palindrome";

    }
}
