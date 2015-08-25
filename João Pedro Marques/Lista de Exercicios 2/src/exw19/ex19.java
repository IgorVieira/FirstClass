package exw19;

import javax.swing.JOptionPane;

public class ex19 {
	public static void main(String[] args){
		float altura;
		int menu;
		float r1;
		float r2;
		
		menu = Integer.parseInt(JOptionPane.showInputDialog(null,"escolha seu sexo:"
				+ "\n 1 - Masculino"
				+ "\n 2 - Feminino"));
		
		altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura: "));
		
		r1 = (float) ((72.7*altura)-58);
		r2 = (float) ((62.1*altura)-44.7);
		
		if(menu==1){
			JOptionPane.showMessageDialog(null,"Seu peso ideal é: "+r1);
		}else if(menu==2){
			JOptionPane.showMessageDialog(null, "Seu peso ideal é de:"+r2);
		}
	}

}
