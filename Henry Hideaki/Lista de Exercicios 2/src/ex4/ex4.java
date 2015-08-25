package ex4;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float n;
	float n2;
	float n3;
	
	n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero:"));
	n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro numero:"));
	n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro numero:"));
	
	if(n>n2&&n>n3){
		JOptionPane.showMessageDialog(null,"O numero"+n+" é maior");
		}
	else if(n2>n&&n2>n3){
		JOptionPane.showMessageDialog(null,"O numero"+n2+" é maior");
	}
	else{
		JOptionPane.showMessageDialog(null,"O numero"+n3+" é maior");}
	}

}
