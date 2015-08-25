package src.Tarefa3;

import javax.swing.JOptionPane;

public class Dasdfs {
public static void main(String[]args){
	
	float n, n2;
	
	n = Float.parseFloat(JOptionPane.showInputDialog(null, "numero 1:"));
	n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "numero 2:"));
	
	if(n < n2){
	 JOptionPane.showMessageDialog(null, "o numero "+n+" é menor");
	 
	}else{
	 JOptionPane.showMessageDialog(null, "o numero "+n2+" é menor");
		
		
		
	}
	
	
	
	
	
}
}
