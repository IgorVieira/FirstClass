package src.Tarefa12;
import javax.swing.JOptionPane;
public class Dasdasdasd {
	public static void main(String[]args){
		
		double n, n1;
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "sal�rio:"));
		if(n < 350.0 || n == 350.0){
			n1 = (n - (n * 0.07)) + 100;
			JOptionPane.showMessageDialog(null, "gratifica��o: "+n1);
		}else if(n > 350.0 && n < 600.0 || n == 600.0){
			n1 = (n - (n * 0.07)) + 75;
			JOptionPane.showMessageDialog(null,  "gratifica��o: "+n1);
		}else if(n > 600.0 && n < 900.0 || n == 900.0){
			n1 = (n + (n * 0.07)) + 50;
			JOptionPane.showMessageDialog(null,  "gratifica��o" + n1);
		}else{
			n1 = (n + (n * 0.07)) + 35;
			JOptionPane.showMessageDialog(null, "gratifica��o" + n1);
		
		}
		
		
		
	}
}
