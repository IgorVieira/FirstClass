package Condicional;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[]args){
		
		
		float x , y;
		int z;
		double r1 , r2 , r22 , r3 , r33;
		
		z = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "\n Op��o 1 - O primeiro n�mero elevado ao segundo"
				+ "\n Op��o 2 - A raiz quadrada de cada um"
				+ "\n Op��o 3 - A raiz c�bica de cada um"
				+ "\n Qual a op��o desejada:"));
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um n�mero:"));
		y = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro n�mero:"));
				
		if(z==1){
		     r1 = Math.pow(x, y);
			JOptionPane.showMessageDialog(null,"O primeiro n�mero elevado ao segundo �:"+r1);
		     
		}else if(z==2){
			r2 = Math.sqrt(x);
			r22 = Math.sqrt(y);
			JOptionPane.showMessageDialog(null, "A raiz quadrada do primeiro n�mero � "+r2+" e a do segundo � "+r22);
		}else if(z==3){
			r3 = Math.cbrt(x);
			r33 = Math.cbrt(y);
			JOptionPane.showMessageDialog(null,"A raiz c�bica do primeiro n�mero � "+r3+" e a do segundo � "+r33);
		}else{
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
		}
		
		
		
	}
}
