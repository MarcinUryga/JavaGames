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
	case 2: JOptionPane.showMessageDialog(null,name + " pewnie czujesz tak� rado�� jak przy otwieraniu pierwszego piwa z czteropaka, zdobe�e� " + punkty+" pkt");break;
	case 3: JOptionPane.showMessageDialog(null,name + " marnujesz si� na tych studiach powiniene� obstawia� zak�ady buchmacherskie wygrales " + punkty+" pkt");break;
	}
}

public void Komunikat_Przegranej(int punkty, int losuj_komunikat){
	switch(losuj_komunikat){	
	case 0: JOptionPane.showMessageDialog(null,"Hahahaha! " + name + " powoli tracisz szans� na zwyci�stwo!");break;
	case 1: JOptionPane.showMessageDialog(null,name + " z takim szcz�ciem to cud �e jeszcze studiujesz znowu zle wybra�e�!");break;
	case 2: JOptionPane.showMessageDialog(null,name + " idz lepiej zbieraj z�om! W tej grze jeste� beznadziejny!");break;
	case 3: JOptionPane.showMessageDialog(null,"Znowu jeste� pijany? " + name + " jak mog�e� dokona� takiego wyboru!!! Znowu upie*!#$%&^#! ");break;
	}
}

}
