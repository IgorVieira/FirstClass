package exw17;

import javax.swing.JOptionPane;

public class ex17 {
	public static void main(String[] Args){
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha: "));
		
		if(n==4531){
			JOptionPane.showMessageDialog(null, "Acesso permitido");
		}else if(n!=4531){
			JOptionPane.showMessageDialog(null, "Acesso negado");
		}
	}

}
