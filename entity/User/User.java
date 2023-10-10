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
public class User {
    
    private String fullName;
    private String userName;
    private String password;
    public ArrayList<House> house;
    public ArrayList<Land> land;
    public Tabungan tabungan;
    
    public User(String fullName, String userName,
            String password, int initSaldo) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        tabungan = new Tabungan(initSaldo);
        house = new ArrayList<>();
        land = new ArrayList<>();
    }
    public void addHouse(int id, int area, int rooms, int cost, String location) {
        house.add(new House(id , location,
                area, rooms, cost));
    }
    
    public void addLand(int id, int Area, int cost, String Location) {
        if (land == null) {
            land = new ArrayList<>();
        }
        land.add(new Land(id, Location, cost,
                Area));
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }

}
