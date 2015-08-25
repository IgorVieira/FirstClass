package exw12;

import javax.swing.JOptionPane;

public class ex12 {
	public static void main(String[] args){
			
			float n;
			float r1;
			float r2;
			float r3;
			float r4;
		
			
			n = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário bruto: "));
			
			r1 = (float) (n+100.00);
			r2 = (float) (n+75.00);
			r3 = (float) (n+50.00);
			r4 = (float) (n+35.00);
			
			
			if(n<350){
				JOptionPane.showMessageDialog(null, "Seu salario bruto mais a gratificação é de: "+r1);
			}else if(n>=350&& n<600){
				JOptionPane.showMessageDialog(null, "Seu salario bruto mais a gratificação é de: "+r2);
			}else if(n>=600 && n<=900){
				JOptionPane.showMessageDialog(null, "Seu salario bruto mais a gratificação é de: "+r3);
			}else if(n>900){
				JOptionPane.showMessageDialog(null, "Seu salario bruto mais a gratificação é de: "+r4);
			}
	}
}
