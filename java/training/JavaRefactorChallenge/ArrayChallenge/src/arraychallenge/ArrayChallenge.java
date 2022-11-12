/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraychallenge;

import java.util.Arrays;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] anyArray = new int[5];
        anyArray[0] = 0;
        anyArray[1] = 2;
        anyArray[2] = 4;
        anyArray[3] = 6;
        anyArray[4] = 8;

        int[] otherArray = anyArray;
        doSum(anyArray);
        doSum(otherArray);

        Arrays.stream(anyArray).forEach(System.out::println);
    }
   private static void doSum(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            anyArray[i] = anyArray[i] + 2;
        }
    }
    
}
