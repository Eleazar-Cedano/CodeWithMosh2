package ControlsAndLoops;

import java.util.Scanner;

public class WhileAndIFstatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        } while (!input.equals("quit"));
    }
}
