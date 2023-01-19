package ControlsAndLoops;

import java.util.Scanner;

public class WhileAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("pass"))
                continue; //This keyword moves control to the beginning of the loop.
            if (input.equals("quit"))
                break;  //this statements terminates the process that follow.
            System.out.println(input);
        } while (true); /*Condition is always true because the break
         and continue statements control progress of the loop*/
    }
}
