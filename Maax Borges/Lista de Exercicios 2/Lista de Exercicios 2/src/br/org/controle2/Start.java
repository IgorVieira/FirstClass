package br.org.controle2;


	import javax.swing.JOptionPane;

	public class Start {

		public static void main(String[] args) {

			float n1;
			float n2;
			
			n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número ."));
			n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número ."));
			
			
			if(n1 < n2){
				JOptionPane.showMessageDialog(null, "O número "+n1+" é menor!!");
			}else if (n2 < n1){
				JOptionPane.showMessageDialog(null, "O número "+n2+" é menor!!");	
			
				}
		}
	}
