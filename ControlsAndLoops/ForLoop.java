package ControlsAndLoops;

public class ForLoop {
    public static void main (String [] args) {

        String[] fruits = {"Apple", "Mango", "Orange"};

        for(int i =0; i< fruits.length; i++)
            System.out.println(fruits[i]);

        /*
        Now an example that of a reverse for loop
         */
        System.out.println("\n What follows is the result of the reverse for loop");
        for(int i = fruits.length-1; i >= 0; i--) //This loop starts at the index
            // equal to the length of the loop minus 1
            System.out.println(fruits[i]);



    }
}