package Condicional;

import javax.swing.JOptionPane;

public class ex3 {

public static void main(String[]args){
	
	int x;
	int y;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));
	y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número"));
	
	if(x<y){
		JOptionPane.showMessageDialog(null,"O número "+x+" é menor que o número "+y);
		
	}else{
		JOptionPane.showMessageDialog(null,"O número "+y+" é menor que o número "+x);
		
	}
}
	
	
	
}
