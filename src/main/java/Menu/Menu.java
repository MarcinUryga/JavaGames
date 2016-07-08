package Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Players.Player;
import Players.Przedszkolak;
import Players.Student;
import Players.Uczen;
import Threads.Music;
import Threads.Timer;
import mainJavaGames.GameClass;

public class Menu extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int HEIGHT = 400;
	public static final int WIDTH = 430;
	private JComboBox<String> comboPlayersBox;
	private JComboBox<String> comboGamesBox;
	
	private JButton startButton;
	private JButton musicButton;
	private JButton exit;
	
	public JLabel timelabel = new JLabel("00:00");
	
	Timer timer = new Timer(null, timelabel,null);
	Thread threadtimer = new Thread(timer);
	
	private JPanel gamersPanel;;
	private JPanel gamesPanel;
	private JPanel timePanel;	
	
	Music music = new Music();
    Thread thread = new Thread(music);
	
    String string[] = {};
	String typGracza[] = { "Przedszkolak", "Uczeñ", "Student" };
	String Gry[] = { "Kó³ko i krzy¿yk", "Orze³ i reszka", "Kamieñ papier no¿yce", "Polowanie na zaj¹ce i jelenie"};
		
	public int round;
	
	public Player player1,player2;
	
	public Menu() {
		setLayout(new FlowLayout());

		player1 = null;
		player2 = null;
		round = 0;
		
	
		
		comboPlayersBox = new JComboBox<String>(typGracza);
		createMenuPanels(gamersPanel, comboPlayersBox, "Wybierz typ gracza");
		
		
		comboPlayersBox.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  if(comboPlayersBox.getSelectedIndex()==0){		
		  			comboGamesBox.removeAllItems();
		  			for(int i = 0; i<2; i++){	
		  				comboGamesBox.addItem(Gry[i]);
		  			}
		  		}
		  		
		  		else if(comboPlayersBox.getSelectedIndex()==1){		
		  			comboGamesBox.removeAllItems();
		  			for(int i=0;i<3;i++){
		  				comboGamesBox.addItem(Gry[i]);	
		  			}
		  		}
		  		
		  		else if(comboPlayersBox.getSelectedIndex()==2){	
		  			comboGamesBox.removeAllItems();
		  			for(int i=0;i<4;i++){
		  				comboGamesBox.addItem(Gry[i]);	
		  			}
		  		}
		        }
		      });
		
		comboGamesBox = new JComboBox<String>();
		createMenuPanels(gamesPanel, comboGamesBox, "Wybierz gre");
		
		comboGamesBox.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {
			    		if(comboGamesBox.getSelectedIndex()==0){
			    			System.out.println("Selected index=" + comboGamesBox.getSelectedIndex()
			    	        + " Selected item=" + comboGamesBox.getSelectedItem());
			    		}
			    		
			    		else if(comboGamesBox.getSelectedItem()=="Orze³ i reszka"){
			    			System.out.println("Selected index=" + comboGamesBox.getSelectedIndex()
			    	        + " Selected item=" + comboGamesBox.getSelectedItem());
			    		}
			    		
			    		else if(comboGamesBox.getSelectedIndex()==2){
			    			System.out.println("Selected index=" + comboGamesBox.getSelectedIndex()
			    	        + " Selected item=" + comboGamesBox.getSelectedItem());
			    		}
			    		
			    		else if(comboGamesBox.getSelectedIndex()==3){
			    			System.out.println("Selected index=" + comboGamesBox.getSelectedIndex()
			    	        + " Selected item=" + comboGamesBox.getSelectedItem());
			    		}
			      }
		      });
		
		startButton = new JButton("START GAME");
		startButton.addActionListener(this);
		add(startButton);
		
		musicButton = new JButton("MUSIC ON");
		musicButton.addActionListener(this);
		add(musicButton);
		
		exit = new JButton("EXIT");
		exit.addActionListener(this);
		add(exit);
		
		
		timePanel = new JPanel();
		timePanel.setBorder(BorderFactory.createTitledBorder("Time:")); 
		timePanel.setPreferredSize(new Dimension(50,50));
		timePanel.setBackground(new Color(255, 0 ,0)); 
		timePanel.add(timelabel);
		add(timePanel);
		
		
		threadtimer.start();
				
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	
	
	private void createMenuPanels(JPanel jpanel, JComboBox<String> jcombobox, String string){
		jpanel = new JPanel();
					

		jpanel.setBackground(new Color(255, 0 ,0)); 
		jpanel.setBorder(BorderFactory.createTitledBorder(string)); 
		
		jpanel.setPreferredSize(new Dimension(300,70));
		jpanel.add(jcombobox);
		
		
		
		add(jpanel);
	}
	
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		
		if(((AbstractButton) source).getText() == "EXIT"){
			timer.getState = false;
		}
		
		if(((AbstractButton) source).getText() == "MUSIC ON"){
			
			
			thread.start();
			music.getState = true;	
						
			((AbstractButton) source).setText("MUSIC OFF");
			((AbstractButton)source).repaint();
				
		}
		
		else if(((AbstractButton) source).getText() == "MUSIC OFF"){
			thread.stop();
			music.getState = false;
			((AbstractButton) source).setText("MUSIC ON");
			((AbstractButton)source).repaint();
				
		}
		
		if(((AbstractButton) source).getText() == "START GAME"){
			System.out.println("ok");
			
			callPlayer(comboPlayersBox.getSelectedIndex(),"P1");
			setPlayersNames(comboGamesBox.getSelectedIndex());
			
			
			callGame(comboGamesBox.getSelectedIndex());
			//round = Integer.parseInt( JOptionPane.showInputDialog(null,"Ile rund chcesz rozegraæ: "));
				if(round == 4)
				{
					System.out.println("xD");
				}
		}		
	}
	
	public void callPlayer(int typGracza, String playerName){
		
		if(typGracza == 0){
			player1 = new Przedszkolak(playerName,100,100);
			player2 = new Przedszkolak("Komputer",100,100);
			System.out.println(player1.timeLimit);

		}
		
		else if(typGracza == 1){
			player1 = new Uczen(playerName,100,100);
			player2 = new Uczen("Komputer",100,100);
		}
			
		else if(typGracza == 2){
			player1 = new Student(playerName,100,100);
			player2 = new Student("Komputer",100,100);
		}	
			
	}
	
	private void setPlayersNames(int gra){
		player1.setName();
		if(gra==0)
			player2.setName();
	}
	
	public void callGame(final int gra){
		round = Integer.parseInt( JOptionPane.showInputDialog(null,"Ile rund chcesz rozegraæ: "));
		EventQueue.invokeLater(new Runnable(){

			public void run(){
				new GameClass(player1,player2,gra,round);
			}
		});
	}
	
}

