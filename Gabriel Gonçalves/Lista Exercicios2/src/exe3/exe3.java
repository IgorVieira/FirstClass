package exe3;

import javax.swing.JOptionPane;

public class exe3 {
	public static void main(String[] args){
		int n1;
		int n2;
		
	n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro N�mero: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo N�mero: "));
	
	if(n1<n2){
		JOptionPane.showMessageDialog(null, "O numero " +n1+ " � menor");
	}
	
	else{
		JOptionPane.showMessageDialog(null, "O n�mero " +n2+ " � menor");
	}
		
		
		
		
		
	}
}
