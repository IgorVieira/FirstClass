package exw11;

import javax.swing.JOptionPane;

public class ex11 {
public static void main(String[] args){
		
		float n;
		float r1;
		float r2;
		float r3;
	
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário: "));
		
		r1 = (float) ((n*0.15)+n);
		r2 = (float) ((n*0.10)+n);
		r3 = (float) ((n*0.05)+n);
		
		
		if(n<300){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r1);
		}else if(n>=300&& n<600){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r2);
		}else if(n>=600 && n<=900){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r3);
		}else if(n>900){
			JOptionPane.showMessageDialog(null, "Você não tem direito a aumento!: ");
		}
	}
}