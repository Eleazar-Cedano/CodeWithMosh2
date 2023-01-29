package ArraysCode;

import java.util.Arrays;

public class MultiDArrays {

    public static void main(String[] args){
        int[][] multiD =  {{1,2,3,4,5},{4,5,6}};
        /*
        MultiDimensional Arrays can also be initialized
        like this:  int[][] = new int [2][3];
        Each Bracket represents a Dimension of the Array.
        The first brackets represent the number of Rows.
        The second brackets represent the number of Columns.
        Perhaps Multidimensional are better understood as
         "Arrays of Arrays". To mean that they are literally Arrays
         that contain other Arrays in them. The position of these Arrays
        within Arrays are indexed starting at 0, just like
        the items in any other Arrays; in a multidimensional
        Array of 2, the first inner Array has an index of 0
        and the first item inside this Array has an index of 0 ([0][0]).
         The second Array has an index of 1, and the first item
         in this Array has an index of 0. ([1][0]).
         */

        System.out.println(Arrays.deepToString(multiD));

    }
} // end of MultiDArrays
