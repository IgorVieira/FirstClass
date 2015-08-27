package Condicional;

import javax.swing.JOptionPane;

public class ex16 {
	
public static void main(String[]args){
	
	
	float x , y , z;
	
	x = Float.parseFloat(JOptionPane.showInputDialog(null,"Preço atual do produto: R$"));
	
	if(x==30.0 || x<30.0){
		JOptionPane.showMessageDialog(null, "O produto não tem descoto");
	}else if(x==100.0 || x<100.0 && x>30.0){
		y = (float) (x*0.1);
		z = (float) (x-y);
		JOptionPane.showMessageDialog(null,"O valor do desconto é R$"+y
				+ "\n O novo preço é R$"+z);
	}else{
		y = (float) (x*0.15);
		z = (float) (x-y);
		JOptionPane.showMessageDialog(null,"O valor do desconto é R$"+y
				+ "\n O novo preço é R$"+z);

	}
}

}
