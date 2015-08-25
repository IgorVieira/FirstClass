package exe910;

import javax.swing.JOptionPane;

public class exe10 {

	public static void main(String[] args) {
		float p;
		float r1;
		
		
		p = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o o custo de fabrica do Carro: "));
		
		if(p <= 12.000){ r1 = (float) ((p*0.05)+p);
			JOptionPane.showMessageDialog(null, "O preço do Carro isento de impostos é: " +r1);
		}
		
		if(p >12.000 && p <=25.000){ r1 = (float) ((p*0.10)+(p*0.15)+p);
		JOptionPane.showMessageDialog(null, "O preço do Carro com 15% de impostos: " +r1);
	}
		
		if(p >25.000){ r1 = (float) ((p*0.15)+(p*0.20)+p);
		JOptionPane.showMessageDialog(null, "O preço do Carro com 20% de impostos é: " +r1);
	}
	}

}
