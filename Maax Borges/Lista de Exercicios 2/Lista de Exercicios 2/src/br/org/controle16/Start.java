package br.org.controle16;


import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a senha ."));
		
		if(n1 != 4531){
			JOptionPane.showMessageDialog(null, "Senha Incorreta, acesso negado .");
		
		}else if (n1 == 4351){
			JOptionPane.showMessageDialog(null, "Senha Correta, acesso liberado .");	
		
		}
		}
	    }