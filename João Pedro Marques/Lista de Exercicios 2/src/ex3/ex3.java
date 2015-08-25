package ex3;

import javax.swing.JOptionPane;

public class ex3 {
	public static void main(String[] args){
		
		int x;
		int y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: "));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: "));
		
		if(x>y){
			JOptionPane.showMessageDialog(null,"o número " +x+ "é maior que" +y);
		
		}else{
			JOptionPane.showMessageDialog(null,"o número "+x+ " é menor que " +y);
		}
		
	
	}
}
