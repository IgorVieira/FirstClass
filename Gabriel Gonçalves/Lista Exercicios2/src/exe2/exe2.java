package exe2;

import javax.swing.JOptionPane;

public class exe2 {

	public static void main(String[] args) {
		 float n1;
	     float n2;
	     float media;
	   n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua primeira nota: "));
	   n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua segunda nota: "));
	   
	   	  media = ((n1+n2)/2);
	   	  
	   if(media >=0 && media <4){
		   JOptionPane.showMessageDialog(null, "Você está Reprovado !!");
	   }
	   
	   if(media >= 4 && media <7.0){
		   JOptionPane.showMessageDialog(null, "Exame !!");
	   }
	   
	   if(media >= 7.0 && media <=10.0){
		   JOptionPane.showMessageDialog(null, "Aprovado!! ");
	   }

	


		
	}

}
