package Condicional;

import javax.swing.JOptionPane;

public class ex3 {

public static void main(String[]args){
	
	int x;
	int y;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero:"));
	y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro n�mero"));
	
	if(x<y){
		JOptionPane.showMessageDialog(null,"O n�mero "+x+" � menor que o n�mero "+y);
		
	}else{
		JOptionPane.showMessageDialog(null,"O n�mero "+y+" � menor que o n�mero "+x);
		
	}
}
	
	
	
}
