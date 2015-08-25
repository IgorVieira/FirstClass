package ex1;

import javax.swing.JOptionPane;

			

public class ex1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

         float n;
         float n1;
         float n2;
         float n3;
         float media;
         
         n = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 1:"));
         n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 2:"));
         n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 3:"));
         n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 4:"));
         
         media=(n+n1+n2+n3)/4;
         if(media >= 7.0){
        	 JOptionPane.showMessageDialog(null,"Aprovado");}
        	 else{ 
        		 JOptionPane.showMessageDialog(null,"Reprovado");	 
         }
         
	}

}
