package exe911;

import javax.swing.JOptionPane;

public class exe11 {

	public static void main(String[] args) {
		float s;
		float r;

	s = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o salario atual: "));
	
	if(s <=300){ r = (float) ((s*0.15)+s);
	JOptionPane.showMessageDialog(null, "Salario com reajuste de 15%: " +r);
		   }	
	
	if(s >300 && s <=600){ r = (float) ((s*0.10)+s);
	JOptionPane.showMessageDialog(null, "Salario com reajuste de 15%: " +r);
	   }	
	
	if(s >600 && s <=900){ r = (float) ((s*0.05)+s);
	JOptionPane.showMessageDialog(null, "Salario com reajuste de 15%: " +r);
	   }
	
	if(s >900){ 
	JOptionPane.showMessageDialog(null, "Sem Direito a Reajuste: " +s);
	   }
	
	
	}
	
}
