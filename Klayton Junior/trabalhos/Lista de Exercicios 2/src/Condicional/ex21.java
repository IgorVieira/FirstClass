package Condicional;

import javax.swing.JOptionPane;

public class ex21 {

	
public static void main(String[]args){	


	int c;
	float p;
	
	
	p = Float.parseFloat(JOptionPane.showInputDialog(null,"Preço do produto R$ "));
	c = Integer.parseInt(JOptionPane.showInputDialog(null,"Código de origem"
			+ "\n Sendo de 1 a 30"));
	
	
	if(c==1){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Sul");
	}else if(c==2){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Norte");
	}else if(c==3){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Leste");
	}else if(c==4){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Oeste");
	}else if(c==5 || c==6){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Nordeste");
	}else if(c==7 || c==8 || c==9){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Sudeste");
	}else if(c==10 || c==20 || c>10 && c<20){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Centro-Oeste");
		
	}else if(c==21 || c==30 || c>21 && c<30){
		JOptionPane.showMessageDialog(null,"O produto que custa "+p
				+"\n tem procedência do Nordeste");
	}



}
}