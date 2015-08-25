package ex6;

import javax.swing.JOptionPane;

public class ex6 {
public static void main(String[] args){
		
		float n1;
		float n2;
		float r1;
		int menu;
		
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número: "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número: "));
		
		menu = Integer.parseInt(JOptionPane.showInputDialog(null,"escolha uma das opções abaixo:"
				+ "\n 1 - O primeiro número elevado ao segundo"
				+ "\n 2 - A raiz quadrada do primeiro número"
				+ "\n 3 - A raiz quadrada do segundo número "));
		
		if(menu==1){
			r1 =  (float) Math.pow(n1, n2);
			JOptionPane.showMessageDialog(null,"O primeiro número elevado ao segundo é: "+r1);
		}else if(menu==2){
			r1 = (float) Math.sqrt(n1);
			JOptionPane.showMessageDialog(null,"A raiz quadrada do primeiro número é: "+r1);
		}else if(menu==3){
			r1 = (float) Math.sqrt(n2);
			JOptionPane.showMessageDialog(null,"A raiz quadrada do segundo número é: " +r1);
		}
		
		
		
		
		
		
		
		
		
		
}
}

		
		
		
		
		
		
	



