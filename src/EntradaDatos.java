import java.util.Scanner;
public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introducce tu nombre, por favor");
		
		String nombreUsuario=entrada.nextLine();
		
		System.out.println("Hola " + nombreUsuario);
		
		System.out.println("introduce tu edad, por favor");		
		
		int edad=entrada.nextInt();
		
		System.out.println("tienes " + edad + " de edad");
		
		entrada.close();
		
	}

}
