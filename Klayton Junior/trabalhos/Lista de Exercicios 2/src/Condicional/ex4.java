package Condicional;

import javax.swing.JOptionPane;

public class ex4 {

public static void main(String[] args){
	
	int x;
	int y;
	int z;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro n�mero:"));
	y = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo n�mero:"));
	z = Integer.parseInt(JOptionPane.showInputDialog(null,"Terc�iro n�mero:"));
	
	if(x>y && x>z){
		JOptionPane.showMessageDialog(null,"O n�mero "+x+" � o maior");
	
		
	}
	else if(y>x && y>z){
		JOptionPane.showMessageDialog(null, "O n�mero "+y+" � o maior");
	}
	else{
		JOptionPane.showMessageDialog(null, "O n�mero "+z+" � o maior");
	}
	
}
	
}
