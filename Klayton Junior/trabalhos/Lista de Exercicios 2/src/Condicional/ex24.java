package Condicional;

import javax.swing.JOptionPane;

public class ex24 {
	
public static void main(String[]args){	

	
	int c, sit;
	float p1 , pa , i , np;
		
	p1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Pre�o do produto"));
	c = Integer.parseInt(JOptionPane.showInputDialog(null,"1-Limpeza"
			+ "\n 2-Alimenta��o"
			+ "\n 3-Vestu�rio"
			+ "\n Categoria:"));
	sit = Integer.parseInt(JOptionPane.showInputDialog(null,"4-Produtos que necessecitam de refrigera��o"
			+ "\n 5-Produtos que n�o necessitam de refrigera��o"
			+ "\n Situa�ao:"));
	
	
	if((p1==25 || p1<25) && c==1 && sit==4){
		pa = (float) (p1*1.05);
		i = (float) (p1*0.05);
	    np = (float) (pa-i);  
	  if(np==50.0 || np<50.0){
		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
		  		+ "\n O imposto � de R$"+i
		  		+ "\n O novo pre�o � R$"+np
		  		+ "\n O produto � classificado como: Barato");
	  }if(np>50.0 && np<120.0){
		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
		  		+ "\n O imposto � de R$"+i
		  		+ "\n O novo pre�o � R$"+np
		  		+ "\n O produto � classificado como: Normal");
	  }if(np==120.0 || np>120.0){
		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
			  		+ "\n O imposto � de R$"+i
			  		+ "\n O novo pre�o � R$"+np
		  		+ "\n O produto � classificado como: Caro");
	  }
	
	}if((p1==25 || p1<25) && c==1 && sit==5){
		pa = (float) (p1*1.05);
		i = (float) (p1*0.08);
	    np = (float) (pa-i);  
	  if(np==50.0 || np<50.0){
		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
			  		+ "\n O imposto � de R$"+i
			  		+ "\n O novo pre�o � R$"+np
		  		+ "\n O produto � classificado como: Barato");
	  }if(np>50.0 && np<120.0){
		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
			  		+ "\n O imposto � de R$"+i
			  		+ "\n O novo pre�o � R$"+np
		  		+ "\n O produto � classificado como: Normal");
	  }if(np==120.0 || np>120.0){
		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
			  		+ "\n O imposto � de R$"+i
			  		+ "\n O novo pre�o � R$"+np
		  		+ "\n O produto � classificado como: Caro");
	  }
	
	
     }if((p1==25 || p1<25) && c==2){
    	 pa = (float) (p1*1.08);
    	 i = (float) (p1*0.05);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if((p1==25 || p1<25) && c==3 && sit==4){
    	 pa = (float) (p1*1.1);
    	 i = (float) (p1*0.05);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if((p1==25 || p1<25) && c==3 && sit==5){
    	 pa = (float) (p1*1.1);
    	 i = (float) (p1*0.08);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if(p1>25 && c==1 && sit==4){
    	 pa = (float) (p1*1.12);
    	 i = (float) (p1*0.05);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if(p1>25 && c==1 && sit==5){
    	 pa = (float) (p1*1.12);
    	 i = (float) (p1*0.08);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if(p1>25 && c==2){
    	 pa = (float) (p1*1.15);
    	 i = (float) (p1*0.05);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if(p1>25 && c==3 && sit==4){
    	 pa = (float) (p1*1.18);
    	 i = (float) (p1*0.05);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }if(p1>25 && c==3 && sit==5){
    	 pa = (float) (p1*1.18);
    	 i = (float) (p1*0.08);
    	 np = (float) (pa-i);
    	 if(np==50.0 || np<50.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Barato");
   	  }if(np>50.0 && np<120.0){
   		  JOptionPane.showMessageDialog(null, "O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Normal");
   	  }if(np==120.0 || np>120.0){
   		  JOptionPane.showMessageDialog(null,"O valor do aumento R$"+(pa-p1)
  		  		+ "\n O imposto � de R$"+i
  		  		+ "\n O novo pre�o � R$"+np
   		  		+ "\n O produto � classificado como: Caro");
   	  }
     }
}
}