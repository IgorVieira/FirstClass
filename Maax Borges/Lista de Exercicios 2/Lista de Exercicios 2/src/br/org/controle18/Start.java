br.org.controle18;


import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
	    float n3;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o seu sexo, sendo que :"
				+ "/n 1 = Masculino;"
			+ "/n 2 = Feminino ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a sua altura."));
		
		if(n1 == 1){
			n3 = (float) ((72.7 * n2) - 58);
			JOptionPane.showMessageDialog(null, "O seu peso ideal é : " + n3);
		
		}else if (n1 == 2){
			n3 = (float) ((62.1 * n2) - 44.7);
		JOptionPane.showMessageDialog(null, "O seu peso ideal é : " + n3);
		}
		}
	}