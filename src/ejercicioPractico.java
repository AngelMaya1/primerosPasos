import javax.swing.JOptionPane;

public class ejercicioPractico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroAleatorio=(int)(Math.random()*100)+1;
		
		int intentos=0;
		
		int numeroUno=numeroAleatorio;
		
		int numeroDos=0;
		
		while(numeroUno!=numeroDos) {
		
			intentos++;
			
			numeroDos=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 100"));
			
			if(numeroDos<numeroUno)System.out.println("El numero ingresado es menor");
			
			else if(numeroDos>numeroUno)System.out.println("El numero ingresado es mayor");
		}
		
		System.out.println("Bravo adivinastes el numero");
		
		System.out.println("Te a tomado " + intentos + " intentos para adivinar el numero");
	}

}
