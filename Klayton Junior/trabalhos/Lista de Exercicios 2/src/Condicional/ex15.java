package Condicional;

import javax.swing.JOptionPane;

public class ex15 {

public static void main(String[]args){
	
	int x;
	float y , z;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "\n Op��o 1 - Poupan�a"
			+ "\n Op��o 2 - Fundo de renda fixa"
			+ "\n Digite a op��o de investimento desejada"));
	y = Float.parseFloat(JOptionPane.showInputDialog(null,"Quantidade que ser� investida: R$"));
	
	if(x==1){
		z = (float) (y*0.03);
		JOptionPane.showMessageDialog(null,"Seu rendimento mensal ser� de: R$"+z);
	}else{
		z = (float) (y*0.04);
		JOptionPane.showMessageDialog(null,"Seu rendimento mensal ser� de: R$"+z);
	}
	
}
}
