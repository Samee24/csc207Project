package sportsScheduler;

import java.io.FileNotFoundException;

public class Expt
{

  public static void main(String[] args) throws FileNotFoundException
  {
    /*
    Team grinnell = new Team("grinnell.txt");
    System.out.println(grinnell.toString());
    
    for(int i = 0; i < grinnell.restrictions.length; i++){
      System.out.print(grinnell.restrictions[i]);
    }
    
    System.out.println();
    */
    
    Conference mwc = new Conference("mwc.txt", "dates.txt", 10, 19);
    
    for(int i = 0; i < mwc.teams.length; i++){
      System.out.println(mwc.teams[i].toString());
      for(int j = 0; j < mwc.teams[i].restrictions.length; j++){
        System.out.print(mwc.teams[i].restrictions[j] + " ");
      }// for j
      System.out.println();
    }// for i
    for(int j = 0; j < mwc.datesOfCompetition.length; j++){
      System.out.println(mwc.datesOfCompetition[j].toString());
    }// for j
    
    mwc.readMileage("milage.txt");
    for(int i = 0; i < mwc.teams.length; i++){
      for(int j = 0; j < mwc.teams.length; j++){
        System.out.print(mwc.mileage[i][j] + " ");
      }// for j
      System.out.println();
    }// for i
  }

}
