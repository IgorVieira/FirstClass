package Condicional;

import javax.swing.JOptionPane;

public class aula01 {

public static void main(String[] args){
	
	int x;
	
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero"));
	
	
	if(x%2==0 && x>10){
		JOptionPane.showMessageDialog(null,"O n�mero "+x+" � par e maior que 10");
	}else{
		
		JOptionPane.showMessageDialog(null, "O n�mero "+x+" n�o atende as condi��es");
	}
	
	
	
	
	
}
	
	
	
}
