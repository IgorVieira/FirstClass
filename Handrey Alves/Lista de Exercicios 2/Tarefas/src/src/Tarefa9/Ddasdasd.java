package src.Tarefa9;
import javax.swing.JOptionPane;
public class Ddasdasd {
	public static void main(String[]args){
		
		double n, n1;
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "saldo"));
		
		if (n > 400){
			n1 = n * 0.30;
			JOptionPane.showMessageDialog(null, "seu credito é de " +n1);
		}else if (n > 300.0 && n < 400.0 || n == 400.0){
			n1 = n * 0.25;
			JOptionPane.showMessageDialog(null, "seu credito é de " +n1);
		
		}else if (n > 200.0 && n < 300.0 || n == 300){
			n1 = n * 0.20;
			JOptionPane.showMessageDialog(null, "seu credito é de " +n1);
		}else{
		    n1 = n * 0.10;
		    JOptionPane.showMessageDialog(null, "seu credito é de " +n1);
		}
		
			
		
	}
}
