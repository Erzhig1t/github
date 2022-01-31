package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "  WINDOW ";
        String b = a.trim();

        System.out.println(b.replace("WINDOW", "ERZHIGIT"));
        System.out.println(b.length());
        System.out.println(a.length());
        System.out.println(a.concat(b));
    }
}
