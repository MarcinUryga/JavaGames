package Players;

import javax.swing.JOptionPane;

public class Student extends Player{
    public Student(){
	name = "";
	punkty = 100;
	pieniadze = 100;
    typGracza = "Student";
    timeLimit = 120;
}

public Student(String _name, int _punkty, int _pieniadze){
	name = _name;
	punkty = _punkty;
	pieniadze = _pieniadze;
    typGracza = "Student";
    timeLimit = 120;
}

public void Komunikat_Wygranej(int punkty, int losuj_komunikat){
	switch(losuj_komunikat){	
	case 0: JOptionPane.showMessageDialog(null,"Studenciaku!!! " + name + " wygrales " + punkty+" pkt");break;
	case 1: JOptionPane.showMessageDialog(null,"Super brachu " + name + " wygrales " + punkty+" pkt");break;
	case 2: JOptionPane.showMessageDialog(null,name + " pewnie czujesz tak¹ radoœæ jak przy otwieraniu pierwszego piwa z czteropaka, zdobe³eœ " + punkty+" pkt");break;
	case 3: JOptionPane.showMessageDialog(null,name + " marnujesz siê na tych studiach powinieneœ obstawiaæ zak³ady buchmacherskie wygrales " + punkty+" pkt");break;
	}
}

public void Komunikat_Przegranej(int punkty, int losuj_komunikat){
	switch(losuj_komunikat){	
	case 0: JOptionPane.showMessageDialog(null,"Hahahaha! " + name + " powoli tracisz szansê na zwyciêstwo!");break;
	case 1: JOptionPane.showMessageDialog(null,name + " z takim szczêœciem to cud ¿e jeszcze studiujesz znowu zle wybra³eœ!");break;
	case 2: JOptionPane.showMessageDialog(null,name + " idz lepiej zbieraj z³om! W tej grze jesteœ beznadziejny!");break;
	case 3: JOptionPane.showMessageDialog(null,"Znowu jesteœ pijany? " + name + " jak mog³eœ dokonaæ takiego wyboru!!! Znowu upie*!#$%&^#! ");break;
	}
}

}
