package Condicional;

import javax.swing.JOptionPane;

public class ex10 {

public static void main(String[]args){
	
	float cf , pc;
	
	cf = Float.parseFloat(JOptionPane.showInputDialog(null,"Custo de f�brica:"));
	
	
	if(cf==12000 || cf<12000.0){
		pc = (float) (cf*1.05);
		JOptionPane.showMessageDialog(null, "O pre�o do carro ser�: R$"+pc);
		
	}else if(cf==25000.0 || cf>12000.0 && cf<25000.0){
	    pc = (float) ((cf*1.1)+(cf*0.15));
	    JOptionPane.showMessageDialog(null, "O pre�o do carro ser�: R$"+pc);
	    
    }else{
    	pc = (float) ((cf*1.15)+(cf*0.2));
    	JOptionPane.showMessageDialog(null, "O pre�o do carro ser�: R$"+pc);
    }
}
}