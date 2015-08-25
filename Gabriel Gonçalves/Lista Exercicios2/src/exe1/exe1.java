package exe1;

import javax.swing.JOptionPane;

public class exe1 {

	public static void main(String[] args) {
		float n1;
		float n2;
		float n3;
		float n4;
		float media;
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua primeira nota: "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua segunda nota: "));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua terceira nota: "));
		n4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua quarta nota: "));
		   
		   media = (n1+n2+n3+n4)/4;
		   
		   if(media >=7){
			   JOptionPane.showMessageDialog(null, "Você está aprovado");
		   };
		   if(media <7){
			   JOptionPane.showMessageDialog(null, "Você está reprovado");
		   };
			     


	}

}
