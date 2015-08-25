package ex5;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n;
		float n2;
		float n3;
		float n4;
		
		n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero:"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite outro numero:"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a opçao : \n 1-media entre os numeros digitados \n 2-diferença entre o maior pelo menor \n 3-produto entre o numero digitado \n 4-divisao entre o primeiro pelo segundo"));
		
		if(n3 == 1){n4=(n+n2)/2;
			JOptionPane.showMessageDialog(null,"A media entre os numeros é:"+n4);
			}
		else if(n3 == 2 && n>n2){n4=n-n2;
			JOptionPane.showMessageDialog(null,"A diferença entre os numeros"+n4);
		}
		else if(n3 == 2 && n<n2){
			JOptionPane.showMessageDialog(null,"Erro... ");
		}
		else if(n3 == 3){n4=n*n2;
			JOptionPane.showMessageDialog(null,"O produto entre os numeros é: "+n4);
			}
		else{n4=n/n2;
			JOptionPane.showMessageDialog(null,"A divisao entre os numeros é: "+n4);
			}
		}

}
