package com.netcracker.ch1;

import java.util.Scanner;

public class Ex8 {
    private String str;

    public String scanString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = scanner.nextLine();
        return str;
    }

    public void printSubstrings() {
        for (int i = 0; i < str.length(); i++) {
            if (!(" ".equals(str.substring(i, i + 1))))
                for (int j = i + 1; j <= str.length(); j++) {
                    System.out.println(str.substring(i, j));
                }
        }

    }
}
