package Condicional;

import javax.swing.JOptionPane;

public class ex12 {

public static void main(String[]args){
	
	float salb , salr;
	 
	salb = Float.parseFloat(JOptionPane.showInputDialog(null,"Salário bruto:"));
	
	if(salb==350.0 || salb<350.0){
		salr = (float) ((salb +100.0)-(salb*0.07));
		JOptionPane.showMessageDialog(null,"Salário a receber: R$"+salr);
		
	}else if(salb==600 || salb>350 && salb<600){
		salr = (float) ((salb +75.0)-(salb*0.07));
		JOptionPane.showMessageDialog(null, "Salário a receber: R$"+salr);
	}else if(salb==900.0 || salb>600.0 && salb<900.0){
		salr = (float) ((salb +50.0)-(salb*0.07));
		JOptionPane.showMessageDialog(null,"Salário a receber: R$"+salr);
	}else{
		salr = (float) ((salb +35.0)-(salb*0.07));
		JOptionPane.showMessageDialog(null, "Salário a receber: R$"+salr);
	}
	
}
}
