package DecorateTheView;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HeadsAndTailsDecorator extends ViewDecorator{

	
	public HeadsAndTailsDecorator(InterfaceView dekorowanyWidok) {
		super(dekorowanyWidok);
		// TODO Auto-generated constructor stub
	}

	public JLabel setTheGameBackground(int WIDTH, int HEIGHT) {
		Image icon = new ImageIcon(getClass().getResource("/coins.jpg")).getImage();

		ImageIcon bg = new ImageIcon(icon);
		JLabel background=new JLabel(bg);
        background.setOpaque(true);
        background.setBounds(0,0,WIDTH,HEIGHT);
        return background;
	}

}
