package edunova;

import javax.swing.JOptionPane;

public class Domacazadaca2 {

	public static void main(String[] args) {
		//unos stranica pravokutnika i izracuvavanje povrsine i opsega
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi sirinu pravokutnika"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi duljinu pravokutnika"));
		
		int povrsina = a*b;
		int opseg = 2*a+2*b;
		
		System.out.println("povrsina je" + " " + povrsina);
		System.out.println("opseg je" + " " + opseg);

		
		
	}

}
