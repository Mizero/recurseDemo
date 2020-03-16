/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygithub;

/**
 *
 * @author Alain Patience Mizero
 */
public class MyGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("CracklePop");
            } else if (i % 3 == 0) {
                System.out.println("Crackle ");
            } else if (i % 5 == 0) {
                System.out.println("Pop");
            } else {
                System.out.println(i);
            }
        }
    }
    
}
