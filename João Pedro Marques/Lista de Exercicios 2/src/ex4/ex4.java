package ex4;

import javax.swing.JOptionPane;

public class ex4 {
	public static void main(String[] args){
		
		int x;
		int y;
		int z;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero: "));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero: "));
		z = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro n�mero: "));
		
		if(x>y && x>z){
			JOptionPane.showMessageDialog(null,"o n�mero " +x+ "� maior que" +y+ "e maior que "+z);
		
		}else{
			JOptionPane.showMessageDialog(null,"o n�mero "+x+ " � menor que " +y);
		}
		
	
	}
}


