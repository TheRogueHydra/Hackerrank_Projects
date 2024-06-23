package com.company;
import java.io.*;
import java.util.*;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] stringarray = s.split("[ !,?._'@]+");
        System.out.println(stringarray.length);
        for(int i=0; i<stringarray.length; i++) {
            System.out.println(stringarray[i]);
        }

        scan.close();
    }
}
