/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty.entity.property;

/**
 *
 * @author mamir
 */
public class Property {

    private int code;
    private String location;
    private int cost;
    private boolean available;

    public Property(int id, String location, int cost) {
        this.code = id;
        this.location = location;
        this.cost = cost;
        this.available = true; // Properti awalnya tersedia untuk dijual
    }

    public int getCode() {
        return code;
    }

    public void setCode(int id) {
        this.code = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean tersedia) {
        this.available = tersedia;
    }
}
