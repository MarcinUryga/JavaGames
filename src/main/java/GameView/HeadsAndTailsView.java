package GameView;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HeadsAndTailsView implements StrategyGamesView{

	public JButton []gamesButtons=null;
	public String [] podpisyGamesButtons=null;
	public JPanel gamesButtonsPanel=null;
	
	int NumberOfButtons;

	
	public HeadsAndTailsView(JButton []gamesButtons, String [] podpisyGamesButtons, JPanel gamesButtonsPanel){
		gamesButtons = new JButton[2];
		podpisyGamesButtons = new String[2];
		podpisyGamesButtons[0] = "Orze³";
		podpisyGamesButtons[1] = "Reszka";
		NumberOfButtons = 2;
		
		this.gamesButtonsPanel = gamesButtonsPanel;
		this.gamesButtons = gamesButtons;
		this.podpisyGamesButtons = podpisyGamesButtons;
	}
	
	public int ReturnNumberOfButtons(){
		return NumberOfButtons;
	}
	
	public String ReturnSignaturesOfButtons(int i){
		return podpisyGamesButtons[i];
	}
}
