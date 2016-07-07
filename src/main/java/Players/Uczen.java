package Players;

import javax.swing.JOptionPane;

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
public class Uczen extends Player{

        public Uczen(){
		name = "";
		punkty = 0;
		pieniadze = 100;
	    typGracza = "Uczen";
	    timeLimit = 240;
}
	
	public Uczen(String _name, int _punkty, int _pieniadze){
		name = _name;
		punkty = _punkty;
		pieniadze = _pieniadze;
	    typGracza = "Uczen";
	    timeLimit = 240;
}
	
	public void Komunikat_Wygranej(int punkty, int losuj_komunikat){
		switch(losuj_komunikat){	
		case 0: JOptionPane.showMessageDialog(null,"Brawo uczniu " + name + " wygrales " + punkty+" pkt");break;
		case 1: JOptionPane.showMessageDialog(null,"Jesteœ œwietnym graczem " + name + " wygrales " + punkty+" pkt");break;
		case 2: JOptionPane.showMessageDialog(null,"Niesamowite ¿e to wiedzia³eœ " + name + " zdobe³eœ " + punkty+" pkt");break;
		case 3: JOptionPane.showMessageDialog(null,"Jesteœ chyba jasnowidzem " + name + " wygrales " + punkty+" pkt");break;
		}
	}
	
	public void Komunikat_Przegranej(int punkty, int losuj_komunikat){
		switch(losuj_komunikat){	
		case 0: JOptionPane.showMessageDialog(null,"Uuuuuuuu " + name + " straci³eœ " + punkty+" pkt");break;
		case 1: JOptionPane.showMessageDialog(null,"Niestety stary " + name + " przegra³eœ " + punkty+" pkt");break;
		case 2: JOptionPane.showMessageDialog(null,"Spoko, " + name + " masz " + punkty+" pkt mniej, jestem pewien ¿e w nastêpnej rundzie coœ wygrasz");break;
		case 3: JOptionPane.showMessageDialog(null,"Jesteœ beznadziejnym graczem " + name + " straci³eœ " + punkty+" pkt");break;
		}
	}
    
}
