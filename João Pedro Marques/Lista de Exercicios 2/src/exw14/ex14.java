package exw14;

import javax.swing.JOptionPane;

public class ex14 {
	public static void main(String[] args){
		float n;
		float r1;
		float r2;
		float r3;
		float r4,r5,r6;
	
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário: "));
		
		r1 = (float) ((n*0.50)+n);
		r2 = (float) ((n*0.40)+n);
		r3 = (float) ((n*0.30)+n);
		r4 = (float) ((n*0.20)+n);
		r5 = (float) ((n*0.10)+n);
		r6 = (float) ((n*0.05)+n);
		
		
		if(n<300){
			JOptionPane.showMessageDialog(null, "Seu salário total mais o aumento é de"+r1);
		}else if(n>=300&& n<500){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r2);
		}else if(n>=500 && n<700){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r3);
		}else if(n>=700 && n<800){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r4);
		}else if(n>=800 && n<1000){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r5);
		}else if(n>1000){
			JOptionPane.showMessageDialog(null, "Seu salario total mais o aumento é de: "+r6);
		}
	}
}