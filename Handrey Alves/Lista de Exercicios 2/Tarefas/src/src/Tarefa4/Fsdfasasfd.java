package src.Tarefa4;
import javax.swing.JOptionPane;
public class Fsdfasasfd {
public static void main(String[]args){
	
	float n, n2, n3;
	
	n = Float.parseFloat(JOptionPane.showInputDialog(null,"numero 1"));
	n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"numero 2"));
	n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"numero 3"));

    if (n > n2 && n > n3){
    JOptionPane.showMessageDialog(null, "o maior é "+n );
    
    }else if (n2 > n && n2 > n3){
    JOptionPane.showMessageDialog(null, "o maior é "+n2);
    
    }else{
    	JOptionPane.showMessageDialog(null, "o maior é "+n3);
    

}
	
	
	
}

}
