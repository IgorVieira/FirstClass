package exe922;

import javax.swing.JOptionPane;

public class exe22 {

	public static void main(String[] args) {
		int i;
		float p;
		int g;
	i = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a Idade: "));
	p = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o Peso: "));
	
	if(i <20 && p <=60){ g = 9;
		JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
	}
	
	if(i <20 && p >60 && p <=90){ g = 8;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	if(i <20 && p >90){ g = 7;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	
	if(i >=20 && i <=50 && p <=60){ g = 6;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	if(i >=20 && i <=50 && p >60 && p <=90){ g = 5;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	if(i >=20 && i <=50 && p >90){ g = 4;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	if(i >50 && p <=60){ g = 3;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	if(i >50 && p >60 && p <=90){ g = 2;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	if(i >50 && p >90){ g = 1;
	JOptionPane.showMessageDialog(null, "Seu grupo é: " +g);
								}
	
	
	
	}

}
