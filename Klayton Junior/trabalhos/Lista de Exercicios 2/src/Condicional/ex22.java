package Condicional;

import javax.swing.JOptionPane;

public class ex22 {

public static void main(String[]args){	

	int i;
	float p;
	
	i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
	p = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite seu peso"));
	
	
	if(p==60 || p<60 && i<20){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 9");
	}else if((p==60 || p<60) && (i>19 && i<51)){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 6");
	}else if(p==60 || p<60 && i>50){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 3");
	}else if((p==90 || p<90 && p>60) && (i<20)){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 8");
	}else if((p==90 || p<90 && p>60) && (i>19 && i<51)){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 5");
	}else if((p==90 || p<90 && p>60) && (i>50)){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 2");
	}else if(p>90 && i<20){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 7");
	}else if(p>90 && i>19 && i<51){
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 4");
	}else{
		JOptionPane.showMessageDialog(null, "Você está no grupo de risco 1");
	}




}
}