package ex3;

import javax.swing.JOptionPane;

public class ex3 {
	public static void main(String[] args){
		
		int x;
		int y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero: "));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero: "));
		
		if(x>y){
			JOptionPane.showMessageDialog(null,"o n�mero " +x+ "� maior que" +y);
		
		}else{
			JOptionPane.showMessageDialog(null,"o n�mero "+x+ " � menor que " +y);
		}
		
	
	}
}
