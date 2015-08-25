package exe8;

import javax.swing.JOptionPane;

public class exe8 {

	public static void main(String[] args) {
		float s;
		float r;
		float r1;
		
	s = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o Salario: "));
	
	if(s <=300){
		r = (float) ((s *0.35)+s);
	JOptionPane.showMessageDialog(null, "Salario Correspondente ao ajuste de 35% : " +r+ " R$");
	}
	
	else{
		r1 = (float) ((s*0.15)+s);
	JOptionPane.showMessageDialog(null, "Salario Correspondente ao ajuste de 15% : " +r1+ " R$");
	}
	

	}

}
