package jakiesGlupoty;


import java.awt.EventQueue;
import java.io.IOException;


public class main {
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				new GameClass(null, null, 5, 0);
			}
		});
		
	}
}