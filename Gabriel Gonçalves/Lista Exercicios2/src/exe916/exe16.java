package exe916;

import javax.swing.JOptionPane;

public class exe16 {

	public static void main(String[] args) {
		float p;
		float r;
		
		p = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do produto: "));
	
		if(p >=0 && p <=30){ 
			JOptionPane.showMessageDialog(null, "Valor Final sem desconto: " +p);
							}
		if(p >30 && p <=100){  r = (int) (p-(p*0.10));
			JOptionPane.showMessageDialog(null, "O Valor final com desconto de 10%: " +r);
							}

		else{r = (int) (p-(0.15*p));
			JOptionPane.showMessageDialog(null, "O Valor final com desconto de 15%: " +r);
			}

	}

}
