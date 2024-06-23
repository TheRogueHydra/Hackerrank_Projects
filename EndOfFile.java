package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 1;

        while(scan.hasNext()==true) {
            String input = scan.nextLine();
            System.out.printf("%d %s%n", count, input);
            count = count + 1;
        }

    }

}