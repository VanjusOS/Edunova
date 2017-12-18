package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	// Napišite program koji za dva unesena broja ispisuje njihov produkt

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("prvi"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("drugi"));

		int rez = a * b;

		System.out.println(rez);

		// napišite najkraæi moguæi naèin rješenja ovog zadatka
		System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Prvi"))
				* Integer.parseInt(JOptionPane.showInputDialog("drugi")));

	}

}
