import java.math.BigInteger;

import javax.swing.JOptionPane;

public class ejercicioPractico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger resultado=BigInteger.ONE;
		
		//long resultado=1;

		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introducce un numero"));
		
		for(int i=numero;i>0;i--) resultado = resultado.multiply(BigInteger.valueOf(i));

			System.out.println("El factorial de " + numero + " es " + resultado);
	}

}

