package Condicional;

import javax.swing.JOptionPane;

public class ex7 {

public static void main(String[]args){
	
	
	float sal;
	float salr;
	
	sal = Float.parseFloat(JOptionPane.showInputDialog(null,"Salário inicial:"));
	
	if(sal>500.00){
		salr = (float) (1.3*sal);
		JOptionPane.showMessageDialog(null, "Seu salário aumentou para R$"+salr);
	}else{
		JOptionPane.showMessageDialog(null, "Seu salário não sofreu aumento");
	}
	
}
	
}
