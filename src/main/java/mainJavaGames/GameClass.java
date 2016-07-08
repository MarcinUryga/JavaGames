package mainJavaGames;

import GameController.GamesController;
import GameModel.GamesModel;
import GameView.View;
import Menu.Menu;
import Players.Player;

public class GameClass{
	View view=null;
	GamesController controller = null;
	GamesModel model = null;
	Menu menu = null;
	public GameClass(Player p1, Player p2, int gra, int round){
		
		switch(gra){

			case 0:
			case 1:
			case 2:
			case 3:	view = new View(gra);
					model = new GamesModel(p1, p2, round, gra);
					controller = new GamesController(model, view, gra);
					break;
					
				
			case 5:	menu = new Menu();
			
						
		}
		
		
		
	}
}

