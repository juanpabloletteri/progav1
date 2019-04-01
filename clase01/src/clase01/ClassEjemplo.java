package clase01;

public class ClassEjemplo {

	public int numero = 1; //atributo siempre con primera letra en minuscula
	public String nombre = "Juan";
	private int nroPrivado;
	public ClassEjemplo() {
		//constructor por defecto. No es necesario definirlo
		
	}
	
	
	//sobreescribir: Con llamarlo igual que el metodo ya lo estamos sobreescribiendo. 
	//Ej, el metodo toString de la clase Object. Igual se pone el @Override para que se sepa que estamos sobreescribiendo
	
	@Override
	public String toString() {
		//return "To string: NUMERO: " +this.numero;
		return super.toString(); //esto devueleve la ruta donde esta el archivo. con el id del objeto que se guarda java para saber donde ir a buscar las cosas. Pero nunca t muestra el espacio de memoria.
		//super hace referencia a la clase padre.
	}
	
	@Override
	public boolean equals(Object o) {
		if(o != null) {
			//if(o instanceof ClassEjemplo) //instanceof es igual que typeof, es para corroborar que es del mismo tipo que la clase. este igual no se usa. Se usa lo siguiente
			if(o.getClass().equals(this.getClass()) ) {
				//ahora como o es de tipo objeto, hay que castearlo para poder comparar los atributos
				ClassEjemplo cl = (ClassEjemplo) o;
				if(cl.nombre.equals(this.nombre) && cl.numero == this.numero) {
					return true;
				}
				
			}
		}
		else {
			return false;
		}
		return false;
	}
	//cuando se sobreescribe el metodo equals, OBLIGATORIAMENTE hay que sobreescribir el metodo hashCode
	//el metodo haschode no recibe parametros y retorna un valor entero
	@Override
	public int hashCode() {
		//		hascCode lo usa Java para guardar el objeto en la memoria ram
		//el hashCode es el nro que usara Java para ubicarlo en una posicion de memoria
		//si dos objetos son muy parecidos, tienen que intentar que los nros esos sean muy difrentes para que los ubique en slots bien separados (en posiciones de memoria bein diferentes) porque depsues cuando los va a querer recuperar , si esta uno al lado del otro, tarda mas
		//para poder lograr esto se hace lo siguiente.
		int primo = 31;
		int resultado = 1;
		resultado = primo * this.numero;
		resultado = resultado + primo * nombre.hashCode();
	
		return resultado;
	}
	
	
	//tipos de atributos primitivos (int- boolean)--tipos de datos que se guardas en la memoria ram heap. Int por defecto tiene un valor 0. y boolean por defecto es false
	//nombres de atributos siempre en minuscula.
	//y tipos de datos por referencias (objetos) puede tener 2 tipos de valores, un null, o una referencia (un puntero)
	// (int puede ser un solo valor, un nro)
	// String es en mayusc poruqe es una clase. (con minuscula es primitivo) Almacena un null por default. y luego guarda una referencia a un objeto que es un array de char
	
	
	//POJO > Clase plana, con atributos no primitivos, getter y setter 

}
