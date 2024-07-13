package Views;
import Models.SavingsAccount;
import Controllers.AccountController;
import javax.swing.JOptionPane;
public class AccountView extends javax.swing.JFrame {    
    SavingsAccount objSavings;
    SavingsAccount[] savingsArray;
    AccountController objController;
    int index;
    public AccountView() {
        initComponents();
        objController=new AccountController();
        savingsArray=new SavingsAccount[100];
        index=0;
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        lblAccountNumber = new javax.swing.JLabel();
        lblTotalBalance = new javax.swing.JLabel();
        lblOwner = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtInterestRate = new javax.swing.JTextField();
        chkIsJoint = new javax.swing.JCheckBox();
        btnCalculateInterest = new javax.swing.JButton();
        btnAddAccount = new javax.swing.JButton();
        btnViewInfo = new javax.swing.JButton();
        lblInterestRate = new javax.swing.JLabel();
        lblSavingsCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Manager");

        backPanel.setBackground(new java.awt.Color(255, 255, 51));

        lblAccountNumber.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAccountNumber.setText("Account Number");

        lblTotalBalance.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTotalBalance.setText("Calculated Account Balance is");

        lblOwner.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblOwner.setText("Owner Name");

        lblBalance.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblBalance.setText("Balance");

        txtOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerNameActionPerformed(evt);
            }
        });

        chkIsJoint.setText("Is Joint Account");

        btnCalculateInterest.setBackground(new java.awt.Color(153, 255, 255));
        btnCalculateInterest.setText("Calculate Interest");
        btnCalculateInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateInterestActionPerformed(evt);
            }
        });

        btnAddAccount.setBackground(new java.awt.Color(255, 102, 102));
        btnAddAccount.setText("Add Account");
        btnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountActionPerformed(evt);
            }
        });

        btnViewInfo.setBackground(new java.awt.Color(204, 255, 153));
        btnViewInfo.setText("View Info");
        btnViewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInfoActionPerformed(evt);
            }
        });

        lblInterestRate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblInterestRate.setText("Interest Rate");

        lblSavingsCount.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSavingsCount.setText("Total Savings Account");

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSavingsCount)
                    .addComponent(lblTotalBalance)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOwner)
                            .addComponent(lblAccountNumber)
                            .addComponent(lblBalance)
                            .addComponent(lblInterestRate))
                        .addGap(66, 66, 66)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backPanelLayout.createSequentialGroup()
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalculateInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chkIsJoint))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwner)
                            .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backPanelLayout.createSequentialGroup()
                                .addComponent(btnViewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnCalculateInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backPanelLayout.createSequentialGroup()
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBalance)
                                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInterestRate))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(chkIsJoint)
                .addGap(29, 29, 29)
                .addComponent(lblTotalBalance)
                .addGap(30, 30, 30)
                .addComponent(lblSavingsCount)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountActionPerformed
        String name=txtOwnerName.getText();
        int no=Integer.parseInt(txtAccountNumber.getText());
        float bal=Float.parseFloat(txtBalance.getText());
        float ir=Float.parseFloat(txtInterestRate.getText());
        boolean flag=chkIsJoint.isSelected();
        objSavings=objController.addSavingsAccount(ir, flag, name, no, bal);
        savingsArray[index]=objSavings;
        index++;
        JOptionPane.showMessageDialog(rootPane, index +" Account has been Sucessfully Added", "Info", 1);
    }//GEN-LAST:event_btnAddAccountActionPerformed
    private void btnViewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInfoActionPerformed
        String info=objSavings.printAccount();
        int totsaving=SavingsAccount.getTotalSavingsAccount();
        lblSavingsCount.setText("Total Savings Accounts "+totsaving);
        JOptionPane.showMessageDialog(rootPane, info, "Info", 1);
    }//GEN-LAST:event_btnViewInfoActionPerformed

    private void btnCalculateInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateInterestActionPerformed
       float totalbal=objSavings.calculateTotalBalance();
       lblTotalBalance.setText("The Total Balance is "+totalbal);
       JOptionPane.showMessageDialog(rootPane,"Total is "+ totalbal, "Info", 1);
    }//GEN-LAST:event_btnCalculateInterestActionPerformed

    private void txtOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerNameActionPerformed

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
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnAddAccount;
    private javax.swing.JButton btnCalculateInterest;
    private javax.swing.JButton btnViewInfo;
    private javax.swing.JCheckBox chkIsJoint;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblInterestRate;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblSavingsCount;
    private javax.swing.JLabel lblTotalBalance;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtInterestRate;
    private javax.swing.JTextField txtOwnerName;
    // End of variables declaration//GEN-END:variables
}
