package Condicional;

import javax.swing.JOptionPane;

public class aula1 {
	
	public static void main(String[] args){
		
		
		int x;
		
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));
		
		if(x%2==0){
			JOptionPane.showMessageDialog(null,"O número "+x+" é par");
			
			
				
		}else{
		
		JOptionPane.showMessageDialog(null,("O número "+x+" é ímpar"));
		
		}
		
		
		
	}
	
	
	

}
