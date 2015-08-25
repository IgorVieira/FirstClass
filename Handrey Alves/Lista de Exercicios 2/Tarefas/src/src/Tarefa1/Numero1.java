package src.Tarefa1;

import javax.swing.JOptionPane;

public class Numero1 {
	public static void main(String[]args){
		
	double n, n2, n3, n4, m;
	
	n = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1"));
	n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 2"));
	n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 3"));
	n4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 4"));
	
	m = ( n + n2 + n3 + n4 )/4;
	
	if(m >= 7.0){
		JOptionPane.showMessageDialog(null, "Sua media foi "+m+" . Voce esta aprovado");	
	}else{
		JOptionPane.showMessageDialog(null, "Sua media foi "+m+" . Voce esta reprovado");
	}
	
	}
}
