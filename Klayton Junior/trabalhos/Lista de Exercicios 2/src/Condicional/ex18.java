package Condicional;

import javax.swing.JOptionPane;

public class ex18 {

public static void main (String[]args){
	
	int x;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
	
	if(x==18 || x>18){
		JOptionPane.showMessageDialog(null, "Você é maior de idade");
	}else{
		JOptionPane.showMessageDialog(null, "Você ainda não é maior de idade");
	}
	
}
}
