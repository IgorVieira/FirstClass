package exe4;

import javax.swing.JOptionPane;

public class exe4 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
	
	n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro N�mero: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo N�mero: "));	
	n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro N�mero: "));	
		
	   if(n1>n2){
		   JOptionPane.showMessageDialog(null, "O n�mero " +n1+ "� maior");
	   }
	   
	   if(n2>n3){
		   JOptionPane.showMessageDialog(null, "O n�mero " +n2+ "� maior");
	   }
	   
	   else{
		   JOptionPane.showMessageDialog(null, "O n�mero " +n3+ "� maior");
	   }
	}

}
