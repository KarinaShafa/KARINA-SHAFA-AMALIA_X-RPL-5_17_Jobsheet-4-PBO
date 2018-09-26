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
public class Latihan1B extends Latihan1A{
    public void walk (){
        System.out.println("Aaeroplan is Flying");
    }
    public static void main (String[]args){
        Latihan1B garuda = new Latihan1B();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
