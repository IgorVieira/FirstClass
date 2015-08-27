package Condicional;

import javax.swing.JOptionPane;

public class ex20 {
	
public static void main(String[]args){	

	
	int x;
	
	x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
	
	if(x==5 || x==7 || x==6){
		JOptionPane.showMessageDialog(null,"Sua categoria é: Infantil");
	}else if(x==8 || x==9 || x==10){
		JOptionPane.showMessageDialog(null, "Sua categoria é: Juvenil");
	}else if(x==11 || x==15 || x>11 && x<15){
		JOptionPane.showMessageDialog(null,"Sua categoria é: Adolescente");
	}else if(x==16 || x==30 || x<30 && x>16){
		JOptionPane.showMessageDialog(null, "Sua categoria é: Adulto");
	}else if(x>30){
		JOptionPane.showMessageDialog(null, "Sua categoria é: Sênior");
	}else{
		JOptionPane.showMessageDialog(null, "Você é muito novo para entrar em uma categoria de nadador");
	}


          






}


}