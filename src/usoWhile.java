import javax.swing.JOptionPane;

public class usoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Maya";
		
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce tu contraseña");
			
			if(clave.equals(pass)==false) System.out.println("Contraseña incorrecta");
		}
		
		System.out.println("Acceso permitido");
		
	}

}
