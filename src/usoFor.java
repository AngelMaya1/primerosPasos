import javax.swing.JOptionPane;

public class usoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=0; i<10; i++) {
			
			System.out.println("Angel");
		}*/
		
		String mail=JOptionPane.showInputDialog("Introducce un mail");
		
		int arroba=0;
		
		boolean punto=false;
		
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@') arroba++;
			
			if(mail.charAt(i)=='.') punto=true;
			
		}
		
		if(arroba==1 && punto==true) System.out.println("mail valido");
		
		else System.out.println("mail incorrecto");
	}

}
