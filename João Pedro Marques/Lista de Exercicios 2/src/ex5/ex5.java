package ex5;

import javax.swing.JOptionPane;

public class ex5 {
public static void main(String[] args){
		
		float n1;
		float n2;
		float r1;
		float r2;
		float r3;
		float r4;
		int x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Um das op��es abaixo:"
				+ "\n 1 - m�dia"
				+ "\n 2 - diferen�a"
				+ "\n 3 - produto"
				+ "\n 4 - divis�o "));
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero: "));	
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo n�mero: "));
		
		
		
	
	if(x <1 || x>4){
		JOptionPane.showMessageDialog(null,"Op��o inv�lida! ");
	}
		
	
	
			if(x==1){
				r1 = (n1+n2)/2;
				JOptionPane.showMessageDialog(null," A m�dia dos n�meros digitados �: "+r1);
			}else if(x==2){
				r2 = n1 - n2;
				JOptionPane.showMessageDialog(null,"\nA diferen�a  entre o n�mero maior pelo menor �: "+r2);
			}else if(x==3){
				r3 = (n1*n2);
				JOptionPane.showMessageDialog(null,"\nO produto entre os n�meros digitados �: " +r3);
			}else if(x==4){
				r4 = (n1/n2);
				JOptionPane.showMessageDialog(null,"\nA divis�o do primerio n�mero pelo segundo �: " +r4);
			}
				
	}
}


	


