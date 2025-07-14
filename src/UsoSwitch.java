import java.util.Scanner;

public class UsoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introducce el dia de la semana");
		
		String diaSemana=entrada.nextLine();
		
		String resultado=switch(diaSemana) {
		
		case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> "Laboral";
		case "Sabado", "Domingo" -> "Festivo";
		
		default ->{
				System.out.println("Procesando...");
				yield "Error";
		           }
		};
		
		System.out.println(resultado);
		
		entrada.close();
		
		

	}

}
