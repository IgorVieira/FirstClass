package src.Tarefa23;
import javax.swing.JOptionPane;
public class D23 {
	public static void main(String[]args){
		
		double n, n2, r, r2 , r3, r4, p;
		
		n=Double.parseDouble(JOptionPane.showInputDialog(null, "Codigo do produto :"));
		n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade :"));
		
		if(n<=10){
		p=10;
		}else if(n>10 && n<=20){
		p=15;
		}else if(n>20 && n<=30){
		p=20;
		}else if(n>30 &&n>=40){
		p=30;
		r=p;
		r2=p*n2;
		}else if(p*n2<=250);
		
		
	}
}
