package GYM;

import GYM.GymMangement;
import GYM.Class;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Nurhan
 */
public class Member extends Person {
    
    static int numberofmembers = 0;
    int code;
    Membership membership;
    Class Memclasses;
    String TrainerName;
    int TrainerID;

    public Member(String membershipname, String Name, int Age, String Ssn,String phonenumber,String Gender , String TName , int TID) {
        super(Name, Ssn, phonenumber, Age,Gender);
        for (Membership memship1  : GymMangement.memberships)
        {   
            if(memship1.Membershipname.equals(membershipname))
            {
                membership=memship1;
                memship1.Membershipmembersnumber++;
            }
        }
        code = numberofmembers+1;
        this.TrainerName=TName;
        this.TrainerID = TID;
        numberofmembers ++;
    }
    public Member(){
        
        
    }
    @Override
    protected void Add(JTextField NameText, JTextField Agetext, JTextField Ssn, JTextField Mobilenumber, JComboBox Membership, JComboBox Gender,StringBuilder name,StringBuilder phonenumber ,StringBuilder age,StringBuilder ssn,StringBuilder Packageselectedvalue, StringBuilder Genderselectedvalue)
    {
      name.delete(0, 10).append(NameText.getText());
      phonenumber.delete(0, 13).append(Mobilenumber.getText());
      age.delete(0, 10).append(Agetext.getText());
      ssn.delete(0, 16).append(Ssn.getText());
      Genderselectedvalue.delete(0,10).append(Gender.getSelectedItem().toString());
      Packageselectedvalue.delete(0,20).append(Membership.getSelectedItem().toString());
 
    }
    
    @Override
    protected void Dislayinfo(JTextField NameText, JTextField Agetext, JTextField Mobilenumber, JComboBox Membership,String name,String phonenumber ,int age,String membershipname)
    {
      NameText.setText(name);
      Mobilenumber.setText(phonenumber);
      Agetext.setText(String.valueOf(age));
      Membership.setSelectedItem(membershipname);
    }
    
}
