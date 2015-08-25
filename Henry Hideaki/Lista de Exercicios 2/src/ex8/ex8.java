package ex8;

import javax.swing.JOptionPane;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n;
		float n2;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salario:"));
		
		if(n <= 300.0){
			n2=n+(n*35/100);
			JOptionPane.showMessageDialog(null,"O salario é de:"+n2+" com o aumento");
			}
		else {
			n2=n+(n*15/100);
			JOptionPane.showMessageDialog(null,"O salario é de:"+n2+" com o aumento");
		}
		
		}

}