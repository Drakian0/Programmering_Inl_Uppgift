package Inlämningsuppgift.Del2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Counter counter = new Counter();

        System.out.println("Please enter some words");
        System.out.println("When you are finished enter stop");
        while(counter.isOn()) {
            counter.count(sc.nextLine());
        }

        System.out.println("Total characters: " + counter.getChars());
        System.out.println("Total words: " + counter.getWords());
        System.out.println("Total rows: " + counter.getRows());
        System.out.println("The longest word was: " + counter.getLongest());
    }
}
