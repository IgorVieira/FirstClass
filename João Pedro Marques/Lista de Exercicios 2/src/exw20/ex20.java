package exw20;

import javax.swing.JOptionPane;

public class ex20 {
	public static void main(String[] args){
		int idade;	
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
		
		
		if(idade<5){
			JOptionPane.showMessageDialog(null,"Categoria: Infantil ");
		}else if(idade>=5&& idade<=7){
			JOptionPane.showMessageDialog(null,"Categoria: Infantil ");
		}else if(idade>=8&& idade<=10){
			JOptionPane.showMessageDialog(null,"Categoria: Juvenil ");
		}else if(idade>=11&& idade<=15){
			JOptionPane.showMessageDialog(null,"Categoria: Adolescente ");
		}else if(idade>=16&& idade<=30){
			JOptionPane.showMessageDialog(null,"Categoria: Adulto");
		}else if(idade>30){
			JOptionPane.showMessageDialog(null,"Categoria: Sênior");
		}
	}
}