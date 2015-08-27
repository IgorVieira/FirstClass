package Condicional;

import javax.swing.JOptionPane;

public class ex4 {

public static void main(String[] args){
	
	int x;
	int y;
	int z;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro número:"));
	y = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo número:"));
	z = Integer.parseInt(JOptionPane.showInputDialog(null,"Tercéiro número:"));
	
	if(x>y && x>z){
		JOptionPane.showMessageDialog(null,"O número "+x+" é o maior");
	
		
	}
	else if(y>x && y>z){
		JOptionPane.showMessageDialog(null, "O número "+y+" é o maior");
	}
	else{
		JOptionPane.showMessageDialog(null, "O número "+z+" é o maior");
	}
	
}
	
}
