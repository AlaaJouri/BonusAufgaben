package org.example;

import com.sun.tools.javac.Main;

import java.util.Scanner;


public class Novice {
    public static void main(String[] args) {
        Novice testNovice = new Novice();
        testNovice.printName();
    }
//
    public Novice() {
    }

    public void printNameFiveTimes() {
    Integer counter = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello world!");
            counter++;
        }

    }
    public boolean Number(int Num) {
        return Num > 0;
    }

    public int square(int i) {
        return i*i;

    }
    public void printName() {
    Scanner nameScanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein");
        String name = nameScanner.nextLine();
        //String nachricht = String.format("Hallo "+name);

        System.out.println("Hallo "+name);
    }
}
