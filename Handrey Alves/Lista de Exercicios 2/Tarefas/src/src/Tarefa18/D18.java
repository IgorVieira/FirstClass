package src.Tarefa18;
import javax.swing.JOptionPane;
public class D18 {
	public static void main(String[]args){
		
		float n;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,  "idade :"));
		
		if(n >= 18){
		JOptionPane.showMessageDialog(null,  "maior de idade");
		
		}else{
		JOptionPane.showMessageDialog(null,  "menor de idade");
		}
		
		
	}
}
