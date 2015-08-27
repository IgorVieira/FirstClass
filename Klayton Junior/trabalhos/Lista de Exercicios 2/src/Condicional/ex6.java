package Condicional;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[]args){
		
		
		float x , y;
		int z;
		double r1 , r2 , r22 , r3 , r33;
		
		z = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "\n Opção 1 - O primeiro número elevado ao segundo"
				+ "\n Opção 2 - A raiz quadrada de cada um"
				+ "\n Opção 3 - A raiz cúbica de cada um"
				+ "\n Qual a opção desejada:"));
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um número:"));
		y = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro número:"));
				
		if(z==1){
		     r1 = Math.pow(x, y);
			JOptionPane.showMessageDialog(null,"O primeiro número elevado ao segundo é:"+r1);
		     
		}else if(z==2){
			r2 = Math.sqrt(x);
			r22 = Math.sqrt(y);
			JOptionPane.showMessageDialog(null, "A raiz quadrada do primeiro número é "+r2+" e a do segundo é "+r22);
		}else if(z==3){
			r3 = Math.cbrt(x);
			r33 = Math.cbrt(y);
			JOptionPane.showMessageDialog(null,"A raiz cúbica do primeiro número é "+r3+" e a do segundo é "+r33);
		}else{
			JOptionPane.showMessageDialog(null, "Opção inválida");
		}
		
		
		
	}
}
