package src.Tarefa2;

import javax.swing.JOptionPane;

public class Asdfasdf {
 public static void main(String[]args){
	 
	 float n1, n2, m;
	 
	 n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1:"));
	 n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 2:"));
	 
	 m = (n1 + n2) / 2;
	 
	 if(m >= 0 && m < 4.0){
		 JOptionPane.showMessageDialog(null,  "Reprovado:");
	 }else if(m >= 4 && m < 7.0){
	     JOptionPane.showMessageDialog(null,  "exame:");
	 }else{
		 JOptionPane.showMessageDialog(null,  "Aprovado:");
	 }
	 }
}
