/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.fmontiel.models;

/**
 *
 * @author Trabajo
 */
public class Vehicle {
    private String plate;
    private String color;
    private String line;
    private String model;
    private String owner;

    public Vehicle(String plate, String color, String line, String model, String owner) {
        this.plate = plate;
        this.color = color;
        this.line = line;
        this.model = model;
        this.owner = owner;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getLine() {
        return line;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return plate + " - " + color + " - " + line + " - " + model + " - " + owner;
    }
}



