package Inlämningsuppgift.Del2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Counter counter = new Counter();

        while(counter.on) {
            counter.count(sc.nextLine());
        }

        System.out.println("Total characters: " + counter.chars);
        System.out.println("Total words: " + counter.words);
        System.out.println("Total rows: " + counter.rows);
        System.out.println("The longest word was: " + counter.longest);
    }
}
