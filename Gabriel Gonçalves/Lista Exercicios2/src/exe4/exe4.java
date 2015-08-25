package exe4;

import javax.swing.JOptionPane;

public class exe4 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
	
	n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro Número: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo Número: "));	
	n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro Número: "));	
		
	   if(n1>n2){
		   JOptionPane.showMessageDialog(null, "O número " +n1+ "é maior");
	   }
	   
	   if(n2>n3){
		   JOptionPane.showMessageDialog(null, "O número " +n2+ "é maior");
	   }
	   
	   else{
		   JOptionPane.showMessageDialog(null, "O número " +n3+ "é maior");
	   }
	}

}
