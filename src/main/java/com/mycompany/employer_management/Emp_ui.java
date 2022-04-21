/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.employer_management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import javafx.scene.control.Cell;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Emp_ui extends javax.swing.JFrame {
    
    List <Emp_users> Emp_users = new ArrayList();
        
   
    public Emp_ui() {
        initComponents();
        
        this.setTitle("EMP Management System");  
       // this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\@WLOGO_48x48.png")));
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        bthSubmit = new javax.swing.JButton();
        bthUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Employer ID");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Full Name");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contact");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Official Mail");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16))
        );

        bthSubmit.setBackground(new java.awt.Color(153, 0, 153));
        bthSubmit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        bthSubmit.setForeground(new java.awt.Color(255, 204, 204));
        bthSubmit.setText("Submit");
        bthSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthSubmitActionPerformed(evt);
            }
        });

        bthUpdate.setBackground(new java.awt.Color(153, 0, 153));
        bthUpdate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        bthUpdate.setForeground(new java.awt.Color(255, 204, 204));
        bthUpdate.setText("Update");
        bthUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 153));
        btnDelete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnWrite.setBackground(new java.awt.Color(153, 0, 153));
        btnWrite.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnWrite.setForeground(new java.awt.Color(255, 204, 204));
        btnWrite.setText("Write");
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 0, 153));
        btnClear.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 204, 204));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 0, 153));
        btnExit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 204, 204));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(153, 0, 153));
        btnView.setForeground(new java.awt.Color(255, 204, 204));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnRead.setBackground(new java.awt.Color(153, 0, 153));
        btnRead.setForeground(new java.awt.Color(255, 204, 204));
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bthSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bthUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(btnRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bthUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bthSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        EmpTable.setBackground(new java.awt.Color(255, 255, 255));
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employer ID", "Name", "Address", "Official Mail", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("EMP Management Registration");

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("EMP @ 2022 All rights reserved ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        addempTable();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        //----------------------------Exit Window-------------------------------
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        //--------------------------Clear Window--------------------------------

        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtMail.setText("");
        txtContact.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed

        addRowtoExcel();
        
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\write.png");
        JOptionPane.showMessageDialog(rootPane, "<html><b style=\"color:#800080; font-size:20px\">Data Write Successfully !  ","EMP Excel Management Service",JOptionPane.INFORMATION_MESSAGE,icon);
    }//GEN-LAST:event_btnWriteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();
        
        //-----------------------Delete Row-----------------------------------
        
        if(EmpTable.getSelectedRowCount()==1){
        
            //-------------if Single row is selected than delete--------------
            
            model.removeRow(EmpTable.getSelectedRow());
            
            ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\delete.jpg");
        JOptionPane.showMessageDialog(rootPane, "<html><b style=\"color:red; font-size:20px\">Your Data Deleted ! ","EMP Management User",JOptionPane.INFORMATION_MESSAGE,icon);
            
        }else{
            
             if(EmpTable.getRowCount()==0){
                 
                //----------------if table is empty (no data) than display message---------------------
                
                ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\delete.jpg");
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:red; font-size:20px\">Table is Empty ","EMP Management User",JOptionPane.INFORMATION_MESSAGE,icon);
                
             }else{
             
                //---------------if table is not empty but row is not selected or multiple row is selected------------------
                
                ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\delete.jpg");
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:red; font-size:20px\">Please Select Single Row for Delete ","EMP Management User",JOptionPane.INFORMATION_MESSAGE,icon);
                
             }
        }
        
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void bthUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthUpdateActionPerformed

        int g = EmpTable.getSelectedRow();
         DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();
        if(g >= 0)
        {
            model.setValueAt(txtID.getText(), g, 0);
            model.setValueAt(txtName.getText(), g, 1);
            model.setValueAt(txtAddress.getText(), g, 2);
            model.setValueAt(txtMail.getText(), g, 3);
            model.setValueAt(txtContact.getText(), g, 4);
            
            ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\update.png");
            JOptionPane.showMessageDialog(rootPane, "<html><b style=\"color:green; font-size:20px\">Your Data Updated ! ","EMP Management User",JOptionPane.INFORMATION_MESSAGE,icon);
        }else{
            ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\error.png");
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:#AA4A44; font-size:20px\">Update Error ! ","EMP Management User",JOptionPane.INFORMATION_MESSAGE,icon);
        }
        
       
    }//GEN-LAST:event_bthUpdateActionPerformed

    private void bthSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthSubmitActionPerformed

        Emp_users z = new Emp_users();
        //-----------Set Values into TextFields--------------------

        z.setEmpID(Integer.parseInt(txtID.getText()));
        z.setEmpName(txtName.getText());
        z.setEmpAddress(txtAddress.getText());
        z.setEmpEmail(txtMail.getText());
        z.setEmpContact(txtContact.getText());

        Emp_users.add(z);

        ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\Personal.jpg");
        JOptionPane.showMessageDialog(rootPane, "<html><b style=\"color:blue; font-size:20px\">Welcome  "+txtName.getText()+"  !  ","EMP Management User",JOptionPane.INFORMATION_MESSAGE,icon);
    }//GEN-LAST:event_bthSubmitActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        
        ReadRowtoExcel();
        
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\employer_management\\src\\main\\java\\com\\mycompany\\employer_management\\read.jpg");
        JOptionPane.showMessageDialog(rootPane, "<html><b style=\"color:#013220; font-size:20px\">Data Read Successfully !  ","EMP Excel Management Service",JOptionPane.INFORMATION_MESSAGE,icon);
    }//GEN-LAST:event_btnReadActionPerformed

    private void EmpTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpTableMouseClicked
        
        // get the model from the jtable
       DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();

        // get the selected row index
       int selectedRowIndex = EmpTable.getSelectedRow();
       
        // set the selected row data into jtextfields
       txtID.setText(model.getValueAt(selectedRowIndex, 0).toString());
       txtName.setText(model.getValueAt(selectedRowIndex, 1).toString());
       txtAddress.setText(model.getValueAt(selectedRowIndex, 2).toString());
       txtMail.setText(model.getValueAt(selectedRowIndex, 3).toString());
       txtContact.setText(model.getValueAt(selectedRowIndex, 4).toString());
       
    }//GEN-LAST:event_EmpTableMouseClicked

    XSSFWorkbook workbook = new XSSFWorkbook();
    
   
    
     public void addempTable(){
        
        //------------------------Add Details into Jtable-----------------------
        
         DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();
      /*   model.addRow(new Object[]{txtID.getText(), txtName.getText(),
                                  txtAddress.getText(), txtMail.getText(), txtContact.getText()});*/
         Object rowData[] = new Object[5];
           for(int q = 0; q < Emp_users.size(); q++){
               
               rowData[0] = Emp_users.get(q).getEmpID();
               rowData[1] = Emp_users.get(q).getEmpName();
               rowData[2] = Emp_users.get(q).getEmpAddress();
               rowData[3] = Emp_users.get(q).getEmpEmail();
               rowData[4] = Emp_users.get(q).getEmpContact();
               model.addRow(rowData);
           
           }
    
    
    }
     
    public void addRowtoExcel(){
        //------------------Create Blank sheet------------------
        XSSFSheet sheet = workbook.createSheet();

        Map<String, Object[]> data = new TreeMap<String, Object[]>();
      
        for(int x =0; x < Emp_users.size(); x++){
            System.out.println(x);
            System.out.println(Emp_users.get(x).getEmpID());
            System.out.println(Emp_users);
            System.out.println(Emp_users.get(0).toString());
            data.put(Integer.toString(x), new Object[] {Emp_users.get(x).getEmpID(),Emp_users.get(x).getEmpName(),Emp_users.get(x).getEmpAddress(),Emp_users.get(x).getEmpEmail(),Emp_users.get(x).getEmpContact()});
        } 
        //-----------Iterate over data and write to sheet---------
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        
        try
        {
            //----------Write the workbook in file system-------------
            FileOutputStream out = new FileOutputStream(new File("EMP Employers Details.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Details of the EMP Employers Details.xlsx written successfully on disk.");

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
    }
    
    
   public void  ReadRowtoExcel(){
   
        try
        {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\User\\employer_management\\EMP Employers Details.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case NUMERIC:
                            System.out.print((int) cell.getNumericCellValue() + "\r");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\r");
                            break;

                    }
                }
                System.out.println("");
            }
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
   
   
   }
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Emp_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emp_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emp_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emp_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emp_ui().setVisible(true);
           
               
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmpTable;
    private javax.swing.JButton bthSubmit;
    private javax.swing.JButton bthUpdate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnWrite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

  
}
