package exe7;

import javax.swing.JOptionPane;

public class exe7 {

	public static void main(String[] args) {
			float n1;
			float s;
			
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o Sal�rio: "));
		
		if(
		n1 >500.00){
			JOptionPane.showMessageDialog(null, "O S�lario n�o tem direito a reajuste. ");
			}
		
		else {
			s = (float) ((n1*0.3)+n1);
			JOptionPane.showMessageDialog(null, "O Sal�rio apos o reajuste �: " + s);
			
			}

	}

}
