/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_lehoangminh;

/**
 *
 * @author Macbook2015
 */
public class JuiceModel extends Drink {
    String fruitType; 

    public JuiceModel(int id, String fruitType, String name, double price) {
        super(id, name, price);
        this.fruitType = fruitType;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
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
    public String getAlcoholCom() {
        return "Drink is non-alcohol";
    } 

    @Override
    public String toString() {
        return "\nJuice ID: " + getId()
                +"\nJuice Name: " + getName() 
                + "\nJuice Fruit: " + getFruitType()
                + "\nJuice Price: $" + getPrice();
    }
    
    
}
