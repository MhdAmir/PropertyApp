/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applicationproperty;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import com.mycompany.applicationproperty.entity.Store;
import com.mycompany.applicationproperty.view.AdminView;
import com.mycompany.applicationproperty.view.CustomerHomeView;
import com.mycompany.applicationproperty.view.LoginView;
import com.mycompany.applicationproperty.view.MyPurchasedView;
import com.mycompany.applicationproperty.view.RegisterView;
import com.mycompany.applicationproperty.view.SellerHomeView;
import com.mycompany.applicationproperty.view.TopUpView;
import com.mycompany.applicationproperty.view.WithDrawView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author mamir
 */
public class ApplicationProperty {

    private JFrame app;
    public Store store;
    public int currentUser = -1;
    public int currentType = -1;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatGradiantoDeepOceanIJTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            ApplicationProperty app = new ApplicationProperty();
            app.store.addCustomer("Muhammad Amir", "amir123",
                    "123", 0);
            app.store.addSeller("Mafia Property", "mafia",
                    "123", 0);
            app.store.addSeller("yasir", "yasir", "yasir", 0);
            app.store.getSeller(1).addHouse(1, 500, 10, 30044, "Jl. Wisma Permai I 7-15, Mulyorejo, Kec. Mulyorejo, Surabaya, Jawa Timur 60115");
            app.store.getSeller(1).addHouse(2, 100, 2, 20043, "Jl. Kertajaya Indah Timur XV Blok P-135 No.10");
            app.store.getSeller(0).addHouse(3, 250, 4, 10034, "Jl. Raya Sukabumi No.99, Nyangkowek, Kec. Cicurug, Kabupaten Sukabumi, Jawa Barat 43359");
            app.store.getSeller(1).addHouse(4, 300, 6, 10333, "Jl. Tangkil - Agrabinta No.91-101, Sundawenang, Kec. Parungkuda, Kabupaten Sukabumi, Jawa Barat 43357");
            app.showLoginView();
        });
    }
    

    public ApplicationProperty() {
        this.app = new JFrame("Property Apps");
        this.store = new Store();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 470);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }

    public void showAdminHomeView() {
        changeView(new AdminView(this));
        app.setSize(700, 600);
    }

    public void showLoginView() {
        changeView(new LoginView(this));
        app.setSize(449, 530);
    }

    public void showRegisterView() {
        changeView(new RegisterView(this));
        app.setSize(449, 530);
    }

    public void showCustomerHomeView() {
        changeView(new CustomerHomeView(this));
        app.setSize(1300, 725);
    }

    public void showSellerHomeView() {
        changeView(new SellerHomeView(this));
        app.setSize(950, 720);
    }
//

    public void showTopUpView() {
        changeView(new TopUpView(this));
        app.setSize(400, 300);
    }

    public void showWithdrawView() {
        changeView(new WithDrawView(this));
        app.setSize(400, 300);
    }

    public void showMyPurchasedView() {
        changeView(new MyPurchasedView(this));
        app.setSize(480, 600);

    }

    public void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
        app.setLocationRelativeTo(null);
    }
}
