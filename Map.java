package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
        }
    }

}
