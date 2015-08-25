package ex3;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n;
		float n2;
		
		 n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero:"));
		 n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro numero:"));
		 
		if(n>n2){
			JOptionPane.showMessageDialog(null,"O numero"+n2+"é menor" );
		}
		else{
			JOptionPane.showMessageDialog(null,"O numero"+n+"é menor" );}
		

	}

}
