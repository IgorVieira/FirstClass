package ex12;

import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1;
		float n2;
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário ."));
		
		if(n1 < 350.00){
			n2 = (float) (n1 -(n1 * 0.07)) + 100;
			JOptionPane.showMessageDialog(null, "O salario mais o desconto é : " + n2);
		
		}else if (n1 >350 && n1<= 600.00){
			n2 = (float) (n1 -(n1 * 0.07)) + 75;
			JOptionPane.showMessageDialog(null, "O salario mais o desconto é : " + n2);	
		
		}else if (n1 > 600.00  && n1 <= 900.00){
			n2 = (float) (n1 -(n1 * 0.07)) + 50;
			JOptionPane.showMessageDialog(null, "O salario mais o desconto é : " + n2);
			
		}else {
			n2 = (float) (n1 - (n1 * 0.07));
			JOptionPane.showMessageDialog(null, "O salario mais o desconto é : " + n2);
			
		}
	}
}