package ex7;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n;
		float n2;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salario:"));
		
		if(n < 500.0){
			n2=n+(n*3/10);
			JOptionPane.showMessageDialog(null,"O salario é de:"+n2+" com o aumento");
			}
		else {
			JOptionPane.showMessageDialog(null,"Nao precisa do aumento");
		}
		
		}

}