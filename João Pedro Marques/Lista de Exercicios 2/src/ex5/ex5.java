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
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Um das opções abaixo:"
				+ "\n 1 - média"
				+ "\n 2 - diferença"
				+ "\n 3 - produto"
				+ "\n 4 - divisão "));
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número: "));	
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número: "));
		
		
		
	
	if(x <1 || x>4){
		JOptionPane.showMessageDialog(null,"Opção inválida! ");
	}
		
	
	
			if(x==1){
				r1 = (n1+n2)/2;
				JOptionPane.showMessageDialog(null," A média dos números digitados é: "+r1);
			}else if(x==2){
				r2 = n1 - n2;
				JOptionPane.showMessageDialog(null,"\nA diferença  entre o número maior pelo menor é: "+r2);
			}else if(x==3){
				r3 = (n1*n2);
				JOptionPane.showMessageDialog(null,"\nO produto entre os números digitados é: " +r3);
			}else if(x==4){
				r4 = (n1/n2);
				JOptionPane.showMessageDialog(null,"\nA divisão do primerio número pelo segundo é: " +r4);
			}
				
	}
}


	


