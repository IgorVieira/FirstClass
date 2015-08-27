package Condicional;

import javax.swing.JOptionPane;

public class ex9 {

public static void main(String[]args){
	
	float sm , sr ;
	
	sm = Float.parseFloat(JOptionPane.showInputDialog(null,"Saldo médio:"));
	
	if(sm>400.0){
		sr = (float) (sm*0.3);
		JOptionPane.showMessageDialog(null,"Valor do crédito: R$" +sr+ " Valor do saldo: R$"+sm);
	}else if(sm==400.0 || sm<400.0 && sm>300.0){
		sr = (float) (sm*0.25);
		JOptionPane.showMessageDialog(null,"Valor do crédito: R$" +sr+ " Valor do saldo: R$"+sm);
	}else if(sm==300.0 || sm<300 && sm>200){
		sr = (float) (sm*0.2);
		JOptionPane.showMessageDialog(null,"Valor do crédito: R$" +sr+ " Valor do saldo: R$"+sm);
    }else{
    	 sr = (float) (sm*0.1);
    	 JOptionPane.showMessageDialog(null,"Valor do crédito: R$" +sr+ " Valor do saldo: R$"+sm);
 }
	
}
}
