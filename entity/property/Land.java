/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty.entity.property;

/**
 *
 * @author mamir
 */
public class Land extends Property {

    private int landArea;

    public Land(int id, String location, int cost, int landArea) {
        super(id, location, cost);
        this.landArea = landArea;
    }

    public int getLandArea() {
        return landArea;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }

}
