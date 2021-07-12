package GYM;

import GYM.Class;
import java.util.ArrayList;
import java.util.Iterator;

public class GymMangement {
    static int size = 5;
    static ArrayList<Trainer> trainers  = new ArrayList<Trainer>(Trainer.NumberOfTrainers);
    static ArrayList<Member> members = new ArrayList<Member>(Member.numberofmembers);
    static ArrayList<Membership> memberships = new ArrayList<Membership>(4);
    static ArrayList<Class> classes=new ArrayList<Class>(Class.totalnumberofclasses);
    static Class Defaultclass  = new Class("ff","cc","dd","Avaiable","No one",0000);
    static ArrayList<String> classnames=new ArrayList<String>(Class.totalnumberofclasses);

 public static void main(String[] args) {
      Membership mship1 = new Membership("Daily access",100);
      Membership mship2 = new Membership("Monthly Membership",500);
      Membership mship3 = new Membership("Six Month Membership",1500);
      Membership mship4 = new Membership("One year Membership",3500);
     
      memberships.add(mship1);
      memberships.add(mship2);
      memberships.add(mship3);
      memberships.add(mship4);
     
      Class Bodycombat= new Class("Body Combat",
              "BODYCOMBAT is the empowering cardio workout\n\n where you are totally unleached.\n\n This fiercely energetic program is inspired by the martial art \n\n such as boxing, karate, taekwondo & tai chai.",
              "MONDAY-2:30PM", "Avaiable","No one",0000);
      Class YOGA= new Class("Hatha Yoga",
               "Hatha simply refers to the practice of physical yoga posture\n\n meaning your Ashtanga, Vinyasa, Iyengar and Power \n\n Yoga classes are all Hatha Yoga. The word (Hatha) can be \n\n translated two ways: as (willful) or (forceful), or the yoga \n\n of activity, and (su).",
               "SATURDAY-11:00AM" , "Avaiable","No one",0000);
      Class Zumba = new Class("Zumba",
               "A mix of low-intensity and high-intensity moves inspired\n\n by latin and international music for an interval-style,\n\n calorie-burning dance fitness party. It combines all fitness\n\n elements: cardio, muscle-conditioning, balance, flexibility and\n\n boosted energy.",
               "SUNDAY-12:00PM", "Avaiable","No one",0000);
      Class IndoorCycling= new Class("Indoor Cycling",
               "Ride from the shoreline to the hills in this journey that is\n\n designed to provide you with the optimum in fat burning\n\n and strength building. SPINNING class will simulate\n\n varied terrain as you tackle rolling hills, sprints and other\n\n drills to give you a gre.",
               "TUESDAY-7:30PM" , "Avaiable","No one",0000);
      Class core = new Class("Core",
               "Any exercise that involves the use of your abdominal and\n\n back muscles in coordinated fashion counts as a core \n\n exercise.\n\n For example, using free weights in a manner that involves\n\n maintaining a stable trunk can train and strenghthen several \n\n of your muscles.",
               "TUESDAY-7:30PM", "Avaiable","No one",0000);
      classes.add(Bodycombat);
      classes.add(YOGA);
      classes.add(Zumba);
      classes.add(IndoorCycling);
      classes.add(core);
    
      new login().setVisible(true);
 
    }
 
}
