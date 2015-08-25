package src.Tarefa11;
import javax.swing.JOptionPane;
public class Dfasfsaf {
	public static void main(String[]args){
		
		double n, n1, n2;
		
		n = Double.parseDouble(JOptionPane.showInputDialog(null, "saldo"));
		
		if (n < 300.0 || n == 300.0){
			n1 = n + (n * 0.15);
			n2 = n1 - n;
			JOptionPane.showMessageDialog(null, "salario ajustado: " +n1
					+"\npersentual de aumento: "+n2);
		
		}else if(n > 300.0 && n < 600.0 || n ==600.0){
			n1 = n + (n * 0.10);
			n2 = n1 - n;
			JOptionPane.showMessageDialog(null, "salario ajustado: " +n1
					+"\npersentual de aumento: "+n2);
					
		}else if( n > 600.0 && n < 900.0 || n == 900.0){
			n1 = n + (n * 0.05);
			n2 = n1 - n;
			
		}else{
			n1 = n;
			n2 = n1 - n;
		
		}
		
	}
}
