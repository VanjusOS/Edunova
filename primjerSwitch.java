package edunova;

import javax.swing.JOptionPane;

public class primjerSwitch {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi redni broj dana u tjednu"));

		switch (i) {
		case 1:
			System.out.println("Ponedjeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Srijeda");
			break;
		case 4:
			System.out.println("Cetvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedjelja");
			break;
		default:
			System.out.println("krivi unos");

		}

	}

}
