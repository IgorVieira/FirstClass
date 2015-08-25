package src.Tarefa14;
import javax.swing.JOptionPane;
public class Dasdas {
	public static void main(String[]args){
		
		double n, r;
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "salario :"));
		
		if(n <= 300.0){
		r = n + (n * 0.5);
		JOptionPane.showMessageDialog(null,  "novo salario :" +r);
	
		}else if(n > 300.0 && n <= 500.0){
		r = n + (n * 0.4);
		JOptionPane.showMessageDialog(null,  "novo salario :" +r);
		
		}else if(n > 500.0 && n <= 700.0){
		r = n + (n * 0.3);
		JOptionPane.showMessageDialog(null,  "novo salario :" +r);
		
		}else if(n > 700.0 && n <= 800.0){
		r = n + (n * 0.2);
		JOptionPane.showMessageDialog(null,  "novo salario :" +r);
		
		}else if(n > 800.0 && n <= 1000.0){
		r = n + (n * 0.1);
		JOptionPane.showMessageDialog(null,  "novo salario :" +r);
		
		}else{
		r = n + (n * 0.05);
		JOptionPane.showMessageDialog(null,  "novo salario :" +r);
		}		
		
	}
}
