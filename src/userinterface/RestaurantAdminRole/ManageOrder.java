/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class ManageOrder extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrder
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Restaurant resta;
    public ManageOrder(JPanel userProcessContainer, EcoSystem system,
                    Restaurant resta) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.resta = resta;  
        this.populateCustomerOrdersTable();
        ArrayList<String> deliveryArr = new ArrayList();
        for (DeliveryMan dm : this.system.getDeliveryManDirectory().returnDeliveryAgentDetails()){
            deliveryArr.add(dm.getName());
        }
        comboDelivery.setModel(new DefaultComboBoxModel<String>(deliveryArr.toArray(new String[0])));
    }
    
    private void populateCustomerOrdersTable(){
        System.out.println("Populating customers orders");

        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        for(Order o : this.system.getOrderDirectory().getOrderDirectory()){
            if(o.getRestaurant().getRestaurantName().equals(
                this.resta.getRestaurantName())){
                System.out.println(o);
                Object[] row = new Object[5];
                row[0] = o;
                row[1] = o.getItem().getItemName();
                row[2] = o.getQuantity();
                row[3] = o.getRequestDate();
                row[4] = o.getOrderStatus();
                model.addRow(row);
            }
        }
        
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
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboOrderId = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboDelivery = new javax.swing.JComboBox();
        btnAssignDeliveryAgent = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefreshOrders = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders");

        btnAccept.setText("Accept Order");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setText("Reject Order");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderId", "ItemName", "Quantity", "Order Placed On", "Order Status"
            }
        ));
        jScrollPane2.setViewportView(tblOrders);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Assign Delivery");

        jLabel4.setText("Order Id :");

        comboOrderId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Delivery Agent Name :");

        comboDelivery.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDeliveryActionPerformed(evt);
            }
        });

        btnAssignDeliveryAgent.setText("Assign");
        btnAssignDeliveryAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryAgentActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefreshOrders.setText("Refresh");
        btnRefreshOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAccept)
                            .addGap(123, 123, 123)
                            .addComponent(btnReject)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssignDeliveryAgent)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboOrderId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btnRefreshOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject)
                    .addComponent(btnAccept))
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshOrders))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnAssignDeliveryAgent)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDeliveryActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrders.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Accepted");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }
        
        this.populateCustomerOrdersTable();
        

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRefreshOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshOrdersActionPerformed
        // TODO add your handling code here:
        ArrayList<String> orderArr = new ArrayList<String>();
        for (Order o : this.system.getOrderDirectory().getOrderDirectory()){
            if(o.getOrderStatus().equals("Order Accepted")){
                orderArr.add(String.valueOf(o.getOrderId()));
            }
            
        }
        comboOrderId.setModel(new DefaultComboBoxModel<String>(orderArr.toArray(new String[0])));
    }//GEN-LAST:event_btnRefreshOrdersActionPerformed

    private void btnAssignDeliveryAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryAgentActionPerformed
        // TODO add your handling code here:
        try{
            int orderId = Integer.parseInt(comboOrderId.getSelectedItem().toString());
            Order order = this.system.getOrderDirectory().getOrderId(orderId);
            if(order.getOrderStatus().equals("Order Accepted")) {
                order.setOrderStatus("Delivery Assigned");
                order.setDeliveryMan(comboDelivery.getSelectedItem().toString());
                order.setSender(this.system.getUserAccountDirectory().getUserAccount(comboDelivery.getSelectedItem().toString()));
                JOptionPane.showMessageDialog(null, "Assigned the Delivery Agent Successfully");
            }

            else {
                JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
                return;
            }

            this.populateCustomerOrdersTable();
        }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "No Order to assign!!!");
                return;
            }
        
    }//GEN-LAST:event_btnAssignDeliveryAgentActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrders.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Rejected");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }
        
        this.populateCustomerOrdersTable();
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssignDeliveryAgent;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefreshOrders;
    private javax.swing.JButton btnReject;
    private javax.swing.JComboBox comboDelivery;
    private javax.swing.JComboBox comboOrderId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
