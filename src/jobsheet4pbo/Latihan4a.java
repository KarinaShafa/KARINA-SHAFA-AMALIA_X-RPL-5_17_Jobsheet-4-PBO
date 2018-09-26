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
public class Latihan4a {
    //Private member variable
    private String color;
    //contruktor
    public Latihan4a (String color){
        this.color = color;
    }
    public String toString(){
        return "Shape[color=" +color + "]";
    }
    //All shapes must have a mehod called getArea().
    public double getArea(){
        // we need to return some value to compile the program.
        System.out.println("Shape unknow! Cannot compute area!");
        return 0;
    }
}
