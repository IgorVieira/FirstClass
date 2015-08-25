package exe921;

import javax.swing.JOptionPane;

public class exe21 {

	public static void main(String[] args) {
		int p;
		float p1;
		
	p = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o Codigo do Produto: "));
	p1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço do Produto: "));
	
	if(p == 1){
		JOptionPane.showMessageDialog(null, "Procedencia: Sul ");
	}
	
	if(p == 2){
		JOptionPane.showMessageDialog(null, "Procedencia: Norte ");
	}	
	
	if(p == 3){
		JOptionPane.showMessageDialog(null, "Procedencia: Leste ");
	}
	
	if(p == 4){
		JOptionPane.showMessageDialog(null, "Procedencia: Oeste ");
	}
	
	if(p == 5 && p == 6){
		JOptionPane.showMessageDialog(null, "Procedencia: Nordeste ");
	}
	
	if(p >=7 && p <=9){
		JOptionPane.showMessageDialog(null, "Procedencia: Sudeste ");
	}
	
	if(p >=10 && p <=20){
		JOptionPane.showMessageDialog(null, "Procedencia: Centro - Oeste ");
	}
	
	if(p >= 21 && p <=30){
		JOptionPane.showMessageDialog(null, "Procedencia: Nordeste ");
	}
	
	}

}
