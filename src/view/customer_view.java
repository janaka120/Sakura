/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.customer_controler;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.customer_model;
import validation.AutoGenerate;

/**
 *
 * @author janaka
 */
public class customer_view extends javax.swing.JFrame {

    /**
     * Creates new form customer_view
     */
    DefaultTableModel dtm_serch;
    DefaultTableModel dtm_update;
    
    public customer_view() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        String id= AutoGenerate.getNextID("customer", "cust_id", "CUS");
        tbaddcust_txtid.setText(id);
        dtm_serch=(DefaultTableModel)tbsearch_table.getModel();
        dtm_update=(DefaultTableModel)tbupdate_searchresulttable.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbaddcust_txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbaddcust_txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbaddcust_txtaddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tbaddcust_txtcontect = new javax.swing.JTextField();
        tbcust_butclear = new javax.swing.JButton();
        tbcust_butadd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tbsearch_txtname = new javax.swing.JTextField();
        tbsearch_btnsearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsearch_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbupdate_txtname = new javax.swing.JTextField();
        tbupdate_btnsearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbupdate_searchresulttable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tbupdate_txtdisplayname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbupdate_txtdisplayaddress = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        tbupdate_txtdisplaycontect = new javax.swing.JTextField();
        tbupdate_btnupdate = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setText("Sakura Destributors");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ADD Customer Forum");

        jLabel3.setText("Customer ID");

        tbaddcust_txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbaddcust_txtidActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Address");

        tbaddcust_txtaddress.setColumns(20);
        tbaddcust_txtaddress.setRows(5);
        jScrollPane1.setViewportView(tbaddcust_txtaddress);

        jLabel6.setText("Contect No.");

        tbcust_butclear.setText("Clear");
        tbcust_butclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcust_butclearActionPerformed(evt);
            }
        });
        tbcust_butclear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbcust_butclearKeyPressed(evt);
            }
        });

        tbcust_butadd.setText("ADD");
        tbcust_butadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcust_butaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tbcust_butclear)
                            .addGap(48, 48, 48)
                            .addComponent(tbcust_butadd))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbaddcust_txtname)
                                .addComponent(tbaddcust_txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addComponent(tbaddcust_txtcontect, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbaddcust_txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbaddcust_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbaddcust_txtcontect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbcust_butclear)
                    .addComponent(tbcust_butadd))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        tbaddcust_txtid.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Add Customer", jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Search Customers");

        jLabel8.setText("customer Name");

        tbsearch_txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbsearch_txtnameActionPerformed(evt);
            }
        });

        tbsearch_btnsearch.setText("Search");
        tbsearch_btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbsearch_btnsearchActionPerformed(evt);
            }
        });

        jLabel9.setText("Search Result");

        tbsearch_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Customer Address", "Customer Contect No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbsearch_table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbsearch_btnsearch)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(39, 39, 39)
                                        .addComponent(tbsearch_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(358, 358, 358)))))
                        .addGap(0, 279, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tbsearch_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tbsearch_btnsearch)
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search", jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel3.setRequestFocusEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Update Customer Details");

        jLabel11.setText("Customer Name");

        tbupdate_btnsearch.setText("Search");
        tbupdate_btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbupdate_btnsearchActionPerformed(evt);
            }
        });

        tbupdate_searchresulttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Customer Address", "Customer Contect No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbupdate_searchresulttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbupdate_searchresulttableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbupdate_searchresulttable);

        jLabel12.setText("Search Results");

        jLabel13.setText("Selected Customer Details ");

        jLabel14.setText("Cstomer Name");

        jLabel15.setText("Customer Address");

        tbupdate_txtdisplayaddress.setColumns(20);
        tbupdate_txtdisplayaddress.setRows(5);
        jScrollPane4.setViewportView(tbupdate_txtdisplayaddress);

        jLabel16.setText("Customer Contect No.");

        tbupdate_btnupdate.setText("Update");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbupdate_btnsearch)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(34, 34, 34)
                                    .addComponent(tbupdate_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbupdate_btnupdate)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel14))
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tbupdate_txtdisplayname, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tbupdate_txtdisplaycontect, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(171, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tbupdate_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbupdate_btnsearch)
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tbupdate_txtdisplayname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbupdate_txtdisplaycontect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(tbupdate_btnupdate)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Update", jPanel3);
        jTabbedPane1.addTab("tab4", jScrollPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Add Customer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // update table select
    private void tbupdate_searchresulttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbupdate_searchresulttableMouseClicked
        // set values to text filleds form update table
        int rowindex= tbupdate_searchresulttable.getSelectedRow();
        tbupdate_txtdisplayname.setText(dtm_update.getValueAt(rowindex, 0) + "");
        tbupdate_txtdisplayaddress.setText(dtm_update.getValueAt(rowindex, 1)+"");
        tbupdate_txtdisplaycontect.setText(dtm_update.getValueAt(rowindex, 2)+"");
    }//GEN-LAST:event_tbupdate_searchresulttableMouseClicked

    private void tbupdate_btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbupdate_btnsearchActionPerformed
        // TODO add your handling code here:

        fillTableID(dtm_update, tbupdate_txtname.getText());
    }//GEN-LAST:event_tbupdate_btnsearchActionPerformed

    //serch button in search tab
    private void tbsearch_btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbsearch_btnsearchActionPerformed
        // TODO add your handling code here:
        //System.out.println(tbsearch_txtname.getText());
        fillTableID(dtm_serch,tbsearch_txtname.getText());
        /*
        try{
            customer_model search_customer= new customer_model();
            search_customer.setCustName(tbsearch_txtname.getText());
            System.out.println("txtname"+search_customer.getCustName());
            ArrayList<customer_model> arrayList=customer_controler.get_customer_details(search_customer.getCustName());
            //System.out.println("ok....");
            customer_model cm=arrayList.get(0);
            System.out.println("id,name,add,contect"+cm.getCustID()+"  "+cm.getCustName()+"    "+cm.getCustAddress()+"   "+cm.getCustContect());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Customer Search Fail...");
        }
        */
    }//GEN-LAST:event_tbsearch_btnsearchActionPerformed

    private void tbsearch_txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbsearch_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbsearch_txtnameActionPerformed

