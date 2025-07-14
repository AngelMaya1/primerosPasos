import java.util.*;
public class CondicionalIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introducce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		if(edad<=18) System.out.println("Eres muy joven");	
		
		else if(edad<=35) System.out.println("Eres joven");	
		
		else if(edad<=70) System.out.println("Eres adulto");	
		
		else if(edad<=90) System.out.println("Eres anciano");	
		
		else System.out.println("Eres un cadaver");
		
		entrada.close();
	}
	

}
