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
				+ "\n Op��o 1 - M�dia dos dois n�meros"
				+ "\n Op��o 2 - a diferen�a do maior pelo menor"
				+ "\n Op�ao 3 - O produto entre os dois"
				+ "\n Op�ao 4 - A divis�o do primeiro pelo segundo"
				+ "\n Qual op��o desejada:"));
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um n�mero:"));
		y = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite mais um n�mero:"));
			
		
		if(z==1){
			o1 = (x+y)/2;
			JOptionPane.showMessageDialog(null, "A m�dia desses dois n�meros �: "+o1);
		}else if(z==2 && x>y){
			o2 = x-y; 
			JOptionPane.showMessageDialog(null, "A diferen�a do maior pelo menor �: "+o2);
		}else if(z==2 && x<y){
			o3 = y-x;
			JOptionPane.showMessageDialog(null, "A diferen�a do maior pelo menor �: "+o3);
		}else if(z==3){
			o4 = x*y;
			JOptionPane.showMessageDialog(null,"O produto ente os dois n�meros �: "+o4);
		}else if(z==4 ){
			o5 = x/y;
			if(z==4 && y==0){
				JOptionPane.showMessageDialog(null,"Nesta op��o o segundo n�mero deve ser diferente de zero");
			}
			JOptionPane.showMessageDialog(null,"A divis�o do primeiro pelo segundo n�mero �: "+o5);
		}else{
			JOptionPane.showMessageDialog(null,"Op��o invalidade");
		}
	  }
	}

