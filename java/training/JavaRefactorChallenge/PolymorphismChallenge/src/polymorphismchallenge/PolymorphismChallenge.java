/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismchallenge;

/**
 *
 * @author feder
 */
public class PolymorphismChallenge implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new PolymorphismChallenge());
        t.start();
    }

    @Override
    public void run() throws ArithmeticException {
        int x =0;
        System.out.println(x/10);
    }
}
