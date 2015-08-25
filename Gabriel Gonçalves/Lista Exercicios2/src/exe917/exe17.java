package exe917;

import javax.swing.JOptionPane;

public class exe17 {

	public static void main(String[] args) {
		int t;
		int s;
		
	t = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha: "));
	
	if(t == 4531){
		JOptionPane.showMessageDialog(null, "Acesso Permitido");
	}
	else{
		JOptionPane.showMessageDialog(null, "Acesso Bloqueado");	
		}
	}

}
