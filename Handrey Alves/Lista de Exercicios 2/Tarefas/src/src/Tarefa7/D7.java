package src.Tarefa7;
import javax.swing.JOptionPane;
public class D7 {
	public static void main(String[]args){
		
		double n, r;
		
		n=Double.parseDouble(JOptionPane.showInputDialog(null, "salario"));
		
		if(n<500){
		r=n+(n*0.3);
		JOptionPane.showMessageDialog(null, "salario reajustado : "+r);
		
		}else{
		JOptionPane.showMessageDialog(null, "nao tem direito");
		}
		
		
		
		
	}
}
