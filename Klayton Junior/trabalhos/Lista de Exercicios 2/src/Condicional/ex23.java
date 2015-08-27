package Condicional;

import javax.swing.JOptionPane;

public class ex23 {
	
public static void main(String[]args){
	
	int c , q;
	float p1 , pt , d , pf;
	
	c = Integer.parseInt(JOptionPane.showInputDialog(null,"Código do produto comprado"
			+ "\n Sendo de 1 a 40"));
	q = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade comprada do produto"));
	
	if((c==1 || c==10) || (c>1 && c<10)){
		p1=(float) (10.0);
		pt=(float) (q*p1);		
	if(pt==250.0 || pt<250.0){
		d = (float) (pt*0.05);
		pf = (float) (pt-d);
		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
				+"\n O preço total da nota é R$"+pt
				+"\n O valor do desconto é R$"+d
				+"\n O preço final da nota depois do desconto é R$"+pf);
	}if(pt==500.0 || pt>250.0 && pt<500.0){
		d = (float) (pt*0.1);
		pf = (float) (pt-d);
		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
				+"\n O preço total da nota é R$"+pt
				+"\n O valor do desconto é R$"+d
				+"\n O preço final da nota depois do desconto é R$"+pf);
	}if(pt>500.0){
		d = (float) (pt*0.15);
		pf = (float) (pt-d);
		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
				+"\n O preço total da nota é R$"+pt
				+"\n O valor do desconto é R$"+d
				+"\n O preço final da nota depois do desconto é R$"+pf);
	}
	
    }if(c==11 || c==20 || c>11 && c<20){
    	p1 =(float) (15.0);
    	pt = (float) (q*p1);
    	if(pt==250.0 || pt<250.0){
    		d = (float) (pt*0.05);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}if(pt==500.0 || pt>250.0 && pt<500.0){
    		d = (float) (pt*0.1);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}if(pt>500.0){
    		d = (float) (pt*0.15);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}
    }if(c==21 || c==30 || c>21 && c<30){
    	p1 = (float)(20.0);
    	pt = (float)(q*p1);
    	if(pt==250.0 || pt<250.0){
    		d = (float) (pt*0.05);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}if(pt==500.0 || pt>250.0 && pt<500.0){
    		d = (float) (pt*0.1);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}if(pt>500.0){
    		d = (float) (pt*0.15);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}
    }if(c==31 || c==40 || c<40 && c>31){
    	p1 = (float)(30.0);
    	pt = (float)(q*p1);
    	if(pt==250.0 || pt<250.0){
    		d = (float) (pt*0.05);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}if(pt==500.0 || pt>250.0 && pt<500.0){
    		d = (float) (pt*0.1);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}if(pt>500.0){
    		d = (float) (pt*0.15);
    		pf = (float) (pt-d);
    		JOptionPane.showMessageDialog(null,"O preço unitário do produto é R$"+p1
    				+"\n O preço total da nota é R$"+pt
    				+"\n O valor do desconto é R$"+d
    				+"\n O preço final da nota depois do desconto é R$"+pf);
    	}
    }

}
}