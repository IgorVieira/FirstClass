package src.Tarefa22;
import javax.swing.JOptionPane;
public class D22 {
	public static void main(String[]args){
		
		double n, n2, r;
		
		n=Double.parseDouble(JOptionPane.showInputDialog(null, "Idade :"));
		n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Peso :"));
		
		if(n<20 && n2<=60){
		r=9;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n<20 && n2>60 && n2<=90){
		r=8;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n<20 && n2>90 ){
		r=7;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n>20 && n<=50 && n2<=60){
		r=6;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n>20 && n<=50 && n2>60 && n2<=90){
		r=5;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n>20 && n<=50 && n2<90){
		r=4;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n<50 && n2<=60){
		r=3;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n<50 && n2>60 && n2<=90){
		r=2;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}else if(n<50 && n2>90){
		r=1;
		JOptionPane.showMessageDialog(null, "Grupo de risco "+r);
		}

	}
}