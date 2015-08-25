package exw21;

import javax.swing.JOptionPane;

public class ex21 {
	public static void main(String[] args){
		int n;	
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu código de origem: "));
		
		
		if(n==1){
			JOptionPane.showMessageDialog(null,"Procedência: Sul ");
		}else if(n==2){
			JOptionPane.showMessageDialog(null,"Procedência: Norte ");
		}else if(n==3){
			JOptionPane.showMessageDialog(null,"Procedência: Leste ");
		}else if(n==4){
			JOptionPane.showMessageDialog(null,"Procedência: Oeste ");
		}else if(n==5||n==6){
			JOptionPane.showMessageDialog(null,"Procedência: Nordeste");
		}else if(n==7||n==8||n==9){
			JOptionPane.showMessageDialog(null,"Procedência: Sudeste");
		}else if(n>=10&&n<=20){
			JOptionPane.showMessageDialog(null,"Procedência: Centro-Oeste");
		}else if(n>=21&&n<=30){
			JOptionPane.showMessageDialog(null,"Procedência: Nordeste");
		}

	}
}