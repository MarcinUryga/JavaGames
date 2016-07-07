package Threads;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music implements Runnable{
	
	static File Sound = new File("muzyka.wav");
	public Clip clip;
	public boolean getState = false;
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void run(){
		do{
			try
	        {
	            clip = AudioSystem.getClip();
	            clip.open(AudioSystem.getAudioInputStream(Sound));
	            clip.start();
	           
	            
	            if(!getState){
	            	clip.stop();
	    		}
	            Thread.sleep(clip.getMicrosecondLength()/1000);
	        }
			
			
	        catch(Exception e)
	        {
	 
	        }	
		}while(getState);
		
		
	}	
	
}
