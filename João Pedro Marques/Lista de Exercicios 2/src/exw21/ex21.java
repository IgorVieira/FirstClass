package exw21;

import javax.swing.JOptionPane;

public class ex21 {
	public static void main(String[] args){
		int n;	
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu c�digo de origem: "));
		
		
		if(n==1){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Sul ");
		}else if(n==2){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Norte ");
		}else if(n==3){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Leste ");
		}else if(n==4){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Oeste ");
		}else if(n==5||n==6){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Nordeste");
		}else if(n==7||n==8||n==9){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Sudeste");
		}else if(n>=10&&n<=20){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Centro-Oeste");
		}else if(n>=21&&n<=30){
			JOptionPane.showMessageDialog(null,"Proced�ncia: Nordeste");
		}

	}
}