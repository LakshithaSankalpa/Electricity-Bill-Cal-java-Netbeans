
package electricity.bill.cal.app;

public class ECBapp extends javax.swing.JFrame {

    public ECBapp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CusIDCBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        CusTypCBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        NoUnitsTB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        calBT1 = new javax.swing.JToggleButton();
        ClearBT = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BillSumLB1 = new javax.swing.JLabel();
        BillSumLB2 = new javax.swing.JLabel();
        BillSumLB4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BillSumLB3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P.M.L.Sankalpa                                                         ECB | Bill Calc App       ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Electricity Bill Calculator");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ECB Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        CusIDCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Customer's ID--", "1", "2", "3", "4", "5" }));
        CusIDCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusIDCBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer ID");

        jLabel3.setText("Full Name");

        jLabel5.setText("Coustomer Type");

        jLabel4.setText("Address");

        CusTypCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Customer Type--", "Domestic", "Business", "Public customers" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Address)
                        .addComponent(CusIDCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CusTypCBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CusIDCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CusTypCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Bill Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        NoUnitsTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NoUnitsTBKeyPressed(evt);
            }
        });

        jLabel6.setText("No Of Units");

        calBT1.setBackground(new java.awt.Color(153, 255, 153));
        calBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calBT1.setForeground(new java.awt.Color(0, 102, 0));
        calBT1.setText("Calculate Bill Summary");
        calBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calBT1ActionPerformed(evt);
            }
        });

        ClearBT.setBackground(new java.awt.Color(255, 204, 204));
        ClearBT.setForeground(new java.awt.Color(255, 0, 0));
        ClearBT.setText("Clear");
        ClearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ClearBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(calBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoUnitsTB)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NoUnitsTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ECB Bill Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fuel Adjusments");

        BillSumLB1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillSumLB1.setText("              ");

        BillSumLB2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillSumLB2.setText("               ");

        BillSumLB4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillSumLB4.setForeground(new java.awt.Color(102, 0, 0));
        BillSumLB4.setText("               ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fixed Charge");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Total Unit Charges");

        BillSumLB3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillSumLB3.setText("               ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Total Bill");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillSumLB4)
                    .addComponent(BillSumLB3)
                    .addComponent(BillSumLB2)
                    .addComponent(BillSumLB1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BillSumLB1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(BillSumLB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(BillSumLB3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(BillSumLB4))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("P.M.Lakshitha Sankalpa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(305, 305, 305))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(8, 8, 8))
        );

        jLabel11.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("P.M.L.Sankalpa                                                         ECB | Bill Calc App       ");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calBT1ActionPerformed
        
        double TotUnitCost, FixCharge, TotBill;
        int FAdjust;
        
        if(CusIDCBox.getSelectedItem().toString()=="--Select Customer's ID--"){ 
            JO.showMessageDialog(null,"Please Select Customer's ID!","Alert",JO.WARNING_MESSAGE);
        }
        else if(NoUnitsTB.getText().isEmpty()){ 
            JO.showMessageDialog(null,"Please Enter Units!","Alert",JO.WARNING_MESSAGE);
        }
        else{
        double unit = Double.parseDouble(NoUnitsTB.getText());
        String CusType= CusTypCBox.getSelectedItem().toString();
            switch(CusType){
                case "Domestic" : {
                    TotUnitCost = unit*24.20;
                    String s1=String.format("%.2f", TotUnitCost);
                    BillSumLB1.setText("Rs. "+s1);

                    FAdjust =0;
                    String s2=Integer.toString(FAdjust);
                    BillSumLB2.setText(s2+"%");

                    FixCharge=540;
                    String s3=String.format("%.2f", FixCharge);
                    BillSumLB3.setText("Rs. "+s3);

                    TotBill=((TotUnitCost*FAdjust)/100.00)+TotUnitCost+FixCharge;
                    String s4=String.format("%.2f", TotBill);
                    BillSumLB4.setText("Rs. "+s4);
                }break;
                case "Business" : {
                    TotUnitCost = unit*10.80;
                    String s1=String.format("%.2f", TotUnitCost);
                    BillSumLB1.setText("Rs. "+s1);

                    FAdjust =10;
                    String s2=Integer.toString(FAdjust);
                    BillSumLB2.setText(s2+"%");

                    FixCharge=200;
                    String s3=String.format("%.2f", FixCharge);
                    BillSumLB3.setText("Rs. "+s3);

                    TotBill=((TotUnitCost*FAdjust)/100.00)+TotUnitCost+FixCharge;
                    String s4=String.format("%.2f", TotBill);
                    BillSumLB4.setText("Rs. "+s4);
                }break;
                case "Public customers" : {
                    TotUnitCost = unit*12.40;
                    String s1=String.format("%.2f", TotUnitCost);
                    BillSumLB1.setText("Rs. "+s1);

                    FAdjust =5;
                    String s2=Integer.toString(FAdjust);
                    BillSumLB2.setText(s2+"%");

                    FixCharge=350;
                    String s3=String.format("%.2f", FixCharge);
                    BillSumLB3.setText("Rs. "+s3);

                    TotBill=((TotUnitCost*FAdjust)/100.00)+TotUnitCost+FixCharge;
                    String s4=String.format("%.2f", TotBill);
                    BillSumLB4.setText("Rs. "+s4);
                }break;
                default:{ 
                    JO.showMessageDialog(null,"Please Select Customer Type!","Alert",JO.WARNING_MESSAGE);
                }break;
            };
        }
        
        
    }//GEN-LAST:event_calBT1ActionPerformed

    private void NoUnitsTBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoUnitsTBKeyPressed
        
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            NoUnitsTB.setEditable(false); 
            JO.showMessageDialog(null,"Please Enter Number Only..!","Alert",JO.WARNING_MESSAGE);
            NoUnitsTB.setEditable(true);
        }
    }//GEN-LAST:event_NoUnitsTBKeyPressed

    private void ClearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBTActionPerformed
        CusIDCBox.setSelectedItem("--Select Customer's ID--");
        CusTypCBox.setSelectedItem("--Select Customer Type--");
        NoUnitsTB.setText("");
        FName.setText("");
        Address.setText("");
        BillSumLB1.setText("");
        BillSumLB2.setText("");
        BillSumLB3.setText("");
        BillSumLB4.setText("");
        JO.showMessageDialog(null,"clean success.."); 
    }//GEN-LAST:event_ClearBTActionPerformed

    private void CusIDCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusIDCBoxActionPerformed
        String CID = CusIDCBox.getSelectedItem().toString();
        switch (CID){
            case "1" : {
                FName.setText("Pasindu Navanjana");
                Address.setText("No.06, Thalangalla, Galle");
            }break;
            case "2" : {
                FName.setText("A.B.Amarapala");
                Address.setText("Hena Watta, Kaluwalla, Galle");
            }break;
            case "3" : {
                FName.setText("B.G.Jagath");
                Address.setText("No.123/B, Nupe, Matara");
            }break;
            case "4" : {
                FName.setText("Samith Samarasekara");
                Address.setText("1st floor, GCC center, Colombo02");
            }break;
            case "5" : {
                FName.setText("Anush Senarath");
                Address.setText("No.22/1, Ella Rd, Badulla");
            }break;
            default:{ 
                FName.setText("");
                Address.setText("");
                JO.showMessageDialog(null,"Please Select Customer Type!","Alert",JO.WARNING_MESSAGE); 
            }break;
        }
        
    }//GEN-LAST:event_CusIDCBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ECBapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECBapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECBapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECBapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ECBapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JLabel BillSumLB1;
    private javax.swing.JLabel BillSumLB2;
    private javax.swing.JLabel BillSumLB3;
    private javax.swing.JLabel BillSumLB4;
    private javax.swing.JToggleButton ClearBT;
    private javax.swing.JComboBox<String> CusIDCBox;
    private javax.swing.JComboBox<String> CusTypCBox;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField NoUnitsTB;
    private javax.swing.JToggleButton calBT1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    // End of variables declaration//GEN-END:variables
    private javax.swing.JOptionPane JO;
    
}
