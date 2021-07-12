package GYM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GYM.Membership;
import GYM.Member;
import GYM.GymMangement;
import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class NewMember extends javax.swing.JFrame {
    
    StringBuilder Packageselectedvalue = new StringBuilder("Daily access");
    StringBuilder Genderselectedvalue = new StringBuilder("Male");
    String codestring = String.valueOf(Member.numberofmembers+1);
    StringBuilder name=new StringBuilder("");
    StringBuilder phonenumber=new StringBuilder("");
    StringBuilder agestring=new StringBuilder("");
    StringBuilder ssnstring=new StringBuilder("");
    
  
    public NewMember() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Entername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phonenumbertext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Agetext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Genderbox = new javax.swing.JComboBox<>();
        Savebutton = new javax.swing.JButton();
        Resetbutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        SSNText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Membershipbox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Namewarning = new javax.swing.JLabel();
        Mobilewarning = new javax.swing.JLabel();
        Agewarning = new javax.swing.JLabel();
        Ssnwarning = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Paymentlabel = new javax.swing.JLabel();
        Exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(550, 250));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1068, 570));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new member.png"))); // NOI18N
        jLabel1.setText("New Member");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Member ID :");

        IDlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDlabel.setForeground(new java.awt.Color(255, 51, 51));
        IDlabel.setText(" ");
        IDlabel.setText(codestring);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name");

        Entername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Entername.setForeground(new java.awt.Color(51, 51, 51));
        Entername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnternameKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Mobile Number");

        phonenumbertext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phonenumbertext.setForeground(new java.awt.Color(51, 51, 51));
        phonenumbertext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenumbertextKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Age");

        Agetext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Agetext.setForeground(new java.awt.Color(51, 51, 51));
        Agetext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgetextKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Gender");

        Genderbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Genderbox.setForeground(new java.awt.Color(51, 51, 51));
        Genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        Genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderboxActionPerformed(evt);
            }
        });

        Savebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Savebutton.setForeground(new java.awt.Color(51, 51, 51));
        Savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        Savebutton.setText("Save");
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });

        Resetbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resetbutton.setForeground(new java.awt.Color(51, 51, 51));
        Resetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        Resetbutton.setText("Reset");
        Resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbuttonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("SSN");

        SSNText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SSNText.setForeground(new java.awt.Color(51, 51, 51));
        SSNText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SSNTextKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Membership");

        Membershipbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Membershipbox.setForeground(new java.awt.Color(51, 51, 51));
        Membershipbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily access", "Monthly Membership", "Six Month Membership", "One year Membership" }));
        Membershipbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembershipboxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Amount of Payment :");

        Namewarning.setForeground(new java.awt.Color(255, 51, 51));
        Namewarning.setText(" ");
        Namewarning.setVisible(false);

        Mobilewarning.setForeground(new java.awt.Color(255, 51, 51));
        Mobilewarning.setText(" ");
        Mobilewarning.setVisible(false);

        Agewarning.setForeground(new java.awt.Color(255, 51, 51));
        Agewarning.setText(" ");
        Agewarning.setVisible(false);

        Ssnwarning.setForeground(new java.awt.Color(255, 51, 51));
        Ssnwarning.setText(" ");
        Ssnwarning.setVisible(false);

        Paymentlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Paymentlabel.setForeground(new java.awt.Color(255, 51, 51));
        Paymentlabel.setText("100");

        Exitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        Exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Agewarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(phonenumbertext)
                                            .addComponent(Agetext)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(Entername, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(Genderbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(37, 37, 37))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Namewarning, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Membershipbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addComponent(SSNText)
                                        .addComponent(Ssnwarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(415, 415, 415)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Paymentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(IDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Savebutton)
                                .addGap(18, 18, 18)
                                .addComponent(Resetbutton)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mobilewarning, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Exitbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namewarning)
                    .addComponent(Ssnwarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Membershipbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Mobilewarning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Agetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Paymentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Agewarning)))
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IDlabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebutton)
                    .addComponent(Resetbutton))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
    Member mem=new Member();
    try
    {
      mem.Add(Entername, Agetext, SSNText,phonenumbertext, Membershipbox, Genderbox, name,phonenumber,agestring,ssnstring, Packageselectedvalue, Genderselectedvalue);
      if(MemberformValidation(name,phonenumber,agestring,ssnstring)==true)
      { 
        mem = new Member(Packageselectedvalue.toString() ,name.toString(),Integer.valueOf(agestring.toString()),ssnstring.toString(),phonenumber.toString(),Genderselectedvalue.toString() ,"No Assigned Trainer", 0000);
        mem.Memclasses=GymMangement.Defaultclass;
        GymMangement.members.add(mem);
        codestring = String.valueOf(Member.numberofmembers+1);
        IDlabel.setText(codestring);
        ClearFileds();
      
      }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Something's wrong please check the entered inputs.");
        System.out.println(e.getLocalizedMessage());
    
    }
    
    
    }//GEN-LAST:event_SavebuttonActionPerformed

    private void ExitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbuttonActionPerformed

        setVisible(false);
    }//GEN-LAST:event_ExitbuttonActionPerformed

    private void MembershipboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembershipboxActionPerformed
       
        Packageselectedvalue.delete(0,20).append(Membershipbox.getSelectedItem().toString());   
        String Package = Packageselectedvalue.toString();
      
        for (Membership memship : GymMangement.memberships)
        { 
            if(memship.Membershipname.equals(Package))
            { 
                String price = String.valueOf(memship.price).trim();
                Paymentlabel.setText(price);
            }
        }
    }//GEN-LAST:event_MembershipboxActionPerformed

    private void GenderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderboxActionPerformed

        Genderselectedvalue.delete(0,7).append(Genderbox.getSelectedItem().toString());
    
    }//GEN-LAST:event_GenderboxActionPerformed

    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbuttonActionPerformed
      ClearFileds();

    }//GEN-LAST:event_ResetbuttonActionPerformed

    private void EnternameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnternameKeyPressed

        Namewarning.setText(" ");
        

    }//GEN-LAST:event_EnternameKeyPressed

    private void phonenumbertextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumbertextKeyPressed
      
        Mobilewarning.setText(" ");
        

    }//GEN-LAST:event_phonenumbertextKeyPressed

    private void AgetextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgetextKeyPressed
        
        Agewarning.setText(" ");
       
    }//GEN-LAST:event_AgetextKeyPressed

    private void SSNTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNTextKeyPressed
        
        Ssnwarning.setText(" ");
      
    }//GEN-LAST:event_SSNTextKeyPressed
 
    
    private Boolean MemberformValidation(StringBuilder name,StringBuilder phonenumber ,StringBuilder age,StringBuilder ssn)
    { 
       
    if (name.length()==0)
    {  
        Namewarning.setVisible(true);
        Namewarning.setText("Please Enter The Name");
        Entername.requestFocusInWindow();
        return false;
    } 
    
    if(phonenumber.length()==0) 
    { 
        Mobilewarning.setVisible(true);
        Mobilewarning.setText("Please Enter Mobile Number");
        phonenumbertext.requestFocusInWindow();
        return false;
    }
    if(age.length()==0) 
    { 
        Agewarning.setVisible(true);
        Agewarning.setText("Please Enter The Age");
        Agetext.requestFocusInWindow();
        return false;
    } 
   if(ssn.length()==0)
    { 
        Ssnwarning.setVisible(true);
        Ssnwarning.setText("Please Enter The SSN");
        SSNText.requestFocusInWindow();
        return false;
    }
    else
    {
      return true;
    }
    }
    private void ClearFileds(){
       Entername.setText(null);
       SSNText.setText(null);
       phonenumbertext.setText(null);
       Agetext.setText(null);  
       Genderbox.setSelectedItem("Male");
       Membershipbox.setSelectedItem("Daily access");
       Ssnwarning.setVisible(false);
       Mobilewarning.setVisible(false);
       Namewarning.setVisible(false);
       Agewarning.setVisible(false);
    }
   
    
    public static void main(String args[]) {
           
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agetext;
    private javax.swing.JLabel Agewarning;
    private javax.swing.JTextField Entername;
    private javax.swing.JButton Exitbutton;
    private javax.swing.JComboBox<String> Genderbox;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JComboBox<String> Membershipbox;
    private javax.swing.JLabel Mobilewarning;
    private javax.swing.JLabel Namewarning;
    private javax.swing.JLabel Paymentlabel;
    private javax.swing.JButton Resetbutton;
    private javax.swing.JTextField SSNText;
    private javax.swing.JButton Savebutton;
    private javax.swing.JLabel Ssnwarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phonenumbertext;
    // End of variables declaration//GEN-END:variables
}
