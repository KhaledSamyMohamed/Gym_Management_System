package GYM;


import GYM.Class;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bishoy
 */
public class ClassOperaions extends javax.swing.JFrame {

    Class removedclass = GymMangement.Defaultclass;
    String removedclassname="";
    String SelectAvailability = "Available" ;
    String Classselectedvalue="Default";
    String[] data = new String[GymMangement.size];

    private void ClearFileds()
    {
       Classselectedvalue="Default";
      AvailabilityBox.setSelectedItem("Available");
      ClassDescription.setText("");
      
       GymMangement.classnames.clear();
       
        for (Class cl : GymMangement.classes)
        {
          GymMangement.classnames.add(cl.Classname);
        }   

        for(int i = 0; i < data.length; i++) 
        {
           data[i] ="";
        }
      
        for(int i = 0; i < GymMangement.classes.size(); i++) 
        {
           data[i] = GymMangement.classnames.get(i);
        }
        ClassesBox1.setModel(new javax.swing.DefaultComboBoxModel<>(data));

    }
    private Boolean UpdateValidation()
    {
       
        if(ClassDescription.getText().isEmpty())
        {
           DiscriptionWarning.setVisible(true);
           ClassDescription.requestFocusInWindow();
           return false;
        }
        else
        {
          return true;
        }
        
    }
    public ClassOperaions() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UpdateDeletePanel = new javax.swing.JPanel();
        ClassesHeader1 = new javax.swing.JLabel();
        Classeslabel = new javax.swing.JLabel();
        ClassesBox1 = new javax.swing.JComboBox<>();
        Close_Button = new javax.swing.JButton();
        lbl_ClassDescribe = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        AvailabilityBox = new javax.swing.JComboBox<>();
        DiscriptionWarning = new javax.swing.JLabel();
        Editbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassDescription = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 250));
        setUndecorated(true);

        UpdateDeletePanel.setBackground(new java.awt.Color(204, 204, 204));
        UpdateDeletePanel.setToolTipText("");

        ClassesHeader1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        ClassesHeader1.setForeground(new java.awt.Color(51, 51, 51));
        ClassesHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list of members.png"))); // NOI18N
        ClassesHeader1.setText("Classes");

        Classeslabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Classeslabel.setForeground(new java.awt.Color(51, 51, 51));
        Classeslabel.setText("Classes");

        ClassesBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClassesBox1.setForeground(new java.awt.Color(102, 102, 102));
        GymMangement.classnames.clear();
        for (Class cl : GymMangement.classes)
        {
            GymMangement.classnames.add(cl.Classname);
        }
        //GymMangement.classnames.add("");
        for(int i = 0; i < GymMangement.classnames.size() ; i++)
        {
            data[i] = GymMangement.classnames.get(i);
        }
        ClassesBox1.setModel(new javax.swing.DefaultComboBoxModel<>(data));
        //ClassesBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { classnames[0],classnames[1],classnames[2], classnames[3], classnames[4],classnames[5] }));
        ClassesBox1.setToolTipText("");
        ClassesBox1.setAutoscrolls(true);
        ClassesBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClassesBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassesBox1MouseClicked(evt);
            }
        });
        ClassesBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassesBox1ActionPerformed(evt);
            }
        });

        Close_Button.setBackground(new java.awt.Color(204, 204, 204));
        Close_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        lbl_ClassDescribe.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_ClassDescribe.setForeground(new java.awt.Color(51, 51, 51));
        lbl_ClassDescribe.setText("Class description");

        RemoveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemoveButton.setForeground(new java.awt.Color(51, 51, 51));
        RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        AvailabilityBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AvailabilityBox.setForeground(new java.awt.Color(102, 102, 102));
        AvailabilityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));
        AvailabilityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailabilityBoxActionPerformed(evt);
            }
        });

        DiscriptionWarning.setForeground(new java.awt.Color(255, 51, 51));
        DiscriptionWarning.setText("Please Enter Description");
        DiscriptionWarning.setVisible(false);

        Editbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Editbutton.setForeground(new java.awt.Color(51, 51, 51));
        Editbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        Editbutton.setText("Edit");
        Editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbuttonActionPerformed(evt);
            }
        });

        ClassDescription.setEditable(false);
        ClassDescription.setColumns(20);
        ClassDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClassDescription.setForeground(new java.awt.Color(51, 51, 51));
        ClassDescription.setRows(5);
        ClassDescription.setSelectionColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(ClassDescription);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Availability");

        javax.swing.GroupLayout UpdateDeletePanelLayout = new javax.swing.GroupLayout(UpdateDeletePanel);
        UpdateDeletePanel.setLayout(UpdateDeletePanelLayout);
        UpdateDeletePanelLayout.setHorizontalGroup(
            UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(ClassesHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Close_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(Classeslabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(Editbutton)
                .addGap(94, 94, 94)
                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateDeletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(AvailabilityBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClassesBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)))
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiscriptionWarning)
                    .addComponent(lbl_ClassDescribe)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        UpdateDeletePanelLayout.setVerticalGroup(
            UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close_Button)
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ClassesHeader1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Classeslabel)
                    .addComponent(lbl_ClassDescribe))
                .addGap(14, 14, 14)
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(ClassesBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvailabilityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveButton)
                            .addComponent(Editbutton))
                        .addGap(81, 81, 81))
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DiscriptionWarning)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(UpdateDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(UpdateDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassesBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesBox1ActionPerformed

       try{Classselectedvalue = ClassesBox1.getSelectedItem().toString();}
       catch(Exception e){}

        for (Class cl : GymMangement.classes)
        {
            if(Classselectedvalue == cl.Classname)
            {
                String g =cl.description;
                ClassDescription.setText(g);
                cl.avaiability=SelectAvailability;

            }
        }
        
    }//GEN-LAST:event_ClassesBox1ActionPerformed

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        ClassesBox1.removeAllItems();
        setVisible(false);
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void AvailabilityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailabilityBoxActionPerformed
  
        SelectAvailability = AvailabilityBox.getSelectedItem().toString();
 
    }//GEN-LAST:event_AvailabilityBoxActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
    try
    { 
        int a=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Class?" , "Select", JOptionPane.YES_NO_OPTION);
        if (a==0)
        {   
                try
                {  
                
               
                    for (Class C1 : GymMangement.classes)
                    {
                        if(Classselectedvalue.equals(C1.Classname))
                        {  
                            removedclass= C1;
                            Class.totalnumberofclasses--;
                            for(String s : GymMangement.classnames)
                            { 
                                if(Classselectedvalue.equals(s))
                                {
                                    removedclassname=s; 
                                }
                            }
                        }
                    }  
                    
                    GymMangement.classes.remove(removedclass);
                    GymMangement.classnames.remove(removedclassname);
                    GymMangement.size--;
                    ClearFileds();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                } 
                
        }
     
                   
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void EditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbuttonActionPerformed
    
        for ( Class C1 : GymMangement.classes)
        {
            if(Classselectedvalue==C1.Classname)
            {
                if(UpdateValidation()==true)
                {
                    C1.Classname=Classselectedvalue;
                    C1.description=ClassDescription.getText();
                    C1.avaiability = SelectAvailability;
                }
            }
        }
        ClearFileds();
    }//GEN-LAST:event_EditbuttonActionPerformed

    private void ClassesBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassesBox1MouseClicked
       
       try{ Classselectedvalue = ClassesBox1.getSelectedItem().toString(); }
       catch(Exception e){}
    }//GEN-LAST:event_ClassesBox1MouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassOperaions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AvailabilityBox;
    private javax.swing.JTextArea ClassDescription;
    private javax.swing.JComboBox<String> ClassesBox1;
    private javax.swing.JLabel ClassesHeader1;
    private javax.swing.JLabel Classeslabel;
    private javax.swing.JButton Close_Button;
    private javax.swing.JLabel DiscriptionWarning;
    private javax.swing.JButton Editbutton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JPanel UpdateDeletePanel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ClassDescribe;
    // End of variables declaration//GEN-END:variables
}
