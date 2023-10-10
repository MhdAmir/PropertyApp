/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty.entity.User;

import com.mycompany.applicationproperty.entity.Tabungan;
import com.mycompany.applicationproperty.entity.property.House;
import com.mycompany.applicationproperty.entity.property.Land;

/**
 *
 * @author mamir
 */
public class Seller extends User {


    public Seller(String fullname, String userName,
            String password, int initTabungan) {
        super(fullname, userName, password, initTabungan);
        
    }

    /**
     * House
     */
    

    public int getAmountHouse() {
        if (house == null) {
            return 0;
        } else {
            return house.size();
        }
    }

    public void deleteHouse(int index) {
        house.remove(index);
    }

    public House getHouseByIdx(int indeks) {
        return house.get(indeks);
    }

    public void editHouse(int indeks, int id, int buildingArea, int Rooms,
            String location, int cost, boolean available) {
        house.get(indeks).setBuildingArea(buildingArea);
        house.get(indeks).setManyRooms(Rooms);
        house.get(indeks).setCost(cost);
        house.get(indeks).setLocation(location);
        house.get(indeks).setAvailable(available);

    }
    /**
     LAND
     */

    public int getAmountLand() {
        if (land == null) {
            return 0;
        } else {
            return land.size();
        }
    }

    public void deleteLand(int index) {
        land.remove(index);
    }

    public Land getLandByIdx(int indeks) {
        return land.get(indeks);
    }

    public void editLand(int indeks,int id, int cost,String location,int landArea, 
            boolean available) {
        land.get(indeks).setCost(cost);
        land.get(indeks).setLocation(location);
        land.get(indeks).setLandArea(landArea);
        land.get(indeks).setAvailable(available);
    }
}
