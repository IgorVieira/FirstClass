package src.Tarefa16;

import javax.swing.JOptionPane;

public class Fasdasd {
	public static void main(String[] args) {

		double n, r;

		n = Double.parseDouble(JOptionPane.showInputDialog(null, "pre�o :"));

		if (n <= 30.0) {
		r = n;
		JOptionPane.showMessageDialog(null,  "novo pre�o :" +r);
	
		}else if(n > 30.0 && n <= 100.0){
		r = n - (n * 0.1);
		JOptionPane.showMessageDialog(null,  "novo pre�o :" +r);
		
		}else{
		r = n - (n * 0.15);
		JOptionPane.showMessageDialog(null,  "novo pre�o :" +r);
		}

	}

}
