package GYM;


import GYM.Person;
import javax.swing.JComboBox;
import javax.swing.JTextField;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBAS
 */
public class Trainer extends Person{
    int tranierID;
    boolean avaiability;
    static int NumberOfTrainers=0;
    String ShiftTime;
    String DayTime;
    
    
    public Trainer(String Name, String Ssn,String phonenumber,int Age , String Gender,String ShiftTime ,String DayTime) 
    {
        super(Name,Ssn, phonenumber,Age,Gender);
        this.ShiftTime=ShiftTime;
        this.DayTime=DayTime;
        tranierID = NumberOfTrainers+1;
        NumberOfTrainers ++;
    }
    public Trainer(){
        
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
    protected void Dislayinfo(JTextField NameText, JTextField Agetext, JTextField Mobilenumber, JComboBox Membership,String name,String phonenumber ,int age,String shift)
    {
      NameText.setText(name);
      Mobilenumber.setText(phonenumber);
      Agetext.setText(String.valueOf(age));
      Membership.setSelectedItem(shift);
    }
    
}
