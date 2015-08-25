package ex10;

import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n;
		float n2;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor de fabrica o carro:"));
		
		if(n <= 12000.0){
			n2=n+(n*5/100);
			JOptionPane.showMessageDialog(null,"O valor do carro na distribuidora: "+n2);
			}
		else if(n > 12000 && n <= 25000 ) {
			n2=n+(n*10/100)+(n*15/100);
			JOptionPane.showMessageDialog(null,"O valor do carro na distribuidora: "+n2);
		    }
		else if(n > 25000) {
			n2=n+(n*20/100)+(n*15/100);
			JOptionPane.showMessageDialog(null,"O valor do carro na distribuidora: "+n2);
		    }
		
		}

}