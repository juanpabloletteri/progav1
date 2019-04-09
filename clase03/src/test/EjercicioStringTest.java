package test;

import org.junit.Assert;
import org.junit.Test;

import clase.EjercicioString;

	
	public class EjercicioStringTest {
		
		@Test
		public void contarCantidadOK(){
			EjercicioString ej = new EjercicioString();
			String input = "hola";
			int resultado = ej.devolverLong(input);
			Assert.assertEquals(4,resultado);
		}
		
	
	
}
