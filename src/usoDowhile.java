import java.util.Scanner;

public class usoDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int numeroAleatorio=(int)(Math.random()*100);
		
		int intentos=0;
		
		int numeroUno=numeroAleatorio;
		
		int numeroDos=0;
		
		do {
			intentos++;
		    
			System.out.println("Introduce un numero del 0 al 99");
			
			numeroDos=entrada.nextInt();
			
			if(numeroDos<numeroUno)System.out.println("El numero ingresado es menor");
			
			else if(numeroDos>numeroUno)System.out.println("El numero ingresado es mayor");
		
		} while(numeroUno!=numeroDos);
					
		System.out.println("Bravo adivinastes el numero");
		
		System.out.println("Te a tomado " + intentos + " intentos para adivinar el numero");
		
		entrada.close();
	}

}
