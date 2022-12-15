/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_lehoangminh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class ManageDrink {

    ArrayList<Drink> drinkList = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public void addBeer() {
        System.out.println("ADD A NEW BEER");
        System.out.println("___________________________");
        System.out.println("Enter id: ");
        int id = scan.nextInt();
        System.out.println("Enter alcohol con: ");
        double alcoholCon = scan.nextDouble();
        System.out.println("Enter name: ");
        String name = scan.next();
        System.out.println("Enter price: ");
        double price = scan.nextDouble();

        BeerModel beer = new BeerModel(alcoholCon, id, name, price);
        drinkList.add(beer);
        System.out.println("Sucessfully add: \n" + beer.toString());
    }

    public void addJuice() {
        System.out.println("ADD A NEW JUICE");
        System.out.println("___________________________");
        System.out.println("Enter id: ");
        int id = scan.nextInt();
        System.out.println("Enter fruit: ");
        String fruitType = scan.next();
        scan.nextLine();
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter price: ");
        double price = scan.nextDouble();

        JuiceModel juice = new JuiceModel(id, fruitType, name, price);
        drinkList.add(juice);
        System.out.println("Sucessfully add: \n" + juice.toString());
    }

    public void deleteDrink() {
        System.out.println("DELETE A DRINK");
        System.out.println("___________________________________");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter drink id: ");
        int id = scan.nextInt();
        for (Drink drink : drinkList) {
            if (drink.id == id) {
                drinkList.remove(drink);
                System.out.println("Succesfully delete: \n" + drink.toString());
                return;
            }
            System.out.println("Drink is not available");
        }
    }

    public void viewAll() {
        System.out.println("LIST OF DRINK");
        System.out.println("_________________");
        for (Drink drink : drinkList) {
            System.out.println(drink.toString() + '\n');
        }
    }

    public void searchDrink() {
        System.out.println("SEARCH FOR A DRINK");
        System.out.println("_________________________");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter drink id: ");
        int id = scan.nextInt();
        int drinkCount = 0;
        for (Drink drink : drinkList) {
            if (drink.id == id) {
                System.out.println(drink.toString());
                return;
            } else {
                ++drinkCount;
            }
        }
        if (drinkCount == drinkList.size()) {
            System.out.println("Drink not available");
        }
    }

    public void checkAlcoholCom() {
        System.out.println("CHECK ALCOHOL CONCENTRATION OF A DRINK");
        System.out.println("________________________________________");
        Scanner scan = new Scanner(System.in);
        int drinkCount = 0;
        System.out.println("Enter drink name: ");
        int id = scan.nextInt();

        for (Drink drink : drinkList) {
            if (drink.id == id) {
                drink.checkAlcohol();
                return;
            } else {
                ++drinkCount;
            }
            if (drinkCount == drinkList.size()) {
                System.out.println("Drink not available!!");
            }
        }
    }
}
