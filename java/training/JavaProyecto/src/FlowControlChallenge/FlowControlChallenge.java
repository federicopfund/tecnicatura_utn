/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlowControlChallenge;

/**
 *
 * @author federico pfund
 */
public class FlowControlChallenge {
      public static void main(String... doYourBest) {
         boolean isBarneyAlcoholic = true;
         boolean isHomerFat = true;
         String result = "";
//isHomerFat será verdadero y isBarneyAlcoholic será verdadero. La primera 
// condición será falsa y la segunda será falsa.
        if (!(isHomerFat = true) || !(isBarneyAlcoholic = !false)){
            result +="2";}
// isHomerFat será verdadero e isBarneyAlcoholic será falso. La primera
// condición será verdadera y la segunda condición será verdadera.       
        if ((isHomerFat = true) & !(isBarneyAlcoholic = !isBarneyAlcoholic )){
            result +="3";}
//isBarneyAlcoholic será verdadero y isHomerFat será verdadero.
// La primera y segunda condiciones serán verdaderas.
        if ((isBarneyAlcoholic = !isBarneyAlcoholic) && isHomerFat){
            result +="4";}
//isBarneyAlcoholic será verdadero y isHomerFat seguirá siendo verdadero. 
// Toda la condición será verdadera.        
        if ((isBarneyAlcoholic = !true) | isHomerFat){
            result +="5";}
       /* if ((isHomerFat = true) & (isBarneyAlcoholic = true)){
            result +="4";}
        if ((isHomerFat)  || (isBarneyAlcoholic = false)){
            result +="5";}
        */ 
        System.out.println(result + isHomerFat + isBarneyAlcoholic);
      }
}