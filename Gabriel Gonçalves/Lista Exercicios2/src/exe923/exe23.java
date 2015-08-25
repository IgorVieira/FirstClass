package exe923;

import javax.swing.JOptionPane;

public class exe23 {

	public static void main(String[] args) {
		int c;
		int q;
		float r = 0;
		float d;
		
	c = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o codigo do produto: "));
	q = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade Comprada: "));

	if(c >=1 && c <=10){ r = (float) (q*10.00);
		JOptionPane.showMessageDialog(null, "Preço Unitario do produto: R$ 10,00"
										   +"\nValor Total da nota sem descontos: " +r);
		}

	if(c >=11 && c <=20){ r = (float) (q*15.00);
	JOptionPane.showMessageDialog(null, "Preço Unitario do produto: R$ 15,00"
									   +"\nValor Total da nota sem descontos: " +r);
	
						}
	
	if(c >=21 && c <=30){ r = (float) (q*20.00);
	JOptionPane.showMessageDialog(null, "Preço Unitario do produto: R$ 20,00"
									   +"\nValor Total da nota sem descontos: " +r);
						}
	
	if(c >=31 && c <=40){ r = (float) (q*30.00);
	JOptionPane.showMessageDialog(null, "Preço Unitario do produto: R$ 30,00"
									   +"\nValor Total da nota sem descontos: " +r);
						}
	
	if(r <=250){ d = (float) (r-(r*0.05));
	JOptionPane.showMessageDialog(null, "Valor total da nota com desconto de 5%: " +d);
						}
	
	if(r >250 && r <=500){ d = (float) (r-(r*0.10));
	JOptionPane.showMessageDialog(null, "Valor total da nota com desconto de 10%: " +d);
						}
	
	if(r >500){ d = (float) (r-(r*0.15));
	JOptionPane.showMessageDialog(null, "Valor total da nota com desconto de 15%: " +d);
						}
	
	
	}

}
