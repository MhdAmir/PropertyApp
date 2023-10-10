/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty.entity.property;

/**
 *
 * @author mamir
 */
public class House extends Property {

    private int buildingArea;
    private int manyRooms;
    
    public House(int id, String location, int buildingArea, int manyRooms,
            int cost) {
        super(id, location, cost);
        this.buildingArea = buildingArea;
        this.manyRooms = manyRooms;
    }


    public int getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(int buildingArea) {
        this.buildingArea = buildingArea;
    }

    public int getManyRooms() {
        return manyRooms;
    }

    public void setManyRooms(int manyRooms) {
        this.manyRooms = manyRooms;
    }

}
