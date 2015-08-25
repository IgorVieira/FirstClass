package exw18;

import javax.swing.JOptionPane;

public class ex18 {
	public static void main(String[] args){
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque sua idade: "));
		
		if(idade>=18){
			JOptionPane.showMessageDialog(null, "Maioridade!");
		}else if(idade<18){
			JOptionPane.showMessageDialog(null, "Menoridade!");
		}
	}
}
