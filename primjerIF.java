package edunova;

import javax.swing.JOptionPane;

public class primjerIF {

	public static void main(String[] args) {
		
	int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
	
		
		if (i > 0) {
		
			System.out.println("Broj je pozitivan");
		}else {
			System.out.println("Broj je negativan");
		}	
			
	}

}
