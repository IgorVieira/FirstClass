package src.Tarefa20;
import javax.swing.JOptionPane;
public class D20 {
	public static void main(String[]args){
		
		float n;
		
		n=Float.parseFloat(JOptionPane.showInputDialog(null, "idade :"));
		
		if(n<5){
		JOptionPane.showMessageDialog(null,  "Muito novo. sem categoria.");
		}else if(n>=5 && n<=7){
		JOptionPane.showMessageDialog(null,  "Infantil");
		}else if(n>=8 && n<=10){
		JOptionPane.showMessageDialog(null,  "Juvenil");
		}else if(n>=11 & n<=15){
		JOptionPane.showMessageDialog(null,  "Adolescente");	
		}else if(n>=16 && n<=30){
		JOptionPane.showMessageDialog(null,  "Adulto");
		}else{
		JOptionPane.showMessageDialog(null,  "Senior");
		}
	}
}
