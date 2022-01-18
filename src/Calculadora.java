public class Calculadora {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		calculadora.suma(50.25, 20);
		calculadora.potencia(4, 3);

	}
	
	public void suma(double x, double y) {
		System.out.println("El resultado de la suma es " + (x + y));
	}

	public void potencia(double x, double y) {
		System.out.println("El resultado de la potencia es " + Math.pow(x, y));
	}
	
	public void raiz(double n) {
		System.out.println("La raíz cuadrada de " + n + " es: " + Math.sqrt(n));
	}
}
