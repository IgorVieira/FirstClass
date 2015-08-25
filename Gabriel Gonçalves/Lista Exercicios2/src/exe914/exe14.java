package exe914;

import javax.swing.JOptionPane;

public class exe14 {

	public static void main(String[] args) {
		float s;
		float r;
		
	s = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o Salario: "));
	
	if(s <=300){r = (float) ((s*0.50)+s);
		JOptionPane.showMessageDialog(null, "O novo ajuste salarial a 50%: " +r);
	}
	
	if(s >300 && s <=500){r = (float) ((s*0.40)+s);
	JOptionPane.showMessageDialog(null, "O novo ajuste salarial a 40%: " +r);
	}
	
	if(s >500 && s <=700){r = (float) ((s*0.30)+s);
	JOptionPane.showMessageDialog(null, "O novo ajuste salarial a 30%: " +r);
	}
	
	if(s >700 && s <=800){r = (float) ((s*0.20)+s);
	JOptionPane.showMessageDialog(null, "O novo ajuste salarial a 20%: " +r);
	}
	
	if(s >800 && s <=1000){r = (float) ((s*0.10)+s);
	JOptionPane.showMessageDialog(null, "O novo ajuste salarial a 10%: " +r);
	}
	
	if(s >1000){r = (float) ((s*0.05)+s);
	JOptionPane.showMessageDialog(null, "O novo ajuste salarial a 5%: " +r);
	}
	
	
	
	
	
	
	
	
	}

}

