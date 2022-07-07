package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        String str;
        int count = 100000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        str = sc.nextLine();
        System.out.println(reverseString(str));
        Instant start = Instant.now();
        for(int i = 0; i < count; i++){
            reverseString(str);
        }
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("При " + count + " повторений прошло времени, мс: " + elapsed);
    }

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
