package src.Tarefa6;
import javax.swing.JOptionPane;
public class Fdasdas {
	public static void main(String[]args){
		
		double n, n1, n2, r, r2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1º numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2º numero"));
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "escolha uma operação"
				+"\n1 = o primeiro elevado ao segundo"
				+"\n2 = raiz quadreda de cada um"
				+"\n3 = reiz cubica de cada um"));
			
		if(n > 3){
		JOptionPane.showMessageDialog(null, "                     Erro"
					+"\no numero digitado é invalido ");
		
		}else if(n == 1){
		r = Math.pow(n1, n2);
	    JOptionPane.showMessageDialog(null,  "potencia : "+r);
		
		}else if(n == 2){
		r = Math.pow(n1, 2);
		r2 = Math.pow(n2, 2);
		JOptionPane.showMessageDialog(null,  "raiz quadrada 1º : "+r
				+"\nraiz quadrada 2º : "+r2);
		
		}else{
		r = Math.pow(n1, 3);
		r2 = Math.pow(n2, 3);
		JOptionPane.showMessageDialog(null,  "raiz cubica 1º : "+r
				+"\nraiz cubica 2º "+r2);
		
		}
		
	}
}
