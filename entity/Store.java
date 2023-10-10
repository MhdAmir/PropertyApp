package com.mycompany.applicationproperty.entity;

import com.mycompany.applicationproperty.entity.User.Customer;
import com.mycompany.applicationproperty.entity.User.Seller;
import java.util.ArrayList;

public class Store {

    private ArrayList<Customer> customer;
    private ArrayList<Seller> seller;

    private String adminUserName = "admin";
    private String adminPassword = "admin";

    public Store() {
        customer = new ArrayList<>();
        seller = new ArrayList<>();
    }

    public String getUserNameAdmin() {
        return adminUserName;
    }

    public String getPasswordAdmin() {
        return adminPassword;
    }

    /**
     * Customer
     */
    public void addCustomer(String fullName, String userName,
            String password, int initTabungan) {
        customer.add(new Customer(fullName, userName,
                password, initTabungan));
    }

    public int getAmountCustomer() {
        return customer.size();
    }

    public Customer getCustomer(int indeks) {
        return customer.get(indeks);
    }

    public void delCustomer(int indeks) {
        customer.remove(indeks);
    }

    public void editCustomer(int indeks, String fullName, String userName,
            String password, int saldo) {
        Customer customer = new Customer(fullName, userName, password, saldo);
        Tabungan tabungan = customer.getTabungan();

        tabungan.setSaldo(saldo);

        customer.setFullName(fullName);
        customer.setUserName(userName);
        customer.setPassword(password);
        customer.setTabungan(tabungan);

        this.customer.set(indeks, customer);
    }

    public int getIndexCustomerAndSeller(String userName, String password) throws Exception {
        int i = 0;
        for (Customer n : this.customer) {
            if (n.getUserName().equals(userName)
                    && n.getPassword().equals(password)) {

                return i;
            }
            i++;
        }
        i = 0;
        for (Seller n : this.seller) {
            if (n.getUserName().equals(userName)
                    && n.getPassword().equals(password)) {

                return i;
            }
            i++;
        }

        throw new Exception("not found");
    }

    public int getIndexCustomerAndSeller(String userName) throws Exception {
        int i = 0;
        for (Customer n : this.customer) {
            if (n.getUserName().equals(userName)) {
                return i;
            }
            i++;
        }
        i = 0;
        for (Seller n : this.seller) {
            if (n.getUserName().equals(userName)) {
                return i;
            }
            i++;
        }
        throw new Exception("not found");
    }

    /**
     * Seller
     */
    public void addSeller(String fullName, String userName,
            String password, int initTabungan) {
        seller.add(new Seller(fullName, userName, password,
                initTabungan));
    }

    public int getAmountSeller() {
        return seller.size();
    }

    public Seller getSeller(int indeks) {
        return seller.get(indeks);
    }

    public void delSeller(int indeks) {
        seller.remove(indeks);
    }

    public void editSeller(int indeks, String fullName, String userName,
            String password, int saldo) {
        Seller seller = getSeller(indeks);
        Tabungan tabungan = seller.getTabungan();

        tabungan.setSaldo(saldo);

        seller.setFullName(fullName);
        seller.setUserName(userName);
        seller.setPassword(password);
        seller.setTabungan(tabungan);

        this.seller.set(indeks, seller);
    }

    public int getIndexCustomerOrSeller(String userName) throws Exception {
        for (Customer n : this.customer) {
            if (n.getUserName().equals(userName)) {
                return 0;
            }
        }
        for (Seller n : this.seller) {
            if (n.getUserName().equals(userName)) {
                return 1;
            }
        }
        throw new Exception("not found");
    }

    public int findHouse(int code) throws Exception {
        for (Seller n : this.seller) {
            for (int i = 0; i < n.getAmountHouse(); i++) {
                if (code == n.getHouseByIdx(i).getCode()) {
                    return i;
                }
            }

        }
        throw new Exception("not found");
    }

    public int findLand(int code) throws Exception {
        for (Seller n : this.seller) {

            for (int i = 0; i < n.getAmountLand(); i++) {
                if (code == n.getLandByIdx(i).getCode()) {
                    return i;
                }
            }
        }
        throw new Exception("not found");
    }
}
