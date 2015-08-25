package ex14;

import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float n1;
		float n2;
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário ."));
		
		if(n1 < 300.00){
			n2 = (float) (n1 +(n1 * 0.50));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
		
		}else if (n1 >300 && n1<= 500.00){
			n2 = (float) (n1 +(n1 * 0.40));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);	
		
		}else if (n1 > 500.00  && n1 <= 700.00){
			n2 = (float) (n1 +(n1 * 0.30));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
			
		}else if (n1 > 700.00 && n1 <= 800.00){
			n2 = (float) (n1 + (n1 * 0.20));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
			
		}else if (n1 > 800.00 && n1 <= 1000.00){
			n2 = (float) (n1 + (n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
			
		}else {
			n2 = (float) (n1 + (n1 * 0.05));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
		}
	}
}