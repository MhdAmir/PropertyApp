/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty.entity.User;

import com.mycompany.applicationproperty.entity.Tabungan;
import com.mycompany.applicationproperty.entity.property.House;
import com.mycompany.applicationproperty.entity.property.Land;
import java.util.ArrayList;

/**
 *
 * @author mamir
 */
public class Customer extends User {


    public Customer(String fullname, String userName, String password
            , int initTabungan) {
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

    /**
     * LAND
     */
    

    public int getAmountLand() {
        if (land == null) {
            return 0;
        } else {
            return land.size();
        }
    }

    public void deleteLnd(int index) {
        land.remove(index);
    }

    public Land getLandByIdx(int indeks) {
        return land.get(indeks);
    }

}
