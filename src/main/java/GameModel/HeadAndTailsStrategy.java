package GameModel;

import javax.swing.JOptionPane;

import Players.Player;
import Threads.Timer;

public class HeadAndTailsStrategy implements StrategyGamesModel{

	protected int wygrana = 10;
	protected int przegrana = 20;

	protected int allRounds;
	public int round;
	
	
	public int Random(Player p1, Player p2, int n, int ktoLosuje){
		int wybor;
		wybor = (int) (Math.random()*n);
		if(wybor == 0)
			if(ktoLosuje == 0)
				JOptionPane.showMessageDialog(null,"Wypadl orzel");
			else
				JOptionPane.showMessageDialog(null,"Gracz "+p2.name+": wybieram orla");
		else
			if(ktoLosuje == 0)
				JOptionPane.showMessageDialog(null,"Wypadla reszka");
			else
				JOptionPane.showMessageDialog(null,"Gracz "+p2.name+": wybieram reszke");
		return wybor;
	}
	
	public int ChoiceOfTheFirstPlayer(String choice, Player p1){
		if(choice == "Orze³"){
			JOptionPane.showMessageDialog(null,"Gracz " + p1.name + " wybra³ or³a");
			p1.wybor = 0;
		}
		else if(choice == "Reszka"){
			JOptionPane.showMessageDialog(null,"Gracz " + p1.name + " wybra³ reszke");
			p1.wybor = 1;
		}
		return p1.wybor;
	}
	
	public int setRand(Player p1, Player p2){
		return Random(p1,p2,2,2);
	}
	
	public String Judge(Player p1, Player p2, int wygrana, int przegrana, int randomChoice){
		//p2.wybor = Random(p1,p2,2,2);
		p2.wybor = randomChoice;
		round++;
		String winner = p1.name;

		JOptionPane.showMessageDialog(null, "Rzucam moneta");
		int wylosowano = Random(p1,p2,2,0);
		
		if(p1.wybor == wylosowano){
			wylosowano=(int) (Math.random()*4);
			p1.punkty += wygrana;
			p1.Komunikat_Wygranej(wygrana, wylosowano);
			p2.punkty -= przegrana;
			p2.Komunikat_Przegranej(przegrana, wylosowano);
		}
			
		else{
			if(p1.wybor == 3 || (p1.wybor != 0 && p1.wybor != 1)){
				JOptionPane.showMessageDialog(null, " KONIEC CZASU! Komputer wygrywa na rzecz " + p1.name + wygrana + " pkt");
				p2.punkty += wygrana;
				p1.punkty -= przegrana;
				winner = p2.name;
			}
				
			else if (p1.wybor != wylosowano && p2.wybor != wylosowano){
				JOptionPane.showMessageDialog(null, "Niestety ¿aden nie zgad³!");
				winner = "remis";
			}
			else{
				wylosowano=(int) (Math.random()*4);
				p2.punkty += wygrana;
				p2.Komunikat_Wygranej(wygrana, wylosowano);
				p1.punkty -= przegrana;
				p1.Komunikat_Przegranej(przegrana, wylosowano);
				winner = p2.name;
			}
		}
		return winner;
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
