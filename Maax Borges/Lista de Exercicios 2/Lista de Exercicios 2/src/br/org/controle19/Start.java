package br.org.controle19;


import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a sua idade ."));
		
		if(n1 < 5.00){
			JOptionPane.showMessageDialog(null, "Não tem idade o suficiente . ");
		
		}else if (n1 >=5 && n1 <= 7 ){
			JOptionPane.showMessageDialog(null, "Classificado como : infantil . ");	
		
		}else if (n1 >= 8  && n1 <= 10 ){
			JOptionPane.showMessageDialog(null, "Classificado como : juvanil ");
			
		}else if (n1 >= 11 && n1 <= 15 ){
			JOptionPane.showMessageDialog(null, "Classificado como : adolescente ");
			
		}else if (n1 > 16 && n1 <= 30){
			JOptionPane.showMessageDialog(null, "Classificado como  : Adulto" );
			
		}else if (n1 > 30){
			JOptionPane.showMessageDialog(null, "Classificado como : Senior" );
		}
	}
}