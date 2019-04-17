package ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fac = null;
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("juan","letteri",40000,160,"mensual"));
		empleados.add(new Empleado("joana","perez",20000,60,"mensual"));
		empleados.add(new Empleado("laura","mazzeo",30000,120,"porHora"));
	}

}
