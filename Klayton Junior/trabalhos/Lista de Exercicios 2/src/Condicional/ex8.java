package Condicional;

import javax.swing.JOptionPane;

public class ex8 {

public static void main(String[]args){
	
	float sal , salr;
	
	sal = Float.parseFloat(JOptionPane.showInputDialog(null,"Salário inicial:"));
	
	if(sal<300.0 && sal==300){
		salr = (float) (sal*1.35);
		JOptionPane.showMessageDialog(null, "Seu salário foi reajustado para R$ "+salr);
	}else{
		salr = (float) (sal*1.15);
		JOptionPane.showMessageDialog(null, "Seu salário foi reajustado para R$ "+salr);
	}
}
}
