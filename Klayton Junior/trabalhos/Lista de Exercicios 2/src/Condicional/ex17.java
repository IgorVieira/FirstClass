package Condicional;

import javax.swing.JOptionPane;

public class ex17 {

public static void main(String[]args){	


	int x;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua senha"));
	
	if(x==4531){
		JOptionPane.showMessageDialog(null, "Senha correta"
				+"\n Acesso permitido");
	}else{
		JOptionPane.showMessageDialog(null, "Senha incorreta"
				+"\n Acesso negado");
	}

}
}