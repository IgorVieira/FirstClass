package Condicional;

import javax.swing.JOptionPane;

public class aula01 {

public static void main(String[] args){
	
	int x;
	
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
	
	
	if(x%2==0 && x>10){
		JOptionPane.showMessageDialog(null,"O número "+x+" é par e maior que 10");
	}else{
		
		JOptionPane.showMessageDialog(null, "O número "+x+" não atende as condições");
	}
	
	
	
	
	
}
	
	
	
}
