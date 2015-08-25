package ex11;

import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1;
		float n2;
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário ."));
		
		if(n1 < 300.00){
			n2 = (float) (n1 +(n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
		
		}else if (n1 >300 && n1<= 600.00){
			n2 = (float) (n1 +(n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);	
		
		}else if (n1 > 600.00  && n1 <= 900.00){
			n2 = (float) (n1 +(n1 * 0.05));
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
			
		}else{
			n2 = n1;
			JOptionPane.showMessageDialog(null, "O salario com o aumento é : " + n2);
			
		}

			
}
}