// add customer details.........................................................................
    private void tbcust_butaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcust_butaddActionPerformed
        // TODO add your handling code here:
        customer_model add_customer= new customer_model();
        add_customer.setCustID(tbaddcust_txtid.getText());
        //System.out.println("custID"+customer_view.getCustID());
        add_customer.setCustName(tbaddcust_txtname.getText());
        add_customer.setCustAddress(tbaddcust_txtaddress.getText());
        add_customer.setCustContect(tbaddcust_txtcontect.getText());
        customer_controler.add_customer(add_customer);
    }//GEN-LAST:event_tbcust_butaddActionPerformed

    private void tbcust_butclearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcust_butclearKeyPressed

    }//GEN-LAST:event_tbcust_butclearKeyPressed

    private void tbcust_butclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcust_butclearActionPerformed
        // TODO add your handling code here:
        //tbaddcust_txtid.setText("");
        tbaddcust_txtname.setText("");
        tbaddcust_txtaddress.setText("");
        tbaddcust_txtcontect.setText("");
    }//GEN-LAST:event_tbcust_butclearActionPerformed

    private void tbaddcust_txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbaddcust_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbaddcust_txtidActionPerformed
    
   
    //fil the table using database data
    private void fillTableID(DefaultTableModel dtm, String custname) {
        try {
            
            int rawCount = dtm.getRowCount();
            for (int i = 0; i < rawCount; i++) {
                dtm.removeRow(0);
            }
            ArrayList<customer_model> ar = customer_controler.get_customer_details(custname);
            for (int i = 0; i < ar.size(); i++) {
                customer_model cm = ar.get(i);
                String[] rowData = {cm.getCustName(), cm.getCustAddress(), cm.getCustContect()};
                dtm.addRow(rowData); 
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customer_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customer_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(customer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea tbaddcust_txtaddress;
    private javax.swing.JTextField tbaddcust_txtcontect;
    private javax.swing.JTextField tbaddcust_txtid;
    private javax.swing.JTextField tbaddcust_txtname;
    private javax.swing.JButton tbcust_butadd;
    private javax.swing.JButton tbcust_butclear;
    private javax.swing.JButton tbsearch_btnsearch;
    private javax.swing.JTable tbsearch_table;
    private javax.swing.JTextField tbsearch_txtname;
    private javax.swing.JButton tbupdate_btnsearch;
    private javax.swing.JButton tbupdate_btnupdate;
    private javax.swing.JTable tbupdate_searchresulttable;
    private javax.swing.JTextArea tbupdate_txtdisplayaddress;
    private javax.swing.JTextField tbupdate_txtdisplaycontect;
    private javax.swing.JTextField tbupdate_txtdisplayname;
    private javax.swing.JTextField tbupdate_txtname;
    // End of variables declaration//GEN-END:variables
}
