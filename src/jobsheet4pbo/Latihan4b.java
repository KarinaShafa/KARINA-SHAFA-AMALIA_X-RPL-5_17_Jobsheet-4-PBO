/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4pbo;

/**
 *
 * @author ASUS
 */
public class Latihan4b extends Latihan4a {
    //private member variables
    private int length;
    private int width;
    //Contructor
    public Latihan4b(String color, int legth, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    public String toString(){
        return "Rectangle[length=" + length + "width=" +width + "," + super.toString() + "]";
    }
    //Override the inherited getArea() to provide the proper implementation
public double getArea()    {
    return length*width;
}
}

