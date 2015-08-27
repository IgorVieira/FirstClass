package Condicional;

import javax.swing.JOptionPane;

public class ex13 {

public static void main(String[]args){
	
	float p1 , p2 ;
		
	p1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço do produto: R$"));
	
	if(p1==50.0 || p1<50.0){
		p2 = (float) (1.05*p1);
		if(p2==80 || p2<80){
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Barato");
		}if(p2==120.0 || p2>80.0 && p2<120.0){
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Normal");
		}if(p2==200.0 || p2>120.0 && p2<200){	
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Caro");
		}if(p2>200.0){	
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Muito caro");
		}
	
			
	}if(p1==100.0 || p1>50.0 && p1<100.0){	
		p2 = (float) (1.1*p1);
		
	if(p2==80 || p2<80){
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Barato");
		}if(p2==120.0 || p2>80.0 && p2<120.0){
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Normal");
		}if(p2==200.0 || p2>120.0 && p2<200){	
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Caro");
		}if(p2>200.0){	
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Muito caro");
		
	
}  
}   if(p1>100.0){
	    p2 = (float) (1.15*p1);
	    if(p2==80 || p2<80){
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Barato");
		}if(p2==120.0 || p2>80.0 && p2<120.0){
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Normal");
		}if(p2==200.0 || p2>120.0 && p2<200){	
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Caro");
		}if(p2>200.0){	
			JOptionPane.showMessageDialog(null, "O novo preço do produto é R$"+p2+""
					+"\n Classificado como: Muito caro");
		}
}
		}
}







		
	