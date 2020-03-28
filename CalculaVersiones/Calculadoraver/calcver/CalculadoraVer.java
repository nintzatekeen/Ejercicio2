package calcver;

public class CalculadoraVer {
	int param1;
	int param2;
	public CalculadoraVer(int param1, int param2) {
		this.param1=param1;
		this.param2=param2;
	}
	public int suma() {
		//comentario
		return param1+param2;
	}
	public int restar() {
		return param1-param2;
	}
	public int multiplicar() {
		return param1*param2;
	}
	public int dividir() {
		return param1/param2;
	}
	public static void main(String[] args) {
		System.out.println("hola");
	}
}
