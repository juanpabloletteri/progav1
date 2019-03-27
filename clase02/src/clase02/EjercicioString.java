package clase02;

import java.util.Scanner;  // Import the Scanner class

public class EjercicioString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Ingreso:");

	    String texto = sc.nextLine();  // Read user input
	    System.out.println("Palabra ingresada: " + texto);  // Output user input 
	    
	    System.out.println("Cantidad de caracteres: " + texto.length());  // Output user input 
	    
	    System.out.println("Mitad: " + texto.substring(0, texto.length()/2));  // Output user input 
	    
	    System.out.println("Ultimo caracter: " + texto.charAt(texto.length()-1) );  // Output user input 
	    
	    String nuevoTexto="";
	    for(int i=texto.length()-1; i>=0; i--){
	    	nuevoTexto=nuevoTexto+texto.charAt(i);
	    }
	    System.out.println("Inverso: " + nuevoTexto);  // Output user input 
	    
	    nuevoTexto="";
	    for(int i=0; i<texto.length(); i++){
	    		nuevoTexto=nuevoTexto+texto.charAt(i)+"-";
	    }
	    nuevoTexto=nuevoTexto.substring(0,nuevoTexto.length()-1);
	    
	    System.out.println("Separado por guiones: " + nuevoTexto);  // Output user input 
	    
	    //FUNCIONES: CONCAT - SPLIT - REPLACEALL
	    Integer num;
	    Character letra;

	}

}
