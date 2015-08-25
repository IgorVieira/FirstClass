package src.Tarefa5;
import javax.swing.JOptionPane;
public class Rfdasfsad {
	public static void main(String[]args){
		
		double n, n1, n2, r;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1º numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2º numero"));
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "escolha uma operação"
				+"\n1 = média entre os numeros"
				+"\n2 = diferença do maior para o menor"
				+"\n3 = produto entre os numeros"
				+"\n4 = divisão do primeiro pelo segundo"));
		
		if(n > 4){
			JOptionPane.showMessageDialog(null, "                     Erro"
					+"\no numero digitado é invalido ");
		
		}else if(n == 1){
		r = (n1 + n2)/ 2;
		JOptionPane.showMessageDialog(null, "média : "+r);
		
		}else if(n == 2){
		r = n1 - n2;
		JOptionPane.showMessageDialog(null, "diferença : "+r);
		
		}else if(n == 3){
		r = n1 * n2;
		JOptionPane.showMessageDialog(null,  "produto : "+r);
		
		}else if( n2 != 0){
			r = n1 / n2;
		JOptionPane.showMessageDialog(null, "divisão : "+r);
		
		}if(n2 == 0){
			JOptionPane.showMessageDialog(null, "                          Erro!"
					+"\num dos numeros digitado é invalido ");
		}
	
		
		
		
		
	}
}
