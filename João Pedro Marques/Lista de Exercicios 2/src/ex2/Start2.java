package ex2;

import javax.swing.JOptionPane;

public class Start2 {

	public static void main(String [] args){
		
		float n1, n2, media;
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota:"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a segunda nota:"));
	
		media = (n1 + n2)/2;
		
		if(media >= 0 && media < 4.0){
			JOptionPane.showMessageDialog(null, " Reprovado!");
		}else if(media >= 4 && media < 7.0){
			JOptionPane.showMessageDialog(null, " exame!");
		}else{
			JOptionPane.showMessageDialog(null, " aprovado!");
		                                                          
		}

    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




