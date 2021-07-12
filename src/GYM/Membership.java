package GYM;


import GYM.Member;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Nurhan
 */
public class Membership {
    String Membershipname;
    int Membershipmembersnumber=0;
    Member[] membershipMembers= new Member[Membershipmembersnumber+1];
    int price;
     
    public Membership(String Membershipname, int price) 
    {
        this.Membershipname = Membershipname;
        this.price = price;
    }
   
}
