/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_lehoangminh;

/**
 *
 * @author Macbook2015
 */
public class BeerModel extends Drink {
    double alcoholCon; 

    public BeerModel(double alcoholCon, int id, String name, double price) {
        super(id, name, price);
        this.alcoholCon = alcoholCon;
    }

    public double getAlcoholCon() {
        return alcoholCon;
    }

    public void setAlcoholCon(double alcoholCon) {
        this.alcoholCon = alcoholCon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    } 

    @Override
    public String toString() {
        return "\nBeer ID: " + getId()
                +"\nBeer Name: " + getName() 
                + "\nBeer Alcohol Concentration: " + getAlcoholCon()
                + "\nBeer Price: $" + getPrice();
    }

    @Override
    public String getAlcoholCom() {
        return "The drink is alcohol";
    }
    
}
