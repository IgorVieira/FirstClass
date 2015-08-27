package Condicional;

import javax.swing.JOptionPane;

public class ex25 {
	
public static void main(String[]args){	

	float he , hf , H;
	
	he = Float.parseFloat(JOptionPane.showInputDialog(null,"Quantidade de horas extras"));
	hf = Float.parseFloat(JOptionPane.showInputDialog(null,"Quantidade de horas faltadas"));
	  H = (float) (((he)-(2/3*hf))*60);
	  
	  if(H>2400.0){
		  JOptionPane.showMessageDialog(null, "Prêmio de R$500");
	  }else if(H==1800.0 || H>1800.0 && H<2400.0){
		  JOptionPane.showMessageDialog(null, "Prêmio de R$400");
	  }else if(H==1200.0 || H>1200.0 && H<1800.0){
		  JOptionPane.showMessageDialog(null, "Prêmio de R$300");
	  }else if(H==600.0 || H>600.0 && H<1200.0){
		  JOptionPane.showMessageDialog(null, "Prêmio de R$200");
	  }else{
		  JOptionPane.showMessageDialog(null, "Prêmio de R$100");
	  }
}
}