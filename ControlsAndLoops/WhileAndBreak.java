package ControlsAndLoops;

import java.util.Scanner;

public class WhileAndBreak {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = "";

            do {
                System.out.print("Input: ");
                input = scanner.nextLine().toLowerCase();
                if (input.equals("quit"))
                    break;  //this statements terminates the process that follow.
                System.out.println(input);
            } while (!input.equals("quit"));
        }
    }

