package ControlsAndLoops;

import java.util.Scanner;

public class DoWhileScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

    }
}