package ex9;

import javax.swing.JOptionPane;

public class ex9 {
	public static void main(String[] args){
		
		float n1;
		float r;
		float r2;
		float r3;
		float r4;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o seu saldo bonus: "));
		
		r = (float) (n1*0.30);
		r2 = (float) (n1*0.25);
		r3 = (float) (n1*0.20);
		r4 = (float) (n1*0.10);
				
		if(n1>400){
			JOptionPane.showMessageDialog(null, "seu cr�dito em 30% � de: "+r);
		}else if(n1<400 && n1>300){
			JOptionPane.showMessageDialog(null, "seu cr�dito em 25% � de: "+r2);
		}else if(n1<300 && n1>200){
			JOptionPane.showMessageDialog(null, "seu cr�dito em 20% � de: "+r3);
		}else if(n1<=200){
			JOptionPane.showMessageDialog(null, "seu cr�dito em 10% � de: "+r4);

		}
	}

}
