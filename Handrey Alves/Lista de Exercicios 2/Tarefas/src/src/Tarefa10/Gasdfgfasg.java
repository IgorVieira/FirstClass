package src.Tarefa10;
import javax.swing.JOptionPane;
public class Gasdfgfasg {
	public static void main(String[]args){
		
		double n, n1;
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "custo de fabrica:"));
		
		if (n < 12000.0 || n == 12000.0){
			n1 = n + (n * 0.05);
			JOptionPane.showMessageDialog(null, "valor total " +n1);
		}else if (n > 12000.0 && n < 25000.0 || n == 25000.0){
			n1 = n + (n * 0.25);
			JOptionPane.showMessageDialog(null, "valor total: " +n1);
		}else{
			n1 = n + (n * 0.35);
			JOptionPane.showMessageDialog(null, "valor total: " +n1);
		}
		
		
		
	}
}
