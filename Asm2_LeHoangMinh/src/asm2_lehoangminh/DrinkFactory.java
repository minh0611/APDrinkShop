/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_lehoangminh;

import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class DrinkFactory {
    protected ManageDrink md = new ManageDrink();
    protected Scanner scan = new Scanner(System.in);
    
//    public abstract BeerClub getDrink();
    
    public void callDrink(){
        int choose;
        do {
            showMenu();
            choose = scan.nextInt();

            switch (choose) {
                case 1 -> {
                    md.addBeer();
                    break;
                }
                case 2 -> {
                    md.addJuice();
                    break;
                }
                case 3 -> {
                    md.deleteDrink();
                    break;
                }
                case 4 -> {
                    md.viewAll();
                    break;
                }
                case 5 -> {
                    md.searchDrink();
                    break;
                }
                case 6 -> {
                    md.checkAlcoholCom();
                    break;
                }
                default ->
                    System.out.println("Nhap sai!!!");
            }
        } while (choose != 7);
    }

    static void showMenu() {
        System.out.println("________________________");
        System.out.println("Manage Drink");
        System.out.println("________________________");
        System.out.println("1. Add new beer ");
        System.out.println("2. Add new juice ");
        System.out.println("3. Delete Drink");
        System.out.println("4. View all drink"); 
        System.out.println("5. Search drink");
        System.out.println("6. Check alcohol concentration");
        System.out.println("________________________"); 
        System.out.print("Choose an option: ");
    }
} 
