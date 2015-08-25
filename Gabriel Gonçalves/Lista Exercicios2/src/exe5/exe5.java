package exe5;

import javax.swing.JOptionPane;

public class exe5 {
	public static void main(String[] args){
	int n1;
	int n2;
	int op;
	int r1;
	int r2;
	int r3;
	int r4;
	
n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número: "));	
	
op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Média entre os números digitados" 
									+"\n2 - Diferença entre o Maior e o Menor"
									+"\n3 - Produto entre os números digitados"
									+"\n4 - Divisão do primeiro pelo segundo"));
	if(op == 1){ 
		r1 = ((n1+n2)/2);
			JOptionPane.showMessageDialog(null, "A media é: " +r1);
				}
	if(op == 2){
		r2 = n1 -n2;
			JOptionPane.showMessageDialog(null, "Diferença entre o Maior e o Menor: " +r2);	
				}
	if(op == 3){
		r3 = n1 *n2;				
			JOptionPane.showMessageDialog(null, "O Produto entre os números são: " +r3);
				}
	if(op == 4){
		r4 = n1/n2;
			JOptionPane.showMessageDialog(null, "A Divisão é: " +r4);
				}
	
	
	
	}
}
