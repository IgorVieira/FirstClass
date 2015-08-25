package ex4;

import javax.swing.JOptionPane;

public class ex4 {
	public static void main(String[] args){
		
		int x;
		int y;
		int z;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: "));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: "));
		z = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro número: "));
		
		if(x>y && x>z){
			JOptionPane.showMessageDialog(null,"o número " +x+ "é maior que" +y+ "e maior que "+z);
		
		}else{
			JOptionPane.showMessageDialog(null,"o número "+x+ " é menor que " +y);
		}
		
	
	}
}


