/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_lehoangminh;

/**
 *
 * @author Macbook2015
 */
public abstract class Drink {
    String name; 
    double price; 
    int id;
    
    public abstract String getAlcoholCom();

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
    public void checkAlcohol() {
        System.out.println(getAlcoholCom());        
    }
   } 

    
   

