package com.java.assignments.assignment2;

import java.util.Scanner;
import java.util.regex.*;

public class AlphaCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inpStr=sc.next();
        Pattern p=Pattern.compile("[a-zA-Z]");
        Matcher m=p.matcher(inpStr);
        //traverse through whole string(let n be length of string) to find the alphabet
        if(m.find()){
            System.out.println("Yes, String contains the alphabets");
        }
        else{
            System.out.println("No, String doesn't contain the alphabets");
        }
        //Time complexity: O(n)
        //Space complexity: O(1)
    }
}
