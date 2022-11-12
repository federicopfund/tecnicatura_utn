/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcasechallenge;

/**
 *
 * @author feder
 */
public class SwitchCaseChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int formulaNumber = 50;

        String heisenbergFormula = "";

        switch (formulaNumber) {

          case 20:
             heisenbergFormula += "Mn";
          case 60:
             heisenbergFormula += "Ne";
             break;
          case 50: case 10:
             heisenbergFormula += "Mn";
          case 5: case 90:
             heisenbergFormula += "Ne";
          default:
             heisenbergFormula += "H";
        }

      System.out.println(heisenbergFormula);
   }

}

