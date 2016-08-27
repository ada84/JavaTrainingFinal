/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingisright;

import java.awt.Point;

/**
 *
 * @author Ada
 */
public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
	origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
	origin = p;
    }
    public Rectangle(int w, int h) {
	this(new Point(0, 0), w, h);
    }
    public Rectangle(Point p, int w, int h) {
	origin = p;
	width = w;
	height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
	origin.x = x;
	origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int area() {
	return width * height;
    }
}
