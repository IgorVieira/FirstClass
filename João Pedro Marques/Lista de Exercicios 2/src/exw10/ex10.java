package exw10;

import javax.swing.JOptionPane;

public class ex10 {
	public static void main(String[] args){
		
		float n;
		float r1;
		float r2;
		float r3;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o custo de fábrica: "));
		
		r1 = (float) ((n*0.05)+n);
		r2 = (float) ((n*0.10)+(n*0.15)+n);
		r3 = (float) ((n*0.15)+(n*0.20)+n);
		
		if(n<=12000){
			JOptionPane.showMessageDialog(null, "custo de fabrica total com imp.consumidor e imp.total(isento) é: "+r1);
		}else if(n>12000&& n<25000){
			JOptionPane.showMessageDialog(null, "custo de fabrica total com imp.consumidor e imp.total é: "+r2);
		}else if(n>25000){
			JOptionPane.showMessageDialog(null, "custo de fabrica total com imp.consumidor e imp.total é: "+r3);
		}
		
	}

}
