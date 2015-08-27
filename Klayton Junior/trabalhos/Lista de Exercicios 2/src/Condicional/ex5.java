package Condicional;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args){
		
		float x;
		float y;
		float z;
		float o1;
		float o2;
		float o3;
		float o4;
		float o5;
				
		z = Float.parseFloat(JOptionPane.showInputDialog(null,""
				+ "\n Opção 1 - Média dos dois números"
				+ "\n Opção 2 - a diferença do maior pelo menor"
				+ "\n Opçao 3 - O produto entre os dois"
				+ "\n Opçao 4 - A divisão do primeiro pelo segundo"
				+ "\n Qual opção desejada:"));
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um número:"));
		y = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite mais um número:"));
			
		
		if(z==1){
			o1 = (x+y)/2;
			JOptionPane.showMessageDialog(null, "A média desses dois números é: "+o1);
		}else if(z==2 && x>y){
			o2 = x-y; 
			JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é: "+o2);
		}else if(z==2 && x<y){
			o3 = y-x;
			JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é: "+o3);
		}else if(z==3){
			o4 = x*y;
			JOptionPane.showMessageDialog(null,"O produto ente os dois números é: "+o4);
		}else if(z==4 ){
			o5 = x/y;
			if(z==4 && y==0){
				JOptionPane.showMessageDialog(null,"Nesta opção o segundo número deve ser diferente de zero");
			}
			JOptionPane.showMessageDialog(null,"A divisão do primeiro pelo segundo número é: "+o5);
		}else{
			JOptionPane.showMessageDialog(null,"Opção invalidade");
		}
	  }
	}

