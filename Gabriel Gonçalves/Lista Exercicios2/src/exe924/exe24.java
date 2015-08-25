package exe924;

import javax.swing.JOptionPane;

public class exe24 {
	public static void main(String[] args) {
		float n1;
		int n2;
		int op;
		float r1;
		int r2;
		

	op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - limpeza"
								  +"\n2 - Alimentação "
								  +"\n3 - Vestuario."));
	n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o Preço do Produto: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "4 - O Produto que necessita de refrigeração"
			  +"\n5 - O produto não necessita de refrigeração "));
	

	if(n1 <=25 && op == 1){ r1 = (float) ((n1*0.05) +n1);
		JOptionPane.showMessageDialog(null, "Preço do produto após o reajuste 5%:  " +r1);
	}
	
	if(n1 <=25 && op == 2){ r1 = (float) ((n1*0.08) +n1);
	JOptionPane.showMessageDialog(null, "Preço do produto após o reajuste a 8%:  " +r1);
						  }
	
	if(n1 <=25 && op == 3){ r1 = (float) ((n1*0.10) +n1);
	JOptionPane.showMessageDialog(null, "Preço do produto após o reajuste a 10%:  " +r1);
						  }

	if(n1 >25 && op == 1){ r1 = (float) ((n1*0.12) +n1);
	JOptionPane.showMessageDialog(null, "Preço do produto após o reajuste a 12%:  " +r1);
						  }	

	if(n1 >25 && op == 2){ r1 = (float) ((n1*0.15) +n1);
	JOptionPane.showMessageDialog(null, "Preço do produto após o reajuste a 15%:  " +r1);
						  }	
	
	if(n1 >25 && op == 3){ r1 = (float) ((n1*0.18) +n1);
	JOptionPane.showMessageDialog(null, "Preço do produto após o reajuste a 18%:  " +r1);
						  }		
	
	
	
	
	}
	
	
}
