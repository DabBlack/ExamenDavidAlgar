package prueba1;

import javax.swing.JOptionPane;

public class suma {

	public static void main(String[] args) {
		int num1, num2, suma;
		
		String str = JOptionPane.showInputDialog("Introduzca un número:");
		num1 = Integer.parseInt(str); 
		
		str = JOptionPane.showInputDialog("Introduzca un segundo número");
		num2 = Integer.parseInt(str);
		
		suma = (num1 + num2);
		
		System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + suma);
	}

}
