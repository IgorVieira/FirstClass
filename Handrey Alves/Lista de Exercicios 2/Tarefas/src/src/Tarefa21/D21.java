package src.Tarefa21;
import javax.swing.JOptionPane;
public class D21 {
	public static void main(String[]args){
		
		float n;
		
		n=Float.parseFloat(JOptionPane.showInputDialog(null, "C�digo de origem/1 a 30 :"));
		
		if(n==1){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Sul");
		}else if(n==2){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Norte");
		}else if(n==3){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Leste");
		}else if(n==4){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Oeste");	
		}else if(n==5 || n==6){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Nordeste");
		}else if(n>=7 && n<= 9){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Sudeste");
	    }else if(n>=10 && n<= 20){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Centro-oeste");
	    }else if(n>=21 && n<=30){
		JOptionPane.showMessageDialog(null,  "proced�ncia : Nordeste");
	}
}
}