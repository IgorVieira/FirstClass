package ex2;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float n;
         float n1;
        
         float media;
         
         n = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 1:"));
         n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 2:"));
    
         media=(n+n1)/2;
         if(media >= 0.0 && media < 4.0){
        	 JOptionPane.showMessageDialog(null,"Reprovado");}
        	 else if(media>=4.0 && media<7.0){ 
        		 JOptionPane.showMessageDialog(null,"Exame");}
        	 else{
        		 JOptionPane.showMessageDialog(null,"Aprovado");
        		 
        	 }

}
}