package clase01;

public class ClassEjemploMain {

public String nombre = "Juan";
	
	public void setNombre(String n) {
		System.out.println("1 HOLA MUNDO!");
		System.out.println(n);
		
		this.nombre = n;
		System.out.println(n);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public static void main(String[] args) {
		ClassEjemplo cl = new ClassEjemplo();
		ClassEjemplo c2 = new ClassEjemplo();
		
		cl.nombre = "Pedro";
		c2.nombre = "pedro";
		cl.numero = 2;
		c2.numero = 2;
		//cl = null;
		
		if(cl.equals(c2)) {
			System.out.println(cl.nombre.hashCode());
			System.out.println(c2.nombre.hashCode());
		
			System.out.println("LOS OBJETOS SON IGUALES");
		} else {
			System.out.println(cl.nombre.hashCode());
			System.out.println(c2.nombre.hashCode());
		
			System.out.println("LOS OBJETOS SON DISTINTOS");
		}
		
		if(cl == c2) {
			//System.out.println("TRUE");
			
			// "Matias".equals(this.nombre) >> Siempre se debe poner la constante (matias) del lado izq, porque nunca va a fallar. En cambio this.nombre podria ser null y si le hacemos un .equals tiraria un exception null pointer 
			
			//esto dara false porque cada uno apunta a diferentes espacios de memoria
			//para que de true, hay que hacer c1 = c2, para que apunten a la misma referencia. Siempre se pasa la referencia, no se le puede pasar los valores de un objeto a otro
			//Luego de hacer eso, si edito uno se va a editar el otro
		}
		else {
			//System.out.println("Antes");
			
			///System.out.println("FALSE");
		}
		cl = c2;
		if(cl == c2) {
		//	System.out.println("despues");
		//	System.out.println("TRUE");
			
			//esto dara false porque cada uno apunta a diferentes espacios de memoria
			//para que de true, hay que hacer c1 = c2, para que apunten a la misma referencia. Siempre se pasa la referencia, no se le puede pasar los valores de un objeto a otro
			//Luego de hacer eso, si edito uno se va a editar el otro
		}
		else {
			System.out.println("FALSE");
		}
		// TODO Auto-generated method stub
		//en java todos los metodos heredan de la clase object. Si hago c. me tira todos los metodos que tiene esta clase.
		//los metodos siempre van en minuscula
		
		//por proyecto se puede tener solo un main. que es el proceso prncipal. Si hago play, lo que corre es el metodo main
		
		if (cl.numero == c2.numero) {
			System.out.println("NUMERO SON IGUALES");
			cl.numero = 5;
			c2.numero = 8;
			//System.out.println(cl.numero);
			//System.out.println(c2.numero);
			//System.out.println(cl.toString());
			
		}
		else { 
			//System.out.println("NUMERO NO SON IGUALES");
		}
		// en atributos de tipo de referencia, los valores se comparan con el metodo equal (de la clase object) (si usamos == comparar� la referencia, no el valor)
		
		//cl.equals(c2) > no sabe como compararlos, asi que compara la direecion de memoria (los ids de la ubic de memoria)
		//por esto el metodo equals hay que sobreescribirla (overrida)
	}	
}
