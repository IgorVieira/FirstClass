package src.Tarefa19;
import javax.swing.JOptionPane;
public class D19 {
	public static void main(String[]args){
		
		double n, n1, r;
		
		n=Double.parseDouble(JOptionPane.showInputDialog(null, "qual o seu sexo ?"
				+"\n1 = masculino"
				+"\n2 = feminino"));
		n1=Double.parseDouble(JOptionPane.showInputDialog(null, "qual a sua altura?"));
		
		if(n==1){
		r=(72.7*n1)-58;
		JOptionPane.showMessageDialog(null, "seu peso ideal é : "+r);
		
		}else{
		r=(62.1*n1)-44.7;
		JOptionPane.showMessageDialog(null, "seu peso ideal é : "+r);
		}
		
		
	}
}
