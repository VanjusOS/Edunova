package edunova;

import javax.swing.JOptionPane;

public class Domacazadaca3 {

	public static void main(String[] args) {
	// unos broja sekundi, te ispis u satima, minutama, sekundama
		
		int unesenibrojsekundi = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sekundi"));
		
		int brojsati = unesenibrojsekundi/3600;
		int brojminuta = unesenibrojsekundi%3600/60;
		int brojsekundi = unesenibrojsekundi%3600%60;
		
		
		
		
		System.out.println(brojsati +"h" +" " + brojminuta + "min"+ " " + brojsekundi + "sek");	
		
	}

}
