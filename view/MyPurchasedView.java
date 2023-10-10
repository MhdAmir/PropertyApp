/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.applicationproperty.view;

import com.mycompany.applicationproperty.ApplicationProperty;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamir
 */
public class MyPurchasedView extends javax.swing.JPanel {

    /**
     * Creates new form MyPurchasedView
     */
    private ApplicationProperty app;
    private int userId;
    private int type = 0;

    public MyPurchasedView(ApplicationProperty app) {
        initComponents();
        this.app = app;
        userId = app.currentUser;
        DataView();
    }

    private void DataView() {
        DefaultTableModel model = new DefaultTableModel();
        userId = app.currentUser;
        if (type == 0) {
            model.addColumn("Code Item");
            model.addColumn("location");
            model.addColumn("Cost");
            model.addColumn("building Area");
            model.addColumn("many Rooms");

            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            if (app.store.getCustomer(userId).getAmountHouse() > 0) {
                for (int i = 0; i < app.store.getCustomer(userId).
                        getAmountHouse(); i++) {
                    Object[] data = {
                        app.store.getCustomer(userId).getHouseByIdx(i).getCode(),
                        app.store.getCustomer(userId).getHouseByIdx(i).getLocation(),
                        app.store.getCustomer(userId).getHouseByIdx(i).getCost(),
                        app.store.getCustomer(userId).getHouseByIdx(i).getBuildingArea(),
                        app.store.getCustomer(userId).getHouseByIdx(i).getManyRooms(),
                    };
                    model.addRow(data);
                }
            }
           
        } else {
            model.addColumn("Code Item");
            model.addColumn("Location");
            model.addColumn("Cost");
            model.addColumn("Land Area");

            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);

            if (app.store.getCustomer(userId).getAmountLand() > 0) {
                for (int i = 0; i < app.store.getCustomer(userId).
                        getAmountHouse(); i++) {
                    Object[] data = {
                        app.store.getCustomer(userId).getLandByIdx(i).getCode(),
                        app.store.getCustomer(userId).getLandByIdx(i).getLocation(),
                        app.store.getCustomer(userId).getLandByIdx(i).getCost(),
                        app.store.getCustomer(userId).getLandByIdx(i).getLandArea(),
                    };
                    model.addRow(data);
                }
            }
        }

        tblOutput.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOutput = new javax.swing.JTable();
        btnLand = new javax.swing.JButton();
        btnHouse = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Your Puchasest List");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        tblOutput.setBackground(new java.awt.Color(229, 239, 193));
        tblOutput.setForeground(new java.awt.Color(0, 0, 0));
        tblOutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "First Name", "Last Name", "Balance", "User Name", "Password"
            }
        ));
        tblOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOutputMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOutput);

        btnLand.setText("Land");
        btnLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandActionPerformed(evt);
            }
        });

        btnHouse.setText("House");
        btnHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnLand, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLand)
                    .addComponent(btnHouse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutputMouseClicked
        // TODO add your handling code here
        
    }//GEN-LAST:event_tblOutputMouseClicked

    private void btnHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseActionPerformed
        // TODO add your handling code here:
        type = 0;
        DataView();
    }//GEN-LAST:event_btnHouseActionPerformed

    private void btnLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandActionPerformed
        // TODO add your handling code here:
        type = 1;
        DataView();
    }//GEN-LAST:event_btnLandActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        app.showCustomerHomeView();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHouse;
    private javax.swing.JButton btnLand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOutput;
    // End of variables declaration//GEN-END:variables
}