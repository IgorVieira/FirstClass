package ex9;

import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n;
		float n2;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o saldo:"));
		
		if(n <= 200.0){
			n2=n+(n*10/100);
			JOptionPane.showMessageDialog(null,"O saldo com o aumento é :"+n2+"\nSaldo medio: "+n);
			}
		else if(n > 200 && n <= 300 ) {
			n2=n+(n*20/100);
			JOptionPane.showMessageDialog(null,"O saldo com o aumento é :"+n2+"\nSaldo medio: "+n);
		    }
		else if(n > 300 && n <= 400 ) {
			n2=n+(n*25/100);
			JOptionPane.showMessageDialog(null,"O saldo com o aumento é :"+n2+"\nSaldo medio: "+n);
		    }
		else if(n >400) {
			n2=n+(n*30/100);
			JOptionPane.showMessageDialog(null,"O saldo com o aumento é :"+n2+"\nSaldo medio: "+n);
		    }
		}

}