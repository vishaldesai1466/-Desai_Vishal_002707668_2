/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui;


import model.PersonDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import ui.patient.CommunityLogin;
import ui.patient.VitalSignReportJPanel;
import ui.patient.Login;
import ui.person.LoginSystem;


public class MainJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainJFrame
     */
    private PersonDirectory personDirectory;
    public MainJFrame() {
        initComponents();
        
        personDirectory= new PersonDirectory();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        patientManagerJButton = new javax.swing.JButton();
        managePersonsJButton = new javax.swing.JButton();
        vitalSignReportJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jSplitPane1.setBackground(new java.awt.Color(153, 153, 255));
        jSplitPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jSplitPane1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1000, 600));

        leftJPanel.setBackground(new java.awt.Color(204, 204, 255));
        leftJPanel.setMinimumSize(new java.awt.Dimension(200, 600));
        leftJPanel.setPreferredSize(new java.awt.Dimension(200, 600));

        patientManagerJButton.setBackground(new java.awt.Color(102, 102, 255));
        patientManagerJButton.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        patientManagerJButton.setText("Hospital");
        patientManagerJButton.setBorderPainted(false);
        patientManagerJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientManagerJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientManagerJButtonMouseExited(evt);
            }
        });
        patientManagerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientManagerJButtonActionPerformed(evt);
            }
        });

        managePersonsJButton.setBackground(new java.awt.Color(102, 102, 255));
        managePersonsJButton.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        managePersonsJButton.setText("System Login");
        managePersonsJButton.setBorderPainted(false);
        managePersonsJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managePersonsJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managePersonsJButtonMouseExited(evt);
            }
        });
        managePersonsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonsJButtonActionPerformed(evt);
            }
        });

        vitalSignReportJButton.setBackground(new java.awt.Color(102, 102, 255));
        vitalSignReportJButton.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        vitalSignReportJButton.setText("Community");
        vitalSignReportJButton.setBorderPainted(false);
        vitalSignReportJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vitalSignReportJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vitalSignReportJButtonMouseExited(evt);
            }
        });
        vitalSignReportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalSignReportJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Choose an option");

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(managePersonsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patientManagerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vitalSignReportJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(managePersonsJButton)
                .addGap(30, 30, 30)
                .addComponent(patientManagerJButton)
                .addGap(26, 26, 26)
                .addComponent(vitalSignReportJButton)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        userProcessContainer.setBackground(new java.awt.Color(153, 153, 255));
        userProcessContainer.setPreferredSize(new java.awt.Dimension(800, 600));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientManagerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientManagerJButtonActionPerformed
        // TODO add your handling code here:
//        PatientManagerWorkAreaJPanel pmwaJPanel=
//                new PatientManagerWorkAreaJPanel(userProcessContainer, personDirectory);
//        userProcessContainer.add("pmwaJPanel", pmwaJPanel);
//        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

           Login Login = new Login(userProcessContainer, personDirectory);
           userProcessContainer.add("Login", Login);
           CardLayout layout =(CardLayout) userProcessContainer.getLayout();
           layout.next(userProcessContainer);
    }//GEN-LAST:event_patientManagerJButtonActionPerformed

    private void managePersonsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonsJButtonActionPerformed
        // TODO add your handling code here:
//        ManagePersonsJPanel mpJPanel= 
//                new ManagePersonsJPanel(userProcessContainer, personDirectory);
//        userProcessContainer.add("mpJPanel", mpJPanel);
//        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
            LoginSystem LoginSystem = new LoginSystem(userProcessContainer, personDirectory);
            userProcessContainer.add("LoginSystem", LoginSystem);
            CardLayout layout =(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
    }//GEN-LAST:event_managePersonsJButtonActionPerformed

    private void vitalSignReportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignReportJButtonActionPerformed
        // TODO add your handling code here:
//        VitalSignReportJPanel report = new VitalSignReportJPanel(userProcessContainer, personDirectory);
//        userProcessContainer.add("report",report);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        CommunityLogin CommunityLogin= new CommunityLogin(userProcessContainer, personDirectory);
        userProcessContainer.add("CommunityLogin",CommunityLogin);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_vitalSignReportJButtonActionPerformed

    private void managePersonsJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePersonsJButtonMouseEntered
        // TODO add your handling code here:
        managePersonsJButton.setForeground(Color.white);
    }//GEN-LAST:event_managePersonsJButtonMouseEntered

    private void managePersonsJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePersonsJButtonMouseExited
        // TODO add your handling code here:
        managePersonsJButton.setForeground(Color.black);
    }//GEN-LAST:event_managePersonsJButtonMouseExited

    private void patientManagerJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientManagerJButtonMouseEntered
        // TODO add your handling code here:
        patientManagerJButton.setForeground(Color.white);
    }//GEN-LAST:event_patientManagerJButtonMouseEntered

    private void patientManagerJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientManagerJButtonMouseExited
        // TODO add your handling code here:
        patientManagerJButton.setForeground(Color.black);
    }//GEN-LAST:event_patientManagerJButtonMouseExited

    private void vitalSignReportJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vitalSignReportJButtonMouseEntered
        // TODO add your handling code here:
        vitalSignReportJButton.setForeground(Color.white);
    }//GEN-LAST:event_vitalSignReportJButtonMouseEntered

    private void vitalSignReportJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vitalSignReportJButtonMouseExited
        // TODO add your handling code here:
        vitalSignReportJButton.setForeground(Color.black);
    }//GEN-LAST:event_vitalSignReportJButtonMouseExited
   
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton managePersonsJButton;
    private javax.swing.JButton patientManagerJButton;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JButton vitalSignReportJButton;
    // End of variables declaration//GEN-END:variables
}
