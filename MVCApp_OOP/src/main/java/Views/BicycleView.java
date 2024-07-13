package Views;

import javax.swing.JOptionPane;
import Controllers.BicycleController;
import Models.Bicycle;
import DatabaseLayer.DatabaseConnection;
public class BicycleView extends javax.swing.JFrame {

    Bicycle objBike;
    Bicycle[] bikeArray;
    BicycleController objController;
    int index;
    
    public BicycleView() {
        initComponents();
        objController = new BicycleController();
        bikeArray = new Bicycle[100];
        index = 0;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLeft = new javax.swing.JPanel();
        lblSpeed = new javax.swing.JLabel();
        lblGear = new javax.swing.JLabel();
        txtGear = new javax.swing.JTextField();
        txtSpeed = new javax.swing.JTextField();
        lblCurrent = new javax.swing.JLabel();
        panelRight = new javax.swing.JPanel();
        btnAddBike = new javax.swing.JButton();
        btnApplyBrakes = new javax.swing.JButton();
        btnAccelerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bicycle Manager");

        panelLeft.setBackground(new java.awt.Color(0, 204, 255));
        panelLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSpeed.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblSpeed.setText("Speed");

        lblGear.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblGear.setText("Gear");

        lblCurrent.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblCurrent.setForeground(new java.awt.Color(255, 102, 102));
        lblCurrent.setText("Current Speed");

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrent)
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addComponent(lblGear)
                        .addGap(74, 74, 74)
                        .addComponent(txtGear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSpeed))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeftLayout.createSequentialGroup()
                    .addContainerGap(169, Short.MAX_VALUE)
                    .addComponent(txtSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(149, 149, 149)))
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addComponent(lblSpeed)
                        .addGap(106, 106, 106)
                        .addComponent(lblGear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCurrent)
                .addGap(66, 66, 66))
            .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLeftLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(txtSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
        );

        panelRight.setBackground(new java.awt.Color(0, 0, 204));
        panelRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAddBike.setBackground(new java.awt.Color(255, 102, 102));
        btnAddBike.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAddBike.setText("Add Bike");
        btnAddBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBikeActionPerformed(evt);
            }
        });

        btnApplyBrakes.setBackground(new java.awt.Color(102, 255, 102));
        btnApplyBrakes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnApplyBrakes.setText("Apply Brakes");
        btnApplyBrakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyBrakesActionPerformed(evt);
            }
        });

        btnAccelerate.setBackground(new java.awt.Color(204, 255, 102));
        btnAccelerate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAccelerate.setText("Accelerate");
        btnAccelerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccelerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRightLayout = new javax.swing.GroupLayout(panelRight);
        panelRight.setLayout(panelRightLayout);
        panelRightLayout.setHorizontalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnApplyBrakes, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addComponent(btnAddBike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnAccelerate, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
        );
        panelRightLayout.setVerticalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnApplyBrakes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(btnAddBike, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRightLayout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(btnAccelerate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBikeActionPerformed
        try {
            int Gear = Integer.parseInt(txtGear.getText());
            float Speed = Float.parseFloat(txtSpeed.getText());
            objBike = objController.addBike(Gear, Speed);
            boolean result=objController.insertBikeToDB(objBike);
            bikeArray[index] = objBike;
            lblCurrent.setText(objBike.toString());
            index++;
            if(result)
            {
                JOptionPane.showMessageDialog(rootPane, (index) + " Bikes have been Added to DB Success", "Info", 1);
            }else{
               JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0); 
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Input is empty", "Error", 0);
        }
    }//GEN-LAST:event_btnAddBikeActionPerformed

    private void btnApplyBrakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyBrakesActionPerformed
        try {
            float Speed = Float.parseFloat(txtSpeed.getText());
            objBike.applyBrakes(Speed);
            lblCurrent.setText(objBike.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Input is Invalid", "Error", 0);
        }
    }//GEN-LAST:event_btnApplyBrakesActionPerformed

    private void btnAccelerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccelerateActionPerformed
        try {
            float Speed = Float.parseFloat(txtSpeed.getText());
            objBike.speedUp(Speed);
            lblCurrent.setText(objBike.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Input is Invalid", "Error", 0);
        }
    }//GEN-LAST:event_btnAccelerateActionPerformed

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
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BicycleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BicycleView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccelerate;
    private javax.swing.JButton btnAddBike;
    private javax.swing.JButton btnApplyBrakes;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblGear;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelRight;
    private javax.swing.JTextField txtGear;
    private javax.swing.JTextField txtSpeed;
    // End of variables declaration//GEN-END:variables
}
