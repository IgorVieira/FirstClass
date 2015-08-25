package br.org.controle17;


import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
	
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a sua idade ."));
		
		if(n1 < 18){
			JOptionPane.showMessageDialog(null, "Você ainda é de menor. ");
		
		}else if (n1 > 18 ){
			JOptionPane.showMessageDialog(null, "Você já é de maior. ");	
		
		}
		}
	    }