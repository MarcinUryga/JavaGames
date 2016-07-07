package GameModel;

import javax.swing.JOptionPane;

import Players.Player;
import Threads.Timer;

public class HuntingforHareAndDeerStrategy implements StrategyGamesModel{
	
	public int Random(Player p1, Player p2, int n, int ktoLosuje){
		int wybor;
		System.out.println("");
		wybor = (int) ((Math.random()*n)+1);
		if(wybor==1)
			JOptionPane.showMessageDialog(null,"Gracz " + p2.name + ": Strzelam w zwierza poluje na Jelenia!");
		else if(wybor == 2)
			JOptionPane.showMessageDialog(null,"Gracz " + p2.name + ": Upolujê sobie Zaj¹czka!");
		return wybor;
	}
	
	public int setRand(Player p1, Player p2){
		return Random(p1,p2,2,0);
	}
	
	public String Judge(Player p1, Player p2, int wygrana_z, int wygrana_j, int randomChoice){
		int wylosowano;
		wygrana_z = 1;
		wygrana_j = 2;
		
		String winner;
		
		//p2.wybor = Random(p2, p2, 2, 0);
		p2.wybor = randomChoice;
		System.out.println("");
		
		if( p1.wybor == 3 ||  (p1.wybor != 1 && p1.wybor != 2)){
			JOptionPane.showMessageDialog(null,"Komputer wygrywa na rzecz " + p1.name + wygrana_z + " pkt");
			p2.punkty += wygrana_z;
			p1.punkty -= wygrana_z;
			winner = p2.name;
		}
		
		else if((p1.wybor == p2.wybor) && (p1.wybor==1)){
			p1.punkty += 2;
			p2.punkty += 2;
			wylosowano=(int) (Math.random()*4);
			p1.Komunikat_Wygranej(wygrana_j, wylosowano);
			p2.Komunikat_Wygranej(wygrana_j, wylosowano);
			winner = ("Wygrani: gracz "+ " " + p1.name + " i " + p2.name);
		}
		
		else if((p1.wybor == 2) && (p2.wybor == 1)){
			p1.punkty += wygrana_z;
			wylosowano=(int) (Math.random()*4);
			p1.Komunikat_Wygranej(wygrana_z, wylosowano);
			p2.Komunikat_Przegranej(wygrana_j, wylosowano);
			winner = p1.name;
		}
		
			
			else if((p1.wybor == 1 && p2.wybor == 2)){
				p2.punkty += wygrana_z;
				wylosowano=(int) (Math.random()*4);
				p2.Komunikat_Wygranej(wygrana_z, wylosowano);
				p1.Komunikat_Przegranej(wygrana_j, wylosowano);
				winner = p2.name;
			}
	
			else{
				p1.punkty += wygrana_z;
				p2.punkty += wygrana_z;
				wylosowano=(int) (Math.random()*4);
				p1.Komunikat_Wygranej(wygrana_z, wylosowano);
				p2.Komunikat_Wygranej(wygrana_z, wylosowano);
				winner = ("Wygrani: gracz "+ " " + p1.name + " i " + p2.name);
			}
		return winner;
	}

	public int ChoiceOfTheFirstPlayer(String choice, Player p1){
		if(choice == "Jeleñ"){
			JOptionPane.showMessageDialog(null,"Gracz " + p1.name + " poluje na Jelenia");
			p1.wybor = 1;
		}
		else if(choice == "Zaj¹c"){
			JOptionPane.showMessageDialog(null,"Gracz " + p1.name + " strzela do zaj¹ca");
			p1.wybor = 2;
		}
		return p1.wybor;
	}

	public String setChar(boolean whichPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Wins(Player p1, Player p2, int wygrana, int przegrana, String[] Signatures) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean EndOfTime(Timer timer) {
		// TODO Auto-generated method stub
		return false;
	}

	public int CheckRandomButton(String[] Signatures, String znak) {
		// TODO Auto-generated method stub
		return 0;
	}
}
