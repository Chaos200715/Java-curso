package retorno_valor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transporte t =new transporte(5000);
		
		int valor = 0;
		valor = t.precio();
		
		System.out.println("el valor es " + valor);
	}

}
