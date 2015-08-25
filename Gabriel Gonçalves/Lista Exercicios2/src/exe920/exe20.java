package exe920;

import javax.swing.JOptionPane;

public class exe20 {

	public static void main(String[] args) {
		int i;
		
	i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Idade do Nadator: "));
	
	if(i <5){
		JOptionPane.showMessageDialog(null, "Permitido a partir de 5 anos");
	}
	
	if(i >=5 && i<=7){
		JOptionPane.showMessageDialog(null, "Infantil");
	}
	
	if(i >=8 && i<=10){
		JOptionPane.showMessageDialog(null, "Juvenil");
	}
	
	if(i >=11 && i<=15){
		JOptionPane.showMessageDialog(null, "Adolescente");
	}
	
	if(i>=16 && i<=30){
		JOptionPane.showMessageDialog(null, "Adulto");
	}
	
	if(i >30){
		JOptionPane.showMessageDialog(null, "Sênior");
	}
	
	
	
	}

}
