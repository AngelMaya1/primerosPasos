import javax.swing.JOptionPane;

public class ejercicioPractico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mi forma de hacerlo
		
		int altura=0;
		
		String primerGenero="H";
		
		String segundoGenero="M";
		
		String genero="";
		
		altura=Integer.parseInt(JOptionPane.showInputDialog("Introducce tu altura en cm"));
		
		while(genero.equalsIgnoreCase(primerGenero)==false 
				&& genero.equalsIgnoreCase(segundoGenero)==false) {

		genero=JOptionPane.showInputDialog("Introducce tu genero (H/M)");
		
		if(genero.equalsIgnoreCase(primerGenero)) {
			
			int pesoIdealM=altura-110;
			
			System.out.println("tu peso ideal es " + pesoIdealM + "kg" );
			
		}
		
			else if(genero.equalsIgnoreCase(segundoGenero)) {
			
			int pesoIdealF=altura-120;
			
			System.out.println("tu peso ideal es " + pesoIdealF + "kg" );
			
		}
		
		}
		
		//otra forma  de hacerlo:
		String Genero="";
		do {
			Genero=JOptionPane.showInputDialog("Introducce tu genero (H/M)");
			
		}while(genero.equalsIgnoreCase(primerGenero)==false 
				&& genero.equalsIgnoreCase(segundoGenero)==false);
		
		int Altura=Integer.parseInt(JOptionPane.showInputDialog("Introducce tu altura en cm"));
		int pesoIdeal=0;
		if(genero.equalsIgnoreCase("H")) pesoIdeal=Altura-110;
		else if (genero.equalsIgnoreCase("M")) pesoIdeal=Altura-120;
		System.out.println("tu peso ideal es " + pesoIdeal + "kg");
		
	}

}
