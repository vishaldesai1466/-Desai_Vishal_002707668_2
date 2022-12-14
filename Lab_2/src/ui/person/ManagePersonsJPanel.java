/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.person;

import model.Person;
import model.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.VitalSign;
import model.VitalSignHistory;
import ui.patient.ManagePatientsJPanel;
import ui.patient.ManageVitalSignsJPanel;
public class ManagePersonsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonsJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    public ManagePersonsJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory= personDirectory;
        this.userProcessContainer= userProcessContainer;
    }
    
    private void populatePersonsTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Person's found. Please add"
                    + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[7];
            row[0] = person;
            row[1]= person.getAge();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            row[3] = person.getweight();
            row[4] = person.getAddress();
            row[5] = person.getCity();
            row[6] = person.getCommunity();
            model.addRow(row);
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

        searchPersonJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        editPersonJButton = new javax.swing.JButton();
        viewPersonJButton = new javax.swing.JButton();
        deletePersonJButton = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        createPersonJButton = new javax.swing.JButton();
        managePatientsJButton = new javax.swing.JButton();
        manageVitalSignsJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        searchPersonJButton.setBackground(new java.awt.Color(102, 102, 255));
        searchPersonJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        searchPersonJButton.setText("Search Person");
        searchPersonJButton.setBorderPainted(false);
        searchPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(102, 102, 255));
        backJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.setBorderPainted(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(102, 102, 255));
        refreshJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorderPainted(false);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Age", "Patient ID", "Weight", "Address", "City", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonsJTable);

        editPersonJButton.setBackground(new java.awt.Color(102, 102, 255));
        editPersonJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        editPersonJButton.setText("Edit Person");
        editPersonJButton.setBorderPainted(false);
        editPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPersonJButtonActionPerformed(evt);
            }
        });

        viewPersonJButton.setBackground(new java.awt.Color(102, 102, 255));
        viewPersonJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        viewPersonJButton.setText("View Person");
        viewPersonJButton.setBorderPainted(false);
        viewPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonJButtonActionPerformed(evt);
            }
        });

        deletePersonJButton.setBackground(new java.awt.Color(102, 102, 255));
        deletePersonJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        deletePersonJButton.setText("Delete Person");
        deletePersonJButton.setBorderPainted(false);
        deletePersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonJButtonActionPerformed(evt);
            }
        });

        searchBoxJTextField.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        searchBoxJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxJTextFieldActionPerformed(evt);
            }
        });

        createPersonJButton.setBackground(new java.awt.Color(102, 102, 255));
        createPersonJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        createPersonJButton.setText("Create Person");
        createPersonJButton.setBorderPainted(false);
        createPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonJButtonActionPerformed(evt);
            }
        });

        managePatientsJButton.setBackground(new java.awt.Color(102, 102, 255));
        managePatientsJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        managePatientsJButton.setText("Patients Directory");
        managePatientsJButton.setBorderPainted(false);
        managePatientsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientsJButtonActionPerformed(evt);
            }
        });

        manageVitalSignsJButton.setBackground(new java.awt.Color(102, 102, 255));
        manageVitalSignsJButton.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        manageVitalSignsJButton.setText("Encounter History");
        manageVitalSignsJButton.setBorderPainted(false);
        manageVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignsJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Person Directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchPersonJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(createPersonJButton)
                                .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(viewPersonJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(editPersonJButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(deletePersonJButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(managePatientsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(manageVitalSignsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(refreshJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 159, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPersonJButton)
                    .addComponent(editPersonJButton)
                    .addComponent(deletePersonJButton)
                    .addComponent(backJButton)
                    .addComponent(createPersonJButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchPersonJButton)
                        .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(managePatientsJButton)
                        .addComponent(manageVitalSignsJButton)))
                .addGap(48, 48, 48)
                .addComponent(refreshJButton)
                .addGap(138, 138, 138))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchBoxJTextField.getText();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPersons;
        searchPersons=personDirectory.searchPerson(key);
        populatePersonsTable(searchPersons);
    }//GEN-LAST:event_searchPersonJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        searchBoxJTextField.setText("");
        populatePersonsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void createPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonJButtonActionPerformed
        // TODO add your handling code here:
        CreatePersonJPanel cpJPanel= 
                new CreatePersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPersonJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        ViewUpdatePersonDetailsJPanel vupersondJPanel=
        new ViewUpdatePersonDetailsJPanel(userProcessContainer, person,Boolean.FALSE);
        userProcessContainer.add("vupersondJPanel", vupersondJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPersonJButtonActionPerformed

    private void editPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPersonJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        ViewUpdatePersonDetailsJPanel vupersondJPanel=
        new ViewUpdatePersonDetailsJPanel(userProcessContainer, person,Boolean.TRUE);
        userProcessContainer.add("vupersondJPanel", vupersondJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_editPersonJButtonActionPerformed

    private void deletePersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
            "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            personDirectory.deletePerson(person);
            populatePersonsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_deletePersonJButtonActionPerformed

    private void manageVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
//        ManageVitalSignsJPanel mvsJPanel=
//        new ManageVitalSignsJPanel(userProcessContainer, personDirectory);
//        userProcessContainer.add("mvsJPanel", mvsJPanel);
//        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        ManageVitalSignsJPanel mvsJPanel = new ManageVitalSignsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mvsJPanel", mvsJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignsJButtonActionPerformed

    private void managePatientsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientsJButtonActionPerformed
        // TODO add your handling code here:
        ManagePatientsJPanel mpJPanel= new ManagePatientsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mpJPanel", mpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientsJButtonActionPerformed

    private void searchBoxJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createPersonJButton;
    private javax.swing.JButton deletePersonJButton;
    private javax.swing.JButton editPersonJButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton managePatientsJButton;
    private javax.swing.JButton manageVitalSignsJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPersonJButton;
    private javax.swing.JButton viewPersonJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}
