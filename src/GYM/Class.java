package GYM;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Class {
    Trainer t1;
    String description;
    final int limitedNumber=2;
    String Classname;
    String Daytime;
    String avaiability;
    String TrainerName;
    int trainerID;
    static int totalnumberofclasses=5;

    ArrayList<Member> Classmembers = new ArrayList<Member>(limitedNumber);
    public Class(String NameClass,String description,String Daytime,String avaiable , String TrainerName ,int trainerID) 
    {
        this.description = description;
        this.Classname = NameClass;
        this.Daytime=Daytime;
        this.avaiability=avaiable;
        this.TrainerName=TrainerName;
        this.trainerID=trainerID;
    }

    public Class(String NameClass)
    {
        this.Classname = NameClass;
    }
}
