package src.Tarefa6;
import javax.swing.JOptionPane;
public class Fdasdas {
	public static void main(String[]args){
		
		double n, n1, n2, r, r2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1� numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2� numero"));
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "escolha uma opera��o"
				+"\n1 = o primeiro elevado ao segundo"
				+"\n2 = raiz quadreda de cada um"
				+"\n3 = reiz cubica de cada um"));
			
		if(n > 3){
		JOptionPane.showMessageDialog(null, "                     Erro"
					+"\no numero digitado � invalido ");
		
		}else if(n == 1){
		r = Math.pow(n1, n2);
	    JOptionPane.showMessageDialog(null,  "potencia : "+r);
		
		}else if(n == 2){
		r = Math.pow(n1, 2);
		r2 = Math.pow(n2, 2);
		JOptionPane.showMessageDialog(null,  "raiz quadrada 1� : "+r
				+"\nraiz quadrada 2� : "+r2);
		
		}else{
		r = Math.pow(n1, 3);
		r2 = Math.pow(n2, 3);
		JOptionPane.showMessageDialog(null,  "raiz cubica 1� : "+r
				+"\nraiz cubica 2� "+r2);
		
		}
		
	}
}
