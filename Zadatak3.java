package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	// Napi�ite program koji za dva unesena broja ispisuje njihov produkt

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("prvi"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("drugi"));

		int rez = a * b;

		System.out.println(rez);

		// napi�ite najkra�i mogu�i na�in rje�enja ovog zadatka
		System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Prvi"))
				* Integer.parseInt(JOptionPane.showInputDialog("drugi")));

	}

}
