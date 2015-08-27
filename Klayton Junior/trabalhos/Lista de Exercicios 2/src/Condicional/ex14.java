package Condicional;

import javax.swing.JOptionPane;

public class ex14 {
	
public static void main(String[]args){

	
	float sal1 , sal2;
	
	sal1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Salário inicial: R$"));
	
	
	if(sal1==300.0 || sal1<300.0){
		sal2 = (float) (sal1*1.5);
		JOptionPane.showMessageDialog(null, "Seu novo salário é de: R$"+sal2);
	}else if(sal1==500.0 || sal1>300.0 && sal1<500.0){
		sal2 = (float) (sal1*1.4);
		JOptionPane.showMessageDialog(null, "Seu novo salário é de: R$"+sal2);
	}else if(sal1==700.0 || sal1>500.0 && sal1<700){
		sal2 = (float) (sal1*1.3);
		JOptionPane.showMessageDialog(null, "Seu novo salário é de: R$"+sal2);
	}else if(sal1==800.0 || sal1>700 && sal1<800.0){
		sal2 = (float) (sal1*1.2);
		JOptionPane.showMessageDialog(null, "Seu novo salário é de: R$"+sal2);
	}else if(sal1==1000.0 || sal1>800.0 && sal1<1000.0){
		sal2 = (float) (sal1*1.1);
		JOptionPane.showMessageDialog(null, "Seu novo salário é de: R$"+sal2);
	}else{
		sal2 = (float) (sal1*1.05);
		JOptionPane.showMessageDialog(null, "Seu novo salário é de: R$"+sal2);
	}
	
}

}
