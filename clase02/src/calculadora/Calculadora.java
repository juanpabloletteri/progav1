package calculadora;

import java.util.Scanner;

public class Calculadora implements ICalcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("1-Sumar");
	    System.out.println("2-Restar");
	    System.out.println("3-Multiplicar");
	    System.out.println("4-Dividir");
	    System.out.println("Elija operacion:");
	    Integer opcion =  Integer.parseInt(sc.nextLine()) ;  // Read user input
	    
	    System.out.println("Ingrese primer numero:");
	    Double numero1 = Double.parseDouble(sc.nextLine());
	    System.out.println("Ingrese segundo numero:");
	    Double numero2 = Double.parseDouble(sc.nextLine());
	    //FIXME
	    /*if(opcion !=1 || opcion!=2 || opcion!=3 || opcion!=4){
	    	System.out.println("Elija una opcion valida");
	    }
	    else{*/
	     // }	
	    	switch(opcion) {
	    	  case 1:
	    		  System.out.println("Resultado de la suma: " + (numero1 + numero2));
	    	    break;
	    	  case 2:
	    		  System.out.println("Resultado de la resta: " + (numero1 - numero2));
	    	    break;
	    	  case 3:
	    		  System.out.println("Resultado de la multiplicacion: " + (numero1 * numero2));
	    	    break;
	    	  case 4:
	    		  System.out.println("Resultado de la division: " + (numero1 / numero2));
	    	    break;
	    	  default:
	    	    // code block
	    	}
	    	

	    	
	}

	@Override
	public Double Sumar(Number a, Number b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double Restar(Number a, Number b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double Multiplicar(Number a, Number b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double Dividir(Number a, Number b) throws MiException {
		// TODO Auto-generated method stub
		if(b.equals(0)){
			throw new MiException("No se puede dividir por cero");
		}
		else{

		}
		return null;
	}

}
