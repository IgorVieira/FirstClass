package exe918;

import javax.swing.JOptionPane;

public class exe18 {

	public static void main(String[] args) {
		int i;

	i = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua Idade: "));
	
	if(i >=18){
		JOptionPane.showMessageDialog(null, "Maioridade Confirmada");
	}
	
	else{
		JOptionPane.showMessageDialog(null, "Menor de Idade");
	}
	
	
	
	
	
	}

}
