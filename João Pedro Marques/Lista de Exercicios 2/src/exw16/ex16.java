package exw16;

import javax.swing.JOptionPane;

public class ex16 {
	public static void main(String[] args){
		
		float n;
		float r2;
		float r3;

		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto: "));

		
		r2 = (float) (n*0.10)+n;
		r3 = (float) (n*0.15)+n;	
		
		if(n<30){
			JOptionPane.showMessageDialog(null, "Sem desconto!: ");
		}else if(n>=30&& n<=100){
			JOptionPane.showMessageDialog(null, "NOVO PREÇO DO PRODUTO COM O DESCONTO É DE: "+r2);
		}else if(n>100){
			JOptionPane.showMessageDialog(null, "NOVO PREÇO DO PRODUTO COM O DESCONTO É DE: "+r3);
			
		}
	}
}