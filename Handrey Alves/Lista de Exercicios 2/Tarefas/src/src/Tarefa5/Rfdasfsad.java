package src.Tarefa5;
import javax.swing.JOptionPane;
public class Rfdasfsad {
	public static void main(String[]args){
		
		double n, n1, n2, r;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1� numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2� numero"));
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "escolha uma opera��o"
				+"\n1 = m�dia entre os numeros"
				+"\n2 = diferen�a do maior para o menor"
				+"\n3 = produto entre os numeros"
				+"\n4 = divis�o do primeiro pelo segundo"));
		
		if(n > 4){
			JOptionPane.showMessageDialog(null, "                     Erro"
					+"\no numero digitado � invalido ");
		
		}else if(n == 1){
		r = (n1 + n2)/ 2;
		JOptionPane.showMessageDialog(null, "m�dia : "+r);
		
		}else if(n == 2){
		r = n1 - n2;
		JOptionPane.showMessageDialog(null, "diferen�a : "+r);
		
		}else if(n == 3){
		r = n1 * n2;
		JOptionPane.showMessageDialog(null,  "produto : "+r);
		
		}else if( n2 != 0){
			r = n1 / n2;
		JOptionPane.showMessageDialog(null, "divis�o : "+r);
		
		}if(n2 == 0){
			JOptionPane.showMessageDialog(null, "                          Erro!"
					+"\num dos numeros digitado � invalido ");
		}
	
		
		
		
		
	}
}
