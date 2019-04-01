package calculadora;

public interface ICalcular {
	public Double Sumar(Number a, Number b);
	public Double Restar(Number a, Number b);
	public Double Multiplicar(Number a, Number b);
	public Double Dividir(Number a, Number b) throws MiException;
}
