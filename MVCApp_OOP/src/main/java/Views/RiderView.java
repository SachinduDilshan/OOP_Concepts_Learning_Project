package Views;

import Models.Rider;
import Models.Rider.Record;
import Controllers.RiderController;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Models.InvalidBMIException;

public class RiderView extends javax.swing.JFrame {

    Rider objRider;
    Rider.Record objRec;
    Rider[] riderArray;
    Rider.Record[] recArray;
    ArrayList<Rider> riderList;
    ArrayList<Rider.Record> recList;
    RiderController objController;
    int index;

    public RiderView() {
        initComponents();
        objController = new RiderController();
        riderArray = new Rider[100];
        recArray = new Record[100];
        index = 0;
        riderList = new ArrayList<>();
        recList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        lblHeight = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        lblNational = new javax.swing.JLabel();
        lblOlympic = new javax.swing.JLabel();
        lblSpeed = new javax.swing.JLabel();
        txtOlympic = new javax.swing.JTextField();
        txtSpeed = new javax.swing.JTextField();
        txtNational = new javax.swing.JTextField();
        btnCalBMI = new javax.swing.JButton();
        btnAddRider = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rider Management");

        backPanel.setBackground(new java.awt.Color(102, 204, 255));

        lblHeight.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblHeight.setText("Height");

        lblSearch.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblSearch.setText("Search Rider By Name");

        lblAge.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblAge.setText("Age");

        lblCountry.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblCountry.setText("Country");

        lblWeight.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblWeight.setText("Weight");

        lblNational.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblNational.setText("National Records");

        lblOlympic.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblOlympic.setText("Oylmpic Medals");

        lblSpeed.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblSpeed.setText("Top Speed");

        btnCalBMI.setBackground(new java.awt.Color(255, 153, 153));
        btnCalBMI.setText("Calculate BMI");
        btnCalBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalBMIActionPerformed(evt);
            }
        });

        btnAddRider.setBackground(new java.awt.Color(255, 255, 102));
        btnAddRider.setText("Add Rider");
        btnAddRider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRiderActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        lblName.setText("Rider Name");

        btnSearch.setBackground(new java.awt.Color(255, 255, 102));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSearch)
                                .addComponent(lblName)
                                .addComponent(lblHeight)
                                .addComponent(lblCountry)
                                .addComponent(lblAge))
                            .addGroup(backPanelLayout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addGap(102, 102, 102)))
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backPanelLayout.createSequentialGroup()
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backPanelLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(backPanelLayout.createSequentialGroup()
                                                .addComponent(lblNational)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNational, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                                                .addComponent(lblSpeed)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                                                .addComponent(lblOlympic)
                                                .addGap(31, 31, 31)
                                                .addComponent(txtOlympic, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCalBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))))))
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                    .addContainerGap(413, Short.MAX_VALUE)
                    .addComponent(btnAddRider, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(276, 276, 276)))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOlympic)
                            .addComponent(txtOlympic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(27, 27, 27)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpeed)
                            .addComponent(txtSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountry)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNational)
                            .addComponent(txtNational, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnCalBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backPanelLayout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(btnAddRider, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRiderActionPerformed
        try {
            String name = txtName.getText();
            String country = txtCountry.getText();
            int age = Integer.parseInt(txtAge.getText());
            double weight = Double.parseDouble(txtWeight.getText());
            double height = Double.parseDouble(txtHeight.getText());
            int olymp = Integer.parseInt(txtOlympic.getText());
            double speed = Double.parseDouble(txtSpeed.getText());
            int nat = Integer.parseInt(txtNational.getText());
            objRider = objController.addRider(name, country, age, weight, height);
            objRec = objController.addRecord(olymp, speed, nat);
            riderArray[index] = objRider;
            recArray[index] = objRec;
            riderList.add(riderArray[index]);
            recList.add(recArray[index]);
            index++;
            JOptionPane.showMessageDialog(rootPane, " Successfully Added " + index + " Rider and record", "Info", 1);
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }
    }//GEN-LAST:event_btnAddRiderActionPerformed

    private void btnCalBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalBMIActionPerformed
        try {
            double weight = Double.parseDouble(txtWeight.getText());
            double height = Double.parseDouble(txtHeight.getText());
            if (weight <= 0 || height <= 0) {
                throw new InvalidBMIException();
            }
            double bmi = objRider.calBMI(weight, height);
            JOptionPane.showMessageDialog(rootPane, "Your BMI is " + bmi, "Info", 1);
        } catch (InvalidBMIException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERROR", 0);
        }
    }//GEN-LAST:event_btnCalBMIActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchText = txtSearch.getText();
        boolean isFound = false;
        for (Rider r : riderList) {
            if (r.getName().contains(searchText)) {
                isFound = true;
                JOptionPane.showMessageDialog(rootPane, r.getName() + " " + r.getCountry() + " " + r.getAge(), "Info", 1);
                break;
            }
        }
        if (isFound == false) {
            JOptionPane.showMessageDialog(rootPane, "Rider Not Found", "404 Not Found", 1);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnAddRider;
    private javax.swing.JButton btnCalBMI;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNational;
    private javax.swing.JLabel lblOlympic;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNational;
    private javax.swing.JTextField txtOlympic;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpeed;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
