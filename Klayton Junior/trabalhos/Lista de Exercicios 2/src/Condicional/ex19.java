package Condicional;

import javax.swing.JOptionPane;

public class ex19 {
	
public static void main(String[]args){

	
	float g , h , p;
	
	g = Float.parseFloat(JOptionPane.showInputDialog(null,"Op��o 1 - Masculino"
			+"\n Op��o 2 - Feminino"
			+ "\n G�nero:"));
	h = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua altura"));
	
	if(g==1){
		p = (float) ((72.7*h)-58);
		JOptionPane.showMessageDialog(null,"O peso ideal para voc� �: "+p);
	}else{
		p = (float) ((62.1*h)-44.7);
	}
	
}

}
