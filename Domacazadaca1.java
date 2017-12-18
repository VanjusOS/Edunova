package edunova;

import javax.swing.JOptionPane;

public class Domacazadaca1 {

	public static void main(String[] args) {
		//unos broja sati i broja minuta i preracunavanje u ukupan broj sekundi
		
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sati"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj minuta"));
		
		int rez = a*3600 + b*60;
		
		System.out.println(rez + " "+ "sekundi");
		
	}

}
