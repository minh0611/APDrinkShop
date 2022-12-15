/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm2_lehoangminh;

import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        JuiceStore store = new JuiceStore();
//        store.callDrink();
        DrinkFactory factory = new DrinkFactory();
        factory.callDrink(); 
        
    }
}
