/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class lcm extends javax.swing.JFrame {

    /**
     * Creates new form lcm
     */
    
    Operation ref;
    public lcm() {
        initComponents();
    }
    
    public lcm(Operation x)
    {
        ref=x;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnum1lcm = new javax.swing.JTextField();
        txtnum2lcm = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        radiobtnlcm = new javax.swing.JRadioButton();
        radiobtngcd = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        lbllcmans = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnbacklcm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jPanel3.setBackground(new java.awt.Color(64, 64, 64));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Enter Your Numbers  :");

        txtnum1lcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum1lcmActionPerformed(evt);
            }
        });
        txtnum1lcm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum1lcmKeyTyped(evt);
            }
        });

        txtnum2lcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum2lcmActionPerformed(evt);
            }
        });
        txtnum2lcm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum2lcmKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(txtnum1lcm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(txtnum2lcm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnum2lcm)
                    .addComponent(txtnum1lcm, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(128, 128, 128));

        radiobtnlcm.setBackground(new java.awt.Color(128, 128, 128));
        buttonGroup1.add(radiobtnlcm);
        radiobtnlcm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radiobtnlcm.setText("LCM");
        radiobtnlcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnlcmActionPerformed(evt);
            }
        });

        radiobtngcd.setBackground(new java.awt.Color(128, 128, 128));
        buttonGroup1.add(radiobtngcd);
        radiobtngcd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radiobtngcd.setText("GCD");
        radiobtngcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtngcdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radiobtnlcm, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(radiobtngcd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtnlcm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobtngcd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));

        lbllcmans.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbllcmans.setForeground(new java.awt.Color(255, 0, 0));
        lbllcmans.setText("LCM=ANSWER");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllcmans, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbllcmans, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(64, 64, 64));

        btnbacklcm.setBackground(new java.awt.Color(255, 0, 0));
        btnbacklcm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnbacklcm.setText("BACK");
        btnbacklcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacklcmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btnbacklcm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnbacklcm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbacklcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacklcmActionPerformed
        // TODO add your handling code here:
        
       // Operation op=new Operation();
        ref.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnbacklcmActionPerformed

    private void txtnum2lcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum2lcmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum2lcmActionPerformed

    private void radiobtngcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtngcdActionPerformed
        // TODO add your handling code here:
        
         String str,str1,str2;
        int ans=0,n1=0,n2=0;
        str1=txtnum1lcm.getText();
        str2=txtnum2lcm.getText();
        if(str1.isEmpty())
        {
            lbllcmans.setText("Enter numbers");
            txtnum1lcm.requestFocusInWindow();
          //  txtfirstno.setText(" ");
            return;
        }
        if(str2.isEmpty())
        {
            lbllcmans.setText("Enter numbers");
            txtnum2lcm.requestFocusInWindow();
            return;
        }
        
        n1=Integer.parseInt(str1);
        n2=Integer.parseInt(str2);
        int temp;
        if(n1<n2)
        {
            temp=n1;
            n1=n2;
            n2=temp;
        }
        
        int i,flag=0;
        for(i=n2;i>=1;i--)
        {
            flag=0;
            if((n1%i==0) && (n2%i)==0)
            {
                flag=1;
                break;
            }
        }
       
        lbllcmans.setText("GCD = " + String.valueOf(i));
        
        
    }//GEN-LAST:event_radiobtngcdActionPerformed

    private void radiobtnlcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnlcmActionPerformed
        // TODO add your handling code here:
        String str,str1,str2;
        int ans=0,n1=0,n2=0;
        str1=txtnum1lcm.getText();
        str2=txtnum2lcm.getText();
        if(str1.isEmpty())
        {
            lbllcmans.setText("Enter numbers");
            txtnum1lcm.requestFocusInWindow();
          //  txtfirstno.setText(" ");
            return;
        }
        if(str2.isEmpty())
        {
            lbllcmans.setText("Enter numbers");
            txtnum2lcm.requestFocusInWindow();
            return;
        }
        
        n1=Integer.parseInt(str1);
        n2=Integer.parseInt(str2);
        int temp;
        if(n1<n2)
        {
            temp=n1;
            n1=n2;
            n2=temp;
        }
        int i;
        for(i=n1;i<=n1*n2;i++)
        {
            if((i%n1==0) && (i%n2==0))
            {
                break;
            }
        }
        lbllcmans.setText("LCM = " + String.valueOf(i));
        
    }//GEN-LAST:event_radiobtnlcmActionPerformed

    private void txtnum1lcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum1lcmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum1lcmActionPerformed

    private void txtnum1lcmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum1lcmKeyTyped
        // TODO add your handling code here:
        
          char ch;
        ch=evt.getKeyChar();
        if(Character.isDigit(ch)==false)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtnum1lcmKeyTyped

    private void txtnum2lcmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum2lcmKeyTyped
        // TODO add your handling code here:
          char ch;
        ch=evt.getKeyChar();
        if(Character.isDigit(ch)==false)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtnum2lcmKeyTyped

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
            java.util.logging.Logger.getLogger(lcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lcm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbacklcm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbllcmans;
    private javax.swing.JRadioButton radiobtngcd;
    private javax.swing.JRadioButton radiobtnlcm;
    private javax.swing.JTextField txtnum1lcm;
    private javax.swing.JTextField txtnum2lcm;
    // End of variables declaration//GEN-END:variables
}
