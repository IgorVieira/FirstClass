package ex17;

import javax.swing.JOptionPane;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1;
		
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a senha ."));
		
		if(n1 != 4531){
			JOptionPane.showMessageDialog(null, "Senha Incorreta");
		
		}else {
			JOptionPane.showMessageDialog(null, "Senha Correta");	
		
		}
		}
	    }