/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty.entity;

/**
 *
 * @author mamir
 */
public class Tabungan {
    private int saldo = 0;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void simpanUang(int jumlah){
        this.saldo = this.saldo + jumlah;
    }
    public boolean ambilUang(int jumlah){
        if(jumlah > saldo){
            return false;
        }else{
            this.saldo = this.saldo - jumlah;
            return true;
        }
    }
}
