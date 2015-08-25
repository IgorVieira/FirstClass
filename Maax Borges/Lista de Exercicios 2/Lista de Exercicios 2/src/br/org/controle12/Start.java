package br.org.controle12;


import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
	 
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço ."));
		
		if(n1 < 50.00){
			n2 = (float) (n1 +( n1 * 0.05));
			JOptionPane.showMessageDialog(null, "O novo preço é : " + n2);
			
			 if (n2 < 80.00){
			JOptionPane.showMessageDialog(null, " O novo preço é barato.");
		}
			
		
		}else if (n1 >50.00 && n1< 100.00){
			n2 = (float) (n1 +(n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O novo preço é : " + n2);	
		
			if (n2 > 80.00 && n2 <= 100.00){
			JOptionPane.showMessageDialog(null, " O novo preço é Normal.");
			}
			
		}else if (n1 > 100.00){
			n2 = (float) (n1 +(n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O novo preço é : " + n2);
			
			if (n2 > 120.00 && n2 <= 200.00 ){
				JOptionPane.showMessageDialog(null," O novo preço é caro.");
			
			}if (n2 > 200.00){
				JOptionPane.showMessageDialog(null, "O novo preço é muito caro.");
			}
			
			}
	}
}