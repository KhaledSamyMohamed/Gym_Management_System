package GYM;


import GYM.Trainer;
import GYM.GymMangement;
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
public class UpdateDelete extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDelete
     */
    int IDOfTrainer;
    String Genderselectedvalue="Male";
    String Shiftselectedvalue="9:00 AM - 3:00 PM";
    Trainer removedtrainer;  
    
    private void ClearFileds(){
       Entername.setText(null);
       phonenumbertext.setText(null);
       Agetext.setText(null);  
       ShiftTime.setSelectedItem("9:00 AM - 3:00 PM");
       EnterTrainerID.setText(null);
    }
    
    private Boolean UpdateValidation()
    {

       if(Entername.getText().trim().isEmpty() )
        {
            lbl_name.setText("You must enter a member name");
            Entername.requestFocusInWindow();
            return false;
        }

       else if(phonenumbertext.getText().trim().isEmpty())
        {
            lbl_phone.setText("You must enter the members phone number");
            phonenumbertext.requestFocusInWindow();
            return false;
        }
       else if( Agetext.getText().trim().isEmpty())
        {
            lbl_age.setText("You must enter the members age");
            Agetext.requestFocusInWindow();
            return false;
        }
        else
        {
          return true;
        }
    }
    public UpdateDelete() {
        initComponents();
       // Hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        Entername = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        phonenumbertext = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        Agetext = new javax.swing.JTextField();
        RemoveButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ShiftTime = new javax.swing.JComboBox<>();
        ShiftLabel = new javax.swing.JLabel();
        EnterTrainerID = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        lbl_name = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_age = new javax.swing.JLabel();
        Close_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(550, 250));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update & delete member.png"))); // NOI18N
        jLabel1.setText("Update & Delete Trainers");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Trainer ID");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(51, 51, 51));
        NameLabel.setText("Name");

        Entername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Entername.setForeground(new java.awt.Color(51, 51, 51));
        Entername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnternameActionPerformed(evt);
            }
        });
        Entername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnternameKeyPressed(evt);
            }
        });

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(51, 51, 51));
        PhoneLabel.setText("Mobile Number");

        phonenumbertext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phonenumbertext.setForeground(new java.awt.Color(51, 51, 51));
        phonenumbertext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenumbertextKeyPressed(evt);
            }
        });

        AgeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(51, 51, 51));
        AgeLabel.setText("Age");

        Agetext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Agetext.setForeground(new java.awt.Color(51, 51, 51));
        Agetext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgetextKeyPressed(evt);
            }
        });

        RemoveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemoveButton.setForeground(new java.awt.Color(51, 51, 51));
        RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(51, 51, 51));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ShiftTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShiftTime.setForeground(new java.awt.Color(51, 51, 51));
        ShiftTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 AM - 3:00 PM", "3:00 PM - 12:00 AM", "12:00 AM - 9:00 AM" }));
        ShiftTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShiftTimeActionPerformed(evt);
            }
        });

        ShiftLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShiftLabel.setForeground(new java.awt.Color(51, 51, 51));
        ShiftLabel.setText("Shift Time");

        EnterTrainerID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnterTrainerID.setForeground(new java.awt.Color(255, 0, 0));

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(51, 51, 51));
        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        lbl_name.setForeground(new java.awt.Color(255, 0, 0));

        lbl_phone.setForeground(new java.awt.Color(255, 0, 0));

        lbl_age.setForeground(new java.awt.Color(255, 0, 0));

        Close_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(EnterTrainerID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Close_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Entername, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameLabel))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ShiftLabel)
                                    .addComponent(ShiftTime, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(AgeLabel))
                        .addContainerGap(154, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(UpdateButton)
                        .addGap(34, 34, 34)
                        .addComponent(RemoveButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(phonenumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Agetext, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Close_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton)
                    .addComponent(EnterTrainerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShiftLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShiftTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phonenumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgeLabel)
                .addGap(9, 9, 9)
                .addComponent(Agetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(RemoveButton))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
       
      try
      {
        int a=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Trainer?" , "Select", JOptionPane.YES_NO_OPTION);
        if (a==0)
        { 
           
            IDOfTrainer=Integer.parseInt(EnterTrainerID.getText());
                try
                {   for (Trainer tra1 : GymMangement.trainers)
                    {
                        if(IDOfTrainer==tra1.tranierID )
                        {
                          removedtrainer=tra1;
                        }
                        for(Member m :GymMangement.members)
                            if(m.TrainerID==tra1.tranierID)
                            {
                                m.TrainerName="";
                                m.TrainerID=0;
                            }
                        for(Class c :GymMangement.classes)
                            if(c.trainerID==tra1.tranierID)
                            {
                                c.trainerID=0;
                                c.TrainerName="";     
                            }
                    }
                    ClearFileds();
                    GymMangement.trainers.remove(removedtrainer);
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

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
       
        try{ IDOfTrainer= Integer.parseInt(EnterTrainerID.getText());}
        catch(Exception e){JOptionPane.showMessageDialog(null,"Please enter ID you want to update");}//ClearFileds();}
        for (Trainer tra1 : GymMangement.trainers)
        {
            if(IDOfTrainer==tra1.tranierID)
            {
                if(UpdateValidation()==true)
                {
                    tra1.Name = Entername.getText();
                    try{ tra1.Age = Integer.parseInt(Agetext.getText().trim());}
                    catch(Exception e)
                    {
                       JOptionPane.showMessageDialog(null,"There was an error try again");
                    }
                    tra1.phonenumber=phonenumbertext.getText().trim();
                    tra1.ShiftTime=Shiftselectedvalue;
                    ClearFileds();
                }
            }
        }


    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ShiftTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShiftTimeActionPerformed
       
        Shiftselectedvalue =ShiftTime.getSelectedItem().toString();
    }//GEN-LAST:event_ShiftTimeActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
      
        boolean exists=false; try{IDOfTrainer =Integer.parseInt(EnterTrainerID.getText());}
        catch(Exception e){JOptionPane.showMessageDialog(null,"Please enter ID you want to search"); exists=true;}
       
        for (Trainer train : GymMangement.trainers)
        {
            if(train.tranierID==IDOfTrainer)
            {
              exists=true;
              train.Dislayinfo(Entername, Agetext, phonenumbertext, ShiftTime, train.Name, train.phonenumber,train.Age,train.ShiftTime);

            }
        }
        if(exists==false)
        {
            JOptionPane.showMessageDialog(null,"There is no such Trainer");

        }
      
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void EnternameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnternameKeyPressed
        
        lbl_name.setText("");
    }//GEN-LAST:event_EnternameKeyPressed

    private void phonenumbertextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumbertextKeyPressed
        
        lbl_phone.setText("");
    }//GEN-LAST:event_phonenumbertextKeyPressed

    private void AgetextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgetextKeyPressed
       
        lbl_age.setText("");
    }//GEN-LAST:event_AgetextKeyPressed

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void EnternameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnternameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnternameActionPerformed

    private Boolean TrainerValidation(String name,String phonenumber ,String age)
    {
        if (name.equals(""))
        {  
            JOptionPane.showMessageDialog(null,"Please Enter Trainer's Name.");
            Entername.requestFocusInWindow();
            return false;
        }
 
        else if(phonenumber.equals("")) 
        { 
           JOptionPane.showMessageDialog(null,"Please Enter Trainer's Phonenumber.");
            phonenumbertext.requestFocusInWindow();
            return false;
        }
        
        else if(age.equals("")) 
        { 
           JOptionPane.showMessageDialog(null,"Please Enter Trainer's Age.");
            Agetext.requestFocusInWindow();
            return false;
        }
        
        else
        {
            return true;
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
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField Agetext;
    private javax.swing.JButton Close_Button;
    private javax.swing.JTextField EnterTrainerID;
    private javax.swing.JTextField Entername;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel ShiftLabel;
    private javax.swing.JComboBox<String> ShiftTime;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JTextField phonenumbertext;
    // End of variables declaration//GEN-END:variables
}
