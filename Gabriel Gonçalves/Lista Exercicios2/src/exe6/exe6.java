package exe6;

import javax.swing.JOptionPane;

public class exe6 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int op;
		int r1;
		int r2;
		
	n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número: "));	
	
	op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - O primeiro número elevado ao segundo"
								  +"\n2 - Raiz quadrada de cada um dos números "
								  +"\n3 - Raiz cubica de cada um dos números."));
	
	if(op == 1){ 
		r1 = (int) Math.pow(n1 ,n2);
		JOptionPane.showMessageDialog(null, "O primeiro elevado ao segundo é: " +r1);
	}
	
	
	if(op == 2){
		r1 = (int) Math.sqrt(n1); 
		r2 = (int) Math.sqrt(n2);
		JOptionPane.showMessageDialog(null, "Raiz Quadrada: " +r1+ " ; " +r2);
	}
	
	if(op == 3){ 
		r1 = (int) Math.cbrt(n1); 
		r2 = (int) Math.cbrt(n2);
		JOptionPane.showMessageDialog(null, "Raiz Cubica: " +r1+ " ; " +r2);
				}
	else{
		JOptionPane.showMessageDialog(null, "Digite somente o numero listado a cima");
		}	
			  
	
	
		

	}

}
