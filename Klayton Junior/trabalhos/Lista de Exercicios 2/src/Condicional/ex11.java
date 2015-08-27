package Condicional;

import javax.swing.JOptionPane;

public class ex11 {

public static void main(String[]args){
	
	float sal , saln;
	
	sal = Float.parseFloat(JOptionPane.showInputDialog(null,"Salário atual"));
	
	if(sal==300.0 || sal<300){
		saln = (float) (sal*1.15);
		JOptionPane.showMessageDialog(null,"Seu salário aumentou para: R$"+saln);
	}else if(sal==600 || sal>300 && sal<600){
		saln = (float) (sal*1.1);
		JOptionPane.showMessageDialog(null,"Seu salário aumentou para: R$"+saln);
	}else if(sal==900 || sal>600 && sal<900){
		saln = (float) (sal*1.05);
		JOptionPane.showMessageDialog(null,"Seu salário aumentou para: R$"+saln);
	}else{
		JOptionPane.showMessageDialog(null,"Seu salario não sofreu aumento");
	}
}
	
}
