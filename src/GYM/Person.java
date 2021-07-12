package GYM;


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
public abstract class Person {
    public String Name;
    int Age;
    String Ssn;
    String phonenumber;
    String Gender;
 
    public Person(String Name, String Ssn, String phonenumber,int Age) {
        this.Name = Name;
        this.Age = Age;
        this.Ssn = Ssn;
        this.phonenumber = phonenumber;
    }
    public Person(){
        
    }

    public Person(String Name, String Ssn, String phonenumber, int Age ,String Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Ssn = Ssn;
        this.phonenumber=phonenumber;
        this.Gender=Gender;
    }
    protected abstract void Add(JTextField NameText, JTextField Agetext, JTextField Ssn, JTextField Mobilenumber, JComboBox Membership, JComboBox Gender,StringBuilder name,StringBuilder phonenumber ,StringBuilder age,StringBuilder ssn,StringBuilder Packageselectedvalue, StringBuilder Genderselectedvalue);
    protected abstract void Dislayinfo(JTextField NameText, JTextField Agetext, JTextField Mobilenumber, JComboBox Membership,String name,String phonenumber ,int age,String Packageselectedvalue);

 
}
