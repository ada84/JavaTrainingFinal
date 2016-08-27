/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingisright;

/**
 *
 * @author Ada
 */
public class SomethingIsRight {
    public static void main(String[] args) {
        // creating an instance of the class
        Rectangle myRect = new Rectangle();
        // initializating its two member variables
        myRect.width = 40;
        myRect.height = 50;
        //displaying the value of rect's area
        System.out.println("myRect's area is " + myRect.area());
    }
}
