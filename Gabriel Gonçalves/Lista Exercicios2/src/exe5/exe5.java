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
	
n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero: "));
n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro n�mero: "));	
	
op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - M�dia entre os n�meros digitados" 
									+"\n2 - Diferen�a entre o Maior e o Menor"
									+"\n3 - Produto entre os n�meros digitados"
									+"\n4 - Divis�o do primeiro pelo segundo"));
	if(op == 1){ 
		r1 = ((n1+n2)/2);
			JOptionPane.showMessageDialog(null, "A media �: " +r1);
				}
	if(op == 2){
		r2 = n1 -n2;
			JOptionPane.showMessageDialog(null, "Diferen�a entre o Maior e o Menor: " +r2);	
				}
	if(op == 3){
		r3 = n1 *n2;				
			JOptionPane.showMessageDialog(null, "O Produto entre os n�meros s�o: " +r3);
				}
	if(op == 4){
		r4 = n1/n2;
			JOptionPane.showMessageDialog(null, "A Divis�o �: " +r4);
				}
	
	
	
	}
}
