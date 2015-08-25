package src.Tarefa8;
import javax.swing.JOptionPane;
public class Fdasfasd {
public static void main(String[]args){
	double n, n1;
	
	n = Double.parseDouble(JOptionPane.showInputDialog(null, "salario"));
	if (n < 300){
		n1 = n + (n * 0.35);
		JOptionPane.showMessageDialog(null, "salario reajustado" +n1);
	}else{
		n1 = n + (n * 0.15);
		JOptionPane.showMessageDialog(null, "salario reajustado" +n1);
	}
	
	
	
	
}
}
