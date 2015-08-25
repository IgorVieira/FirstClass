package src.Tarefa15;
import javax.swing.JOptionPane;
public class Sdasda {
	public static void main(String[]args){
		
		double n, n1, r;
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto investiu :"));
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "qual seu tipo de investimento :"
				+"\n1 = poupança"
				+"\n2 = fundo de renda fixa"));
		
		if(n1 > 2){
		JOptionPane.showMessageDialog(null, "                     Erro"
				+"\no numero digitado é invalido ");
		
		}else if(n1 == 1){
		r = n + (n * 0.03);
		JOptionPane.showMessageDialog(null,  "rendimento mensal :" +r);
		
		}else{
		r = n + ( n * 0.04);
		JOptionPane.showMessageDialog(null,  "rendimento mensal :" +r);
		}
		
	}
}
