import javax.swing.*;
public class EntradaDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre=JOptionPane.showInputDialog("Introducce tu nombre, por favor");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introducce tu edad, por favor"));
		
		System.out.println("te llamas " + nombre + " y el proximo año tendras " + (edad+1) + " años");
	}

}
