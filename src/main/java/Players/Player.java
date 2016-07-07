package Players;

import javax.swing.JOptionPane;

import Interfaces.Przegrana;
import Interfaces.Wygrana;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package JAVA #2;

/**
 *
 * @author student
 */
public abstract class Player  implements Wygrana, Przegrana{
//zmienne
  public String name = "bez imienia";
  public int punkty;
  int pieniadze;
  public int wybor=3;
  public int timeLimit;
  String typGracza = "jakis gracz";
  
 //konstruktory
  public Player() { }
  
  //metody
  String getTypGracza()      { return typGracza; }
  String getName()     { return  name;   }
  int getWynik()    { return pieniadze; }
  public void displayPlayerInfo()  {
    System.out.println(getTypGracza()+" "+getName()+" wchodzi do gry z ilo�ci�: " +getWynik()+" punkt�w");
  }
  
  public void Strategy(int tab[], int n, int i){  
	  tab[i]=wybor;
  }
  
  public void DisplayStrategy(int tab[], int n){
	  System.out.print("Strategia gracza " + name + ": { ");
	  for(int i=0;i<n;i++)
		  System.out.print(tab[i] + " ");
	  System.out.println("}");
  }
  
  public void setName(){ 
	  	name = JOptionPane.showInputDialog("Na pocz�tek podaj swoje imie i nazwisko: "); 
		
		displayPlayerInfo();
	}
  
}