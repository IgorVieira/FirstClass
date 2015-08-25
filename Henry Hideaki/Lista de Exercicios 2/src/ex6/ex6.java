package ex6;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float n;
		float n2;
		float n3;
		float n4;
		float n5;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero:"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro numero:"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a opçao : \n 1-O primeiro numero elevado ao segundo \n 2-Raiz quadrada de cada um dos numeros \n 3-Raiz cubica de cada um dos numeros"));
		
		if(n3 == 1){
			n4=(float) Math.pow(n,n2);
			JOptionPane.showMessageDialog(null,"O resultado é:"+n4);
			}
		else if(n3 == 2){
			n4=(float) Math.sqrt(n);
			n5=(float) Math.sqrt(n2);
			JOptionPane.showMessageDialog(null,"O resultado é:"+n4+n5);
		}
		else if(n3 == 3){	
			n4=(float) Math.cbrt(n);
			n5=(float) Math.cbrt(n2);
			JOptionPane.showMessageDialog(null,"O resultado é:"+n4+n5);
			}
		else{
			JOptionPane.showMessageDialog(null,"Erro...");
			}
		}

}
