package GameView;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HareAndDeerView implements StrategyGamesView{

	public JButton []gamesButtons=null;
	public String [] podpisyGamesButtons=null;
	public JPanel gamesButtonsPanel=null;
	
	int NumberOfButtons;

	
	public HareAndDeerView(JButton []gamesButtons, String [] podpisyGamesButtons, JPanel gamesButtonsPanel){
		gamesButtons = new JButton[2];
		podpisyGamesButtons = new String[2];
		podpisyGamesButtons[0] = "Jeleñ";
		podpisyGamesButtons[1] = "Zaj¹c";
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
