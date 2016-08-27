/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberholder;

public class NumberHolderDisplay {
    // declaring the fields
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        // creating an instance of the class
	NumberHolder aNumberHolder = new NumberHolder();
        // initializating its two member variables
	aNumberHolder.anInt = 1;
	aNumberHolder.aFloat = 2.3f;
        //displaying the value of each member variable
	System.out.println(aNumberHolder.anInt);
	System.out.println(aNumberHolder.aFloat);
    }
}
