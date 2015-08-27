package Condicional;

import javax.swing.JOptionPane;

public class ex15 {

public static void main(String[]args){
	
	int x;
	float y , z;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "\n Opção 1 - Poupança"
			+ "\n Opção 2 - Fundo de renda fixa"
			+ "\n Digite a opção de investimento desejada"));
	y = Float.parseFloat(JOptionPane.showInputDialog(null,"Quantidade que será investida: R$"));
	
	if(x==1){
		z = (float) (y*0.03);
		JOptionPane.showMessageDialog(null,"Seu rendimento mensal será de: R$"+z);
	}else{
		z = (float) (y*0.04);
		JOptionPane.showMessageDialog(null,"Seu rendimento mensal será de: R$"+z);
	}
	
}
}
