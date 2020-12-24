package com.maksim;

import java.util.Scanner;

public class TextManipulation {
    public void start() {
        System.out.print("Enter text: ");
        String text = enterString();

        System.out.print("Enter s: ");
        String s = enterString();

        System.out.print("Enter t: ");
        String t = enterString();

        String result = manipulate(text, s, t);
        System.out.printf("Original text: %s%nResulting text: %s%n", text, result);
    }

    private String manipulate(String text, String s, String t) {
        String[] words = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" ");
            if (word.endsWith(s)) {
                builder.append(t).append(" ");
            }
        }
        return builder.toString();
    }

    private String enterString() {
        return new Scanner(System.in).nextLine();
    }
}
