/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.applicationproperty.view;

import com.mycompany.applicationproperty.ApplicationProperty;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamir
 */
public class AdminView extends javax.swing.JPanel {

    private ApplicationProperty app;
    private int type = 0;

    //0 is Customer
    //1 is Seller
    /**
     * Creates new form AdminView
     */
    public AdminView(ApplicationProperty app) {
        initComponents();
        this.app = app;
        DataView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        inputBalance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOutput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputUserName = new javax.swing.JTextField();
        inputFullName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        btnDataCustomer = new javax.swing.JButton();
        btnDataSeller = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setForeground(new java.awt.Color(57, 174, 169));
        jLabel6.setText("Balance");

        setBackground(new java.awt.Color(0, 0, 0));

        btnCancel.setBackground(new java.awt.Color(57, 174, 169));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        inputBalance.setBackground(new java.awt.Color(204, 204, 204));
        inputBalance.setForeground(new java.awt.Color(0, 0, 0));
        inputBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBalanceActionPerformed(evt);
            }
        });
        inputBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputBalanceKeyTyped(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(57, 174, 169));
        jLabel4.setText("Password");

        inputPassword.setBackground(new java.awt.Color(204, 204, 204));
        inputPassword.setForeground(new java.awt.Color(0, 0, 0));
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        inputPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPasswordKeyTyped(evt);
            }
        });

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

        jLabel1.setForeground(new java.awt.Color(57, 174, 169));
        jLabel1.setText("Full Name");

        jLabel2.setForeground(new java.awt.Color(57, 174, 169));
        jLabel2.setText("User Name");

        inputUserName.setBackground(new java.awt.Color(204, 204, 204));
        inputUserName.setForeground(new java.awt.Color(0, 0, 0));
        inputUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserNameActionPerformed(evt);
            }
        });

        inputFullName.setBackground(new java.awt.Color(204, 204, 204));
        inputFullName.setForeground(new java.awt.Color(0, 0, 0));
        inputFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFullNameActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(57, 174, 169));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(57, 174, 169));
        jLabel5.setText("Balance");

        btnDelete.setBackground(new java.awt.Color(57, 174, 169));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(85, 123, 131));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("Admin View");

        logOut.setBackground(new java.awt.Color(153, 255, 204));
        logOut.setForeground(new java.awt.Color(0, 0, 0));
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(111, 111, 111)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21))
        );

        btnDataCustomer.setText("Customer");
        btnDataCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataCustomerActionPerformed(evt);
            }
        });

        btnDataSeller.setText("Seller");
        btnDataSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataSellerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputBalance)
                    .addComponent(inputPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDataCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataSeller)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataCustomer)
                    .addComponent(btnDataSeller))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutputMouseClicked
        // TODO add your handling code here
        inputFullName.setText(tblOutput.getValueAt(tblOutput.
                getSelectedRow(), 0).toString());
        inputUserName.setText(tblOutput.getValueAt(tblOutput.
                getSelectedRow(), 1).toString());
        inputPassword.setText(tblOutput.getValueAt(tblOutput.
                getSelectedRow(), 2).toString());
        inputBalance.setText(tblOutput.getValueAt(tblOutput.
                getSelectedRow(), 3).toString());

        btnAdd.setText("Change");
    }//GEN-LAST:event_tblOutputMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String fullName = inputFullName.getText();
        String userName = inputUserName.getText();
        String password = inputPassword.getText();

        int balance = 0;

        if ("".equals(inputBalance.getText())) {
            balance = 0;
        } else {
            try {
                balance = Integer.parseInt(inputBalance.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Can't input "
                        + "string in balance");
            }
        }

        if ("".equals(fullName) || "".equals(userName)
                || "".equals(password)) {
            JOptionPane.showMessageDialog(this, "Can't add "
                    + "blank form");
        } else {
            if ("Add".equals(btnAdd.getText())) {
                if (type == 0) {
                    try {
                        app.currentUser = app.store.getIndexCustomerAndSeller(userName);
                        JOptionPane.showMessageDialog(this, "Someone "
                                + "already use this username, please change it!");
                    } catch (Exception e) {
                        app.store.addCustomer(fullName, userName,
                                password, balance);
                    }
                } else {
                    try {
                        app.currentUser = app.store.getIndexCustomerAndSeller(userName);
                        JOptionPane.showMessageDialog(this, "Someone "
                                + "already use this username, please change it!");
                    } catch (Exception e) {
                        app.store.addSeller(fullName, userName,
                                password, balance);
                    }
                }

            } else {
                if (type == 0) {
                    app.store.editCustomer(tblOutput.getSelectedRow(),
                            fullName, userName, password, balance);
                }else {
                    app.store.editSeller(tblOutput.getSelectedRow(),
                            fullName, userName, password, balance);
                }

            }
        }

        DataView();
        clear();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (inputFullName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Choose the "
                    + "data, that you want to delete");
        } else {
            int answer = JOptionPane.showConfirmDialog(null,
                    "Are you sure delete this data?");
            if (answer == 0) {
                app.store.delCustomer(tblOutput.getSelectedRow());
                DataView();
                clear();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void inputPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPasswordKeyTyped
        
    }//GEN-LAST:event_inputPasswordKeyTyped

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void inputBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBalanceActionPerformed

    private void inputFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFullNameActionPerformed

    private void inputUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserNameActionPerformed

    private void btnDataCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataCustomerActionPerformed
        // TODO add your handling code here:
        type = 0;
        DataView();
    }//GEN-LAST:event_btnDataCustomerActionPerformed

    private void btnDataSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataSellerActionPerformed
        // TODO add your handling code here:
        type = 1;
        DataView();
    }//GEN-LAST:event_btnDataSellerActionPerformed

    private void inputBalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBalanceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_inputBalanceKeyTyped

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        app.currentUser = -1;
        app.currentType = -1;
        app.showLoginView();
    }//GEN-LAST:event_logOutActionPerformed

    //utilities 
    private void clear() {
        inputFullName.setText("");
        inputUserName.setText("");
        inputPassword.setText("");
        inputBalance.setText("");

        btnAdd.setText("Add");
    }

    private void DataView() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Full Name");
        model.addColumn("User Name");
        model.addColumn("Password");
        model.addColumn("Balance");
        model.addColumn("Users type");

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);
        if (type == 0) {
            if (app.store.getAmountCustomer() > 0) {
                for (int i = 0; i < app.store.getAmountCustomer(); i++) {
                    Object[] data = {
                        app.store.getCustomer(i).getFullName(),
                        app.store.getCustomer(i).getUserName(),
                        app.store.getCustomer(i).getPassword(),
                        app.store.getCustomer(i).getTabungan().getSaldo(),
                        "Customer"
                    };
                    model.addRow(data);
                }
            }
        } else {
            if (app.store.getAmountSeller() > 0) {
                for (int i = 0; i < app.store.getAmountSeller(); i++) {
                    Object[] data = {
                        app.store.getSeller(i).getFullName(),
                        app.store.getSeller(i).getUserName(),
                        app.store.getSeller(i).getPassword(),
                        app.store.getSeller(i).getTabungan().getSaldo(),
                        "Seller"
                    };
                    model.addRow(data);
                }
            }
        }

        tblOutput.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDataCustomer;
    private javax.swing.JButton btnDataSeller;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTextField inputBalance;
    private javax.swing.JTextField inputFullName;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOut;
    private javax.swing.JTable tblOutput;
    // End of variables declaration//GEN-END:variables
}