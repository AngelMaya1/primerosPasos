import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introducce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		String resultado=(edad<18)? "Eres menor de edad":"Eres mayor de edad";
		
		System.out.println(resultado);
		
		entrada.close();

	}

}
