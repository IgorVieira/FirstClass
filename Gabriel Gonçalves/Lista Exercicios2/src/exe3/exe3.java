package exe3;

import javax.swing.JOptionPane;

public class exe3 {
	public static void main(String[] args){
		int n1;
		int n2;
		
	n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro Número: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo Número: "));
	
	if(n1<n2){
		JOptionPane.showMessageDialog(null, "O numero " +n1+ " é menor");
	}
	
	else{
		JOptionPane.showMessageDialog(null, "O número " +n2+ " é menor");
	}
		
		
		
		
		
	}
}
