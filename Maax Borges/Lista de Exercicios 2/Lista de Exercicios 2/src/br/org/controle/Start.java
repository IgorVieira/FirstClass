package br.org.controle;

import javax.swing.JOptionPane;

public class Start {
public static void main(String[] args){
	
	
	float x;
	float x1;
	float x2;
	float x3;
	float media;
	
	
	x = Float. parseFloat(JOptionPane.showInputDialog(null,"Nota 1"));
	x1 = Float. parseFloat(JOptionPane.showInputDialog(null,"Nota 2"));
	x2 = Float. parseFloat(JOptionPane.showInputDialog(null,"Nota 3"));
	x3 = Float. parseFloat(JOptionPane.showInputDialog(null,"Nota 4"));
	
	media = (x + x1 +x2+x3)/4;
	
    if (media >= 7.0){

		JOptionPane.showMessageDialog(null,"Aprovado");	
	}else{
		JOptionPane.showMessageDialog(null,"Reprovado");	
	}
}
}
