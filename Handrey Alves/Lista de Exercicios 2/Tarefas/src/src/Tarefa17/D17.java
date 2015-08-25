package src.Tarefa17;
import javax.swing.JOptionPane;
public class D17 {
	public static void main(String[]args){
		
		float n, n2, n3, n4;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "primeiro numero :"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "segundo numero :"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "terceiro numero :"));
		n4 = Float.parseFloat(JOptionPane.showInputDialog(null, "quarto numero :"));
		
		if(n == 4 && n2 == 5 && n3 == 3 && n4 == 1){
		JOptionPane.showMessageDialog(null,  "acesso permitido");
		
		}else{
		JOptionPane.showMessageDialog(null,  "acesso negado");	
		}
	}
}
