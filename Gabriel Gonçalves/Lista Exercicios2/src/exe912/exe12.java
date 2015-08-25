package exe912;

import javax.swing.JOptionPane;

public class exe12 {

	public static void main(String[] args) {
		float s;
		float r;

	s = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o salario atual: "));
	
	if(s <=350){ r = (float) (s+100);
	JOptionPane.showMessageDialog(null, "Salario com a gratificação: " +r);
		   }	
	
	if(s >350 && s <=600){ r = (float) (s+75);
	JOptionPane.showMessageDialog(null, "Salario com a gratificação: " +r);
	   }	
	
	if(s >600 && s <=900){ r = (float) (s+50);
	JOptionPane.showMessageDialog(null, "Salario com a gratificação: " +r);
	   }
	
	if(s >900){ r = (s+35);
	JOptionPane.showMessageDialog(null, "Sem Direito a Reajuste: " +r);
	   }
	
		
	}

}
